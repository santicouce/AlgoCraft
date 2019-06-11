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

    @Override
    public void daniar(Pico unPico, Metal unmetal) {
        //UN PICO DE METAL NO PUEDE DANIAR UN PICO
    }

    @Override
    public void daniar(PicoFino unPicoFino) {
        //UN METAL NO PUEDA DANIAR UN PICO FINO
    }
}
