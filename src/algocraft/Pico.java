package algocraft;

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
    public void daniar(Madera madera) {
        //UN PICO NO DANIA MADERA
    }

    @Override
    public void daniar(Diamante diamante) {
        //UN PICO NO DANIA DIAMANTE
    }

    @Override
    public void daniar(Piedra piedra) {
        piedra.serGolpeadaPor(this);
    }

    @Override
    public void daniar(Metal metal) {
        material.daniar(this, metal);
    }

}
