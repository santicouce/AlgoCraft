package Objetos;

public class PicoFino extends Herramienta{

    private Material material;

    public PicoFino(Metal metal){
        this.durabilidad = 1000;
        this.fuerza = 20;
        this.material = metal;
    }
    public PicoFino(Piedra piedra){
        this.durabilidad = 1000;
        this.fuerza = 20;
        this.material = piedra;
    }

    @Override
    public void golpear(Material material) {

    }
}
