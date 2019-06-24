package algocraft.materiales;

import algocraft.jugador.Jugador;
import algocraft.mapadejuego.Mapa;
import algocraft.vidadeobjetos.FortalezaHerramienta;
import algocraft.Observable;
import algocraft.herramientas.PicoFino;

public abstract class Material extends Observable {

    protected int durabilidad;
    String id = new String();

    public int durabilidad(){
        return this.durabilidad;
    }
    public String getId(){
        return id;
    }

    public void daniadoCon(FortalezaHerramienta fuerzaHerramienta){
        durabilidad = fuerzaHerramienta.daniar(durabilidad);
    }
    public abstract void golpeadoCon(FortalezaHerramienta fortalezaHerramienta);
    public abstract void impactadoCon(PicoFino picoFino);
    public boolean seRompio(){
        if (this.durabilidad <= 0){ return true;}
        return false;
    }
/*    public void eliminarse(Mapa mapa, Jugador jugador){
        mapa.eliminarElementoDelMapa(this.ubicacion);
    }

 */
}
