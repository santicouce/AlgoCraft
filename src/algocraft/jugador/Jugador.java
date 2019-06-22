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
    private HashMap<String, List<Material>> Inventario = new HashMap<String, List<Material>>();

    public Jugador(){
        Hacha hacha = new Hacha(new Madera());
        estrategiaDeGolpe = new EstrategiaDeGolpeConHerramienta(hacha);
        nombre = "steve";
        mesaDeConstruccion = new MesaDeConstruccion(inventario);
        Inventario.put("madera", new ArrayList<Material>());
        Inventario.put("piedra", new ArrayList<Material>());
        Inventario.put("metal", new ArrayList<Material>());
        Inventario.put("diamante", new ArrayList<Material>());
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

    public void agregarHerramientaAlInventario(Herramienta herramienta) {
        inventario.aniadirHerramienta(herramienta);
    }

    @Override
    public String darNombre(){
        return (nombre + ubicacion.frente() + estrategiaDeGolpe.herramienta());
    }

    public String getId(){
        //esto tiene que desaparecer
        return "a";
    }

    public void aniadirMaderaEnPosicion(int columna, int fila){
        mesaDeConstruccion.aniadirMaderaEnPosicion(columna,fila);
    }

    public void aniadirMetalEnPosicion(int columna, int fila) {
        mesaDeConstruccion.aniadirMetalEnPosicion(columna,fila);
    }
    public void aniadirPiedraEnPosicion(int columna, int fila) {
        mesaDeConstruccion.aniadirPiedraEnPosicion(columna,fila);
    }
    public void fabricarHacha(MaterialDeConstruccion unMaterial){
        if (mesaDeConstruccion.crearUnHacha(unMaterial)==false){
            throw new ImposibleCrearHerramientaError();
        }else{
            agregarHerramientaAlInventario(new Hacha(unMaterial));
        }
    }
    public void fabricarPico(MaterialDeConstruccion unMaterial){
        if (mesaDeConstruccion.crearUnPico(unMaterial)==false){
            throw new ImposibleCrearHerramientaError();
        }else{
            agregarHerramientaAlInventario(new Pico(unMaterial));
        }
    }

    public void fabricarPicoFino() {
        if (mesaDeConstruccion.crearUnPicoFino()==false){
            throw new ImposibleCrearHerramientaError();
        }else{
            agregarHerramientaAlInventario(new PicoFino(new Metal(), new Piedra()));
        }
    }

    public void agregarMaterialAlInventario(String nombreDelMaterial, Material materialASerAgregado){
        Inventario.get(nombreDelMaterial).add(materialASerAgregado);
    }

    public Material extraerMaterialDelInventario(String nombreDelMaterial){
        return Inventario.get(nombreDelMaterial).get(0);
    }
    public boolean validarStockDe(String nombreDelMaterial){
        if (Inventario.get(nombreDelMaterial).isEmpty()) { return false; }
        return true;
    }

    public int cantidadDe(String nombreDelMaterial){
        return Inventario.get(nombreDelMaterial).size();
    }
}
