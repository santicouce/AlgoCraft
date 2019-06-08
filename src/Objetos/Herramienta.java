package Objetos;

public abstract class Herramienta {

    protected Material material;
    protected int durabilidad;
    protected int fuerza;
    protected Desgaste desgaste;
    protected Duracion duracion;

    public int durabilidad() {
        return this.durabilidad;
    }
    public int fuerza(){
        return this.fuerza;
    }
    public abstract void golpear(Material material);
    public void rompete(){durabilidad = 0;}
}
