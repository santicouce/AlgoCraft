package AlgoCraft;

public class Casillero {

    private EstadoCasillero estado;
    private Material material;

    public Casillero(){
        estado = new CasilleroLibre();
    }
    public void aniadirElemento(Material unMaterial){
        estado.validarAgregacion();
        material = unMaterial;
        estado = new CasilleroOcupado();
    }
}
 
