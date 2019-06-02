package Objetos;

public class Herramienta {

    private Material material;
    private int durabilidad;
    private int fuerza;

    public void setMaterial(Material material){
        this.material = material;
    }

    public void setDurabilidad(int durabilidad) {
        this.durabilidad = durabilidad;
    }

    public void setFuerza(int fuerza){
        this.fuerza = fuerza;
    }

    public int durabilidad() {
        return this.durabilidad;
    }

    public int fuerza(){
        return this.fuerza;
    }

}
