package Objetos;

public class Pico extends Herramienta {


    public Pico(Madera madera){
        setMaterial(madera);
        setDurabilidad(100);
        setFuerza(2);
    }

    public Pico (Piedra piedra){
        setMaterial(piedra);
        setDurabilidad(200);
        setFuerza(4);
    }

    public Pico (Metal metal){
        setMaterial(metal);
        setDurabilidad(400);
        setFuerza(12);
    }

}
