package Objetos;

public class PicoFino {

    private Material material;

    private int durabilidad;
    private int fuerza=20;

    public PicoFino(Metal metal){
        material = metal;
        durabilidad =1000;
    }
    public PicoFino(Piedra piedra){
        material = piedra;
        durabilidad =1000;
    }

    public int durabilidad() {
        return durabilidad;
    }

    public int fuerza() {
        return fuerza;
    }
}
