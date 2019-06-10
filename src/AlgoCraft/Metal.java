package AlgoCraft;

public class Metal extends MaterialDeConstruccion{
    public Metal ()
    {
        this.durabilidad =50;
    }

    @Override
    public EstrategiaDeConstruccion estrategiaDeConstruccion() {
        return (new EstrategiaDeConstruccionMetal());
    }

    public boolean esUnMetal() {
        return true;
    }

}
