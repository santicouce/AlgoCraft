package algocraft.jugador;

import algocraft.Observable;
import algocraft.herramientas.Pico;
import algocraft.herramientas.PicoFino;
import algocraft.materiales.Metal;
import algocraft.materiales.Piedra;
import algocraft.construcciondeherramientas.MesaDeConstruccion;
import algocraft.errores.ImposibleCrearHerramientaError;
import algocraft.herramientas.Pico;
import algocraft.herramientas.PicoFino;
import algocraft.materiales.*;
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
import java.util.Objects;

public class Jugador extends Observable {

    private Inventario inventario = new Inventario();
    private UbicacionJugador ubicacion;
    private EstrategiaDeGolpe estrategiaDeGolpe;
    private MesaDeConstruccion mesaDeConstruccion;
    private HashMap<String, List<Material>> InventarioMateriales = new HashMap<String, List<Material>>();
    private HashMap<String, List<Herramienta>> InventarioHerramientas = new HashMap<String, List<Herramienta>>();

    public Jugador(){
        Hacha hacha = new Hacha(new Madera());
        estrategiaDeGolpe = new EstrategiaDeGolpeConHerramienta(hacha);
        nombre = "steve";
        mesaDeConstruccion = new MesaDeConstruccion(inventario);
        InventarioMateriales.put("madera", new ArrayList<>());
        InventarioMateriales.put("piedra", new ArrayList<>());
        InventarioMateriales.put("metal", new ArrayList<>());
        InventarioMateriales.put("diamante", new ArrayList<>());
        InventarioHerramientas.put("hacha de madera", new ArrayList<>());
        InventarioHerramientas.put("hacha de piedra", new ArrayList<>());
        InventarioHerramientas.put("hacha de metal", new ArrayList<>());
        InventarioHerramientas.put("pico de madera", new ArrayList<>());
        InventarioHerramientas.put("pico de piedra", new ArrayList<>());
        InventarioHerramientas.put("pico de metal", new ArrayList<>());
        InventarioHerramientas.put("pico fino", new ArrayList<>());
    }

    public void golpear(Material unMaterial){
        estrategiaDeGolpe.golpear(unMaterial);
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
        inventario.aniadirHerramienta(herramienta);
        InventarioHerramientas.get(nombreDeLaHerramienta).add(herramienta);
    }

    @Override
    public String darNombre(){
        return (nombre + ubicacion.frente() + estrategiaDeGolpe.herramienta());
    }

    public String getId(){
        //esto tiene que desaparecer
        return "a";
    }

    public void aniadirMaterialEnPosicion(int columna, int fila, String material){
        Material materialPorAgregar = extraerMaterialDelInventario(material);
        mesaDeConstruccion.aniadirElementoEnPosicion(columna, fila, materialPorAgregar);
    }

    public void fabricarHacha(MaterialDeConstruccion unMaterial){
        mesaDeConstruccion.crearUnHacha(unMaterial,InventarioHerramientas);
    }
    public void fabricarPico(MaterialDeConstruccion unMaterial){
        mesaDeConstruccion.crearUnPico(unMaterial,InventarioHerramientas);
    }

    public void fabricarPicoFino() {
        mesaDeConstruccion.crearUnPicoFino(InventarioHerramientas);
    }

    public void agregarMaterialAlInventario(String nombreDelMaterial, Material materialASerAgregado){
        InventarioMateriales.get(nombreDelMaterial).add(materialASerAgregado);
    }

    public Material extraerMaterialDelInventario(String nombreDelMaterial){
        return InventarioMateriales.get(nombreDelMaterial).get(0);
    }
    public boolean validarStockDe(String nombreDelMaterial){
        if (InventarioMateriales.get(nombreDelMaterial).isEmpty()) { return false; }
        return true;
    }

    public int cantidadDeMaterial(String nombreDelMaterial){
        return InventarioMateriales.get(nombreDelMaterial).size();
    }

    public int cantidadDeHerramienta(String nombreDeHerramienta){
        return InventarioHerramientas.get(nombreDeHerramienta).size();
    }

}
