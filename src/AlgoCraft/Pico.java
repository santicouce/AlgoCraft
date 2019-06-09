package AlgoCraft;

public class Pico extends Herramienta {

    public Pico(MaterialDeConstruccion unMaterial){
        this.material = unMaterial;
        EstrategiaDeConstruccion estrategiaDeConstruccion = unMaterial.estrategiaDeConstruccion();
        this.durabilidad = estrategiaDeConstruccion.durabilidadDeConstruccion(this);
        this.fuerza = estrategiaDeConstruccion.fuerzaDeConstruccion(this);
        this.desgaste = estrategiaDeConstruccion.desgasteDeConstruccion(this);
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
