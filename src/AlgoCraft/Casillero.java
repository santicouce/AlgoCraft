package AlgoCraft;

public class Casillero {

    private EstadoCasillero estado;
    private Colocable colocable;

    public Casillero(){
        estado = new CasilleroLibre();
    }
    public void aniadirElemento(Colocable colocable){
        estado.validarAgregacion();
        this.colocable = colocable;
        estado = new CasilleroOcupado();
    }
}
 
