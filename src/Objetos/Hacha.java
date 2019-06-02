package Objetos;

public class Hacha extends Herramienta{


    public Hacha(Madera madera){
        this.material = madera;
        this.durabilidad = 100;
        this.fuerza = 2;
    }

    public Hacha (Piedra piedra){
        this.material = piedra;
        this.durabilidad = 200;
        this.fuerza = 5;
    }

    public Hacha (Metal metal){
        this.material = metal;
        this.durabilidad = 400;
        this.fuerza = 10;
    }

    public void golpear(Madera madera) {
        int durabilidadActual = this.durabilidad();
        int nuevaDurabilidad=durabilidadActual-this.fuerza();
        this.setDurabilidad(nuevaDurabilidad);
    }
}
