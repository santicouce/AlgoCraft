package algocraft.jugador;

import algocraft.Observable;
import algocraft.movimientoDelJugador.UbicacionJugador;
import algocraft.vidaDeObjetos.EstrategiaDeGolpe;
import algocraft.vidaDeObjetos.EstrategiaDeGolpeConHerramienta;
import algocraft.movimientoDelJugador.Direccion;
import algocraft.errores.MovimientoInvalidoError;
import algocraft.herramientas.Hacha;
import algocraft.herramientas.Herramienta;
import algocraft.materiales.Madera;
import algocraft.materiales.Material;

public class Jugador implements Observable {

    private Inventario inventario = new Inventario();
    private UbicacionJugador ubicacion;
    private EstrategiaDeGolpe estrategiaDeGolpe;

    public Jugador(){
        Hacha hacha = new Hacha(new Madera());
        estrategiaDeGolpe = new EstrategiaDeGolpeConHerramienta(hacha);
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
        try{
            ubicacion.moverJugadorA(this, unaDireccion);
        }catch (MovimientoInvalidoError e){}
    }

    public void equiparHerramienta(Herramienta unaHerramienta){
           estrategiaDeGolpe.equiparHerramienta(this,unaHerramienta);
    }

    public void agregarHerramientaAlInventario(Herramienta herramienta) {
        inventario.aniadirHerramienta(herramienta);
    }
}