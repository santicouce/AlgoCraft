package Objetos;

public class Pico {

    private Material material;
    private int fuerza;
    private int durabilidad;

    public Pico(Madera madera){
        material = madera;
        durabilidad = 100;
        fuerza = 2;
    }

    public Pico (Piedra piedra){
        material = piedra;
        durabilidad = 200;
        fuerza = 4;
    }

    public Pico (Metal metal){
        material = metal;
        durabilidad = 400;
        fuerza = 12;
    }

    public int durabilidad() {
        return durabilidad;
    }

    public int fuerza(){
        return fuerza;
    }
}
