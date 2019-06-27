package algocraft.jugador;

import algocraft.Observable;
import algocraft.materiales.Metal;
import algocraft.materiales.Piedra;
import algocraft.construcciondeherramientas.MesaDeConstruccion;
import algocraft.movimientodeljugador.UbicacionJugador;
import algocraft.vidadeobjetos.EstrategiaDeGolpe;
import algocraft.vidadeobjetos.EstrategiaDeGolpeConHerramienta;
import algocraft.movimientodeljugador.Direccion;
import algocraft.herramientas.Hacha;
import algocraft.herramientas.Herramienta;
import algocraft.materiales.Madera;
import algocraft.materiales.Material;
import algocraft.vidadeobjetos.EstrategiaDeGolpeSinHerramienta;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Jugador extends Observable {

    private UbicacionJugador ubicacion;
    private EstrategiaDeGolpe estrategiaDeGolpe;
    private MesaDeConstruccion mesaDeConstruccion;
    private HashMap<String, List<Material>> inventarioMateriales = new HashMap<String, List<Material>>();
    private HashMap<String, List<Herramienta>> inventarioHerramientas = new HashMap<String, List<Herramienta>>();

    public Jugador(){
        Hacha hacha = new Hacha(new Madera());
        estrategiaDeGolpe = new EstrategiaDeGolpeConHerramienta(hacha);
        nombre = "steve";
        mesaDeConstruccion = new MesaDeConstruccion();
        inventarioMateriales.put("madera", new ArrayList<>());
        inventarioMateriales.put("piedra", new ArrayList<>());
        inventarioMateriales.put("metal", new ArrayList<>());
        inventarioMateriales.put("diamante", new ArrayList<>());
        inventarioHerramientas.put("hacha de madera", new ArrayList<>());
        inventarioHerramientas.put("hacha de piedra", new ArrayList<>());
        inventarioHerramientas.put("hacha de metal", new ArrayList<>());
        inventarioHerramientas.put("pico de madera", new ArrayList<>());
        inventarioHerramientas.put("pico de piedra", new ArrayList<>());
        inventarioHerramientas.put("pico de metal", new ArrayList<>());
        inventarioHerramientas.put("pico fino", new ArrayList<>());
        agregarMaterialAlInventario("madera", new Madera());
        agregarMaterialAlInventario("madera", new Madera());
        agregarMaterialAlInventario("madera", new Madera());
        agregarMaterialAlInventario("madera", new Madera());
        agregarMaterialAlInventario("madera", new Madera());
        agregarMaterialAlInventario("madera", new Madera());
        agregarMaterialAlInventario("madera", new Madera());
        agregarMaterialAlInventario("piedra", new Piedra());
        agregarMaterialAlInventario("piedra", new Piedra());
        agregarMaterialAlInventario("piedra", new Piedra());
        agregarMaterialAlInventario("piedra", new Piedra());
        agregarMaterialAlInventario("metal", new Metal());
        agregarMaterialAlInventario("metal", new Metal());
        agregarMaterialAlInventario("metal", new Metal());
        agregarMaterialAlInventario("metal", new Metal());
    }

    public void golpear(Material unMaterial){
        estrategiaDeGolpe.golpear(unMaterial);
        if (unMaterial.seRompio()){
            this.agregarMaterialAlInventario(unMaterial.darNombre(),unMaterial);
        }
        if (estrategiaDeGolpe.herramienta().equals("herramienta rota")){
            this.cambiarEstrategia(new EstrategiaDeGolpeSinHerramienta());
        }
    }

    public void cambiarEstrategia(EstrategiaDeGolpe nuevaEstrategia){
        estrategiaDeGolpe=nuevaEstrategia;
    }

    public void desequiparHerramienta(){
        estrategiaDeGolpe.desequiparHerramienta(this);
    }

    public void aniadirJugadorAlMapa(int columna, int fila){
        ubicacion = new UbicacionJugador(columna, fila);
    }

    public void moverA(Direccion unaDireccion) {
        ubicacion.moverJugadorA(this, unaDireccion);
    }

    public void equiparHerramienta(Herramienta unaHerramienta){
           estrategiaDeGolpe.equiparHerramienta(this,unaHerramienta);
    }

    public void agregarHerramientaAlInventario(String nombreDeLaHerramienta, Herramienta herramienta) {
        inventarioHerramientas.get(nombreDeLaHerramienta).add(herramienta);
    }

    @Override
    public String darNombre(){
        return (nombre + ubicacion.frente() + nombreDeHerramientaEquipada());
    }

    public String nombreDeHerramientaEquipada(){
        return estrategiaDeGolpe.herramienta();
    }

    public String getId(){
        return nombre;
    }

    public void aniadirMaterialEnPosicion(int columna, int fila, String material){
        Material materialPorAgregar = extraerMaterialDelInventario(material);
        mesaDeConstruccion.aniadirElementoEnPosicion(columna, fila, materialPorAgregar);
    }

    public void fabricarUnaHerramienta(){
        mesaDeConstruccion.construir(inventarioHerramientas,inventarioMateriales);
    }


    public void agregarMaterialAlInventario(String nombreDelMaterial, Material materialASerAgregado){
        inventarioMateriales.get(nombreDelMaterial).add(materialASerAgregado);
    }

    public Material extraerMaterialDelInventario(String nombreDelMaterial){
        return inventarioMateriales.get(nombreDelMaterial).remove(0);
    }

    public int cantidadDeMaterial(String nombreDelMaterial){
        return inventarioMateriales.get(nombreDelMaterial).size();
    }

    public int cantidadDeHerramienta(String nombreDeHerramienta){
        return inventarioHerramientas.get(nombreDeHerramienta).size();
    }
    public void limpiarMesaDeConstruccion(){
        mesaDeConstruccion.limpiarMesa(inventarioMateriales);
    }

    public void equiparHerramienta(String nombreDeHerramienta){
        estrategiaDeGolpe.equiparHerramienta(this, inventarioHerramientas.get(nombreDeHerramienta).remove(0));
    }
}
