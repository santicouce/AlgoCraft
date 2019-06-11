package AlgoCraft;

public class Piedra extends MaterialDeConstruccion{
    public Piedra (){
        this.durabilidad =30;
    }

    @Override
    public EstrategiaDeConstruccion estrategiaDeConstruccion() {
        return (new EstrategiaDeConstruccionPiedra());
    }

    @Override
    public void daniar(Pico unPico, Metal unmetal) {
        unmetal.serGolpeadaPor(unPico);
    }

    @Override
    public void daniar(PicoFino unPicoFino) {
        //UNA PIEDRA NO PUEDE DANIAR UN PICO FINO
    }
}
