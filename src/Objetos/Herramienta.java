package Objetos;

public abstract class Herramienta {

    protected Material material;
    protected int durabilidad;
    protected int fuerza;
    protected Desgaste desgaste;
    public int durabilidad() {
        return this.durabilidad;
    }

    public int fuerza(){
        return this.fuerza;
    }

    public abstract void golpear(Material material);
}
