package Objetos;

public class Hacha extends Herramienta{

    public Hacha(Madera madera){
        this.material = madera;
        this.durabilidad = 100;
        this.fuerza = 2;
        this.desgaste = new DesgasteDeFuerza();
    }

    public Hacha (Piedra piedra){
        this.material = piedra;
        this.durabilidad = 200;
        this.fuerza = 5;
        this.desgaste = new DesgasteDeFuerza();
    }

    public Hacha (Metal metal){
        this.material = metal;
        this.durabilidad = 400;
        this.fuerza = 10;
        this.desgaste = new DesgasteMitadDeFuerza();
    }

    @Override
    public void golpear(Material material) {
        durabilidad = desgaste.desgastarDada(durabilidad, fuerza);
    }
}
