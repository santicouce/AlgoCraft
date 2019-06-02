package Objetos;

public class Hacha{

    private Material material;

    public Hacha(Madera madera){
        material = madera;
    }

    public Hacha (Piedra piedra){
        material = piedra;
    }

    public Hacha (Metal metal){
        material = metal;
    }

    public int durabilidad() {
        return material.durabilidad();
    }

    public int fuerza(){
        return material.fuerza();
    }
}
