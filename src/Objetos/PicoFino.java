package Objetos;

public class PicoFino {

    private Material material;
    private int fuerza;

    public PicoFino(Metal metal){
        material = metal;
    }

    public PicoFino(Piedra piedra){
        material = piedra;
    }

    public int fuerza(){
        return fuerza;
    }
}
