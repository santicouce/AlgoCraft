package Objetos;

public class Pico extends Herramienta {

    public Pico(MaterialDeConstruccion unMaterial){
        this.material = unMaterial;
        this.durabilidad = unMaterial.durabilidadDeConstruccion(this);
        this.fuerza = unMaterial.fuerzaDeConstruccion(this);
        this.desgaste = unMaterial.desgasteDeConstruccion(this);
    }

    @Override
    public void golpear(Material material) {

        durabilidad = desgaste.desgastarDada(durabilidad, fuerza);
    }

    @Override
    public boolean esUnHacha() {
        return false;
    }

    @Override
    public boolean esUnPico() {
        return true;
    }

    @Override
    public boolean esUnPicoFino() {
        return false;
    }
}
