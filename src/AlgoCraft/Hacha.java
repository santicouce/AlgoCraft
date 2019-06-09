package AlgoCraft;

public class Hacha extends Herramienta {

    public Hacha(MaterialDeConstruccion unMaterial){
        this.material = unMaterial;
        EstrategiaDeConstruccion estrategiaDeConstruccion = unMaterial.estrategiaDeConstruccion();
        this.durabilidad = estrategiaDeConstruccion.durabilidadDeConstruccion(this);
        this.fuerza = estrategiaDeConstruccion.fuerzaDeConstruccion(this);
        this.desgaste = estrategiaDeConstruccion.desgasteDeConstruccion(this);
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
