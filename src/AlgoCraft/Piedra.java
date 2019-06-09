package AlgoCraft;

public class Piedra extends MaterialDeConstruccion{
    public Piedra (){
        this.durabilidad =30;
    }

    @Override
    public EstrategiaDeConstruccion estrategiaDeConstruccion() {
        return (new EstrategiaDeConstruccionPiedra());
    }
}
