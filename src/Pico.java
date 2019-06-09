package Objetos;

public class Pico extends Herramienta {


    public Pico(Madera madera){
        this.material = madera;
        this.durabilidad = 100;
        this.fuerza = 2;
        this.desgaste = new DesgasteDeFuerza();
    }

    public Pico (Piedra piedra){
        this.material = piedra;
        this.durabilidad = 200;
        this.fuerza = 4;
        this.desgaste = new DesgasteDeFuerza();
    }

    public Pico (Metal metal){
        this.material = metal;
        this.durabilidad = 400;
        this.fuerza = 12;
        this.desgaste = new DesgasteDeFuerza();
    }

    @Override
    public void golpear(Material material) {
        durabilidad = desgaste.desgastarDada(durabilidad, fuerza);
    }
}
