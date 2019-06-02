package Objetos;

public class Pico {

    private Material material;
    private int fuerza;
    private int durabilidad;

    public Pico(Madera madera){
        material = madera;
    }

    public Pico (Piedra piedra){
        material = piedra;
    }

    public Pico (Metal metal){
        material = metal;
    }

    public int durabilidad() {
        return durabilidad;
    }

    public int fuerza(){
        return fuerza;
    }
}
