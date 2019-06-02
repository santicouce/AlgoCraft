package Objetos;

public class Hacha{
    private int durabilidad;
    private int fuerza;

    private Material material;

    public Hacha(Madera madera){
        durabilidad = 100;
        fuerza = 2;
    }

    public Hacha (Piedra piedra){
        durabilidad = 200;
        fuerza = 5;
    }

    public Hacha (Metal metal){
        durabilidad = 400;
        fuerza = 10;
    }

    public int durabilidad() {
        return durabilidad;
    }

    public int fuerza(){
        return fuerza;
    }
}
