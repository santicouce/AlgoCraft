package Objetos;

public class Pico extends Herramienta {


    public Pico(Madera madera){
        this.material = madera;
        this.durabilidad = 100;
        this.fuerza = 2;
    }

    public Pico (Piedra piedra){
        this.material = piedra;
        this.durabilidad = 200;
        this.fuerza = 4;
    }

    public Pico (Metal metal){
        this.material = metal;
        this.durabilidad = 400;
        this.fuerza = 12;
    }

}
