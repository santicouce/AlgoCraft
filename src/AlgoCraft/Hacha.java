package AlgoCraft;

public class Hacha extends Herramienta {

    public Hacha(MaterialDeConstruccion unMaterial){
        this.material = unMaterial;
        this.durabilidad = unMaterial.durabilidadDeConstruccion(this);
        this.fuerza = unMaterial.fuerzaDeConstruccion(this);
        this.desgaste = unMaterial.desgasteDeConstruccion(this);
    }

    public void golpear(Material material) {
        durabilidad = desgaste.desgastarDada(durabilidad, fuerza);
    }

    @Override
    public boolean esUnHacha() {
        return true;
    }

    @Override
    public boolean esUnPico() {
        return false;
    }

    @Override
    public boolean esUnPicoFino() {
        return false;
    }
}
