package Objetos;

public class PicoFino extends Herramienta{

    private Material material;

    public PicoFino(Metal metal){
        this.setDurabilidad(1000);
        this.setFuerza(20);
        this.setMaterial(metal);
    }
    public PicoFino(Piedra piedra){
        this.setDurabilidad(1000);
        this.setFuerza(20);
        this.setMaterial(piedra);
    }
}
