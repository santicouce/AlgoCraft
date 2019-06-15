package algocraft.mapaDeJuego;

import algocraft.Observable;

public class Casillero {

    private EstadoCasillero estado;
    private Observable colocable;

    public Casillero(){
        estado = new CasilleroLibre();
    }
    public void aniadirElemento(Observable colocable){
        estado.validarAgregacion();
        this.colocable = colocable;
        estado = new CasilleroOcupado();
    }

    public void eliminarElemento() {
        colocable = null;
        estado = new CasilleroLibre();
    }

}
 
