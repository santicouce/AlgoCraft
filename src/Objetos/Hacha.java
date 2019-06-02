package Objetos;

public class Hacha extends Herramienta{


    public Hacha(Madera madera){
        this.setMaterial(madera);
        this.setDurabilidad(100);
        this.setFuerza(2);
    }

    public Hacha (Piedra piedra){
        this.setMaterial(piedra);
        this.setDurabilidad(200);
        this.setFuerza(5);
    }

    public Hacha (Metal metal){
        this.setMaterial(metal);
        this.setDurabilidad(400);
        this.setFuerza(10);
    }

    public void golpear(Madera madera) {
        int durabilidadActual = this.durabilidad();
        int nuevaDurabilidad=durabilidadActual-this.fuerza();
        this.setDurabilidad(nuevaDurabilidad);
    }
}
