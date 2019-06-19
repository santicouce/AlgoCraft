package algocraft.jugador;

import algocraft.Observable;
import algocraft.herramientas.Pico;
import algocraft.herramientas.PicoFino;
import algocraft.materiales.Metal;
import algocraft.materiales.Piedra;
import algocraft.movimientodeljugador.UbicacionJugador;
import algocraft.vidadeobjetos.EstrategiaDeGolpe;
import algocraft.vidadeobjetos.EstrategiaDeGolpeConHerramienta;
import algocraft.movimientodeljugador.Direccion;
import algocraft.herramientas.Hacha;
import algocraft.herramientas.Herramienta;
import algocraft.materiales.Madera;
import algocraft.materiales.Material;
import algocraft.vidadeobjetos.EstrategiaDeGolpeSinHerramienta;

public class Jugador extends Observable {

    private Inventario inventario = new Inventario();
    private UbicacionJugador ubicacion;
    private EstrategiaDeGolpe estrategiaDeGolpe;

    public Jugador(){
        Hacha hacha = new Hacha(new Madera());
        estrategiaDeGolpe = new EstrategiaDeGolpeConHerramienta(hacha);
        nombre = "steve";
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
}
