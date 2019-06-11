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
    public void daniar(Madera madera) {
        madera.serGolpeadaPor(this);
    }

    @Override
    public void daniar(Diamante diamante) {
        //UN HACHA NO DANIA DIAMANTE
    }

    @Override
    public void daniar(Piedra piedra) {
        //UN HACHA NO DANIA PIEDRA
    }

    @Override
    public void daniar(Metal metal) {
        //UN HACHA DE METAL NO PUEDE DANIAR METAL
    }
}
