package AlgoCraft;

public class PicoFino extends Herramienta{

    private Material material;

    public PicoFino(MaterialDeConstruccion unMaterial){
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
    public void daniar(Madera madera) {
        //UN PICO FINO NO DANIA MADERA
    }

    @Override
    public void daniar(Diamante diamante) {
        diamante.serGolpeadaPor(this);
    }

    @Override
    public void daniar(Piedra piedra) {
        //UN PICO FINO NO DANIA PIEDRA
    }

    @Override
    public void daniar(Metal metal) {
        //UN PICO FINO NO DANIA METAL
    }


}
