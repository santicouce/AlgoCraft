package Algocraft;

public class Madera extends MaterialDeConstruccion{
    public Madera (){
        this.durabilidad = 10;
    }

    @Override
    public EstrategiaDeConstruccion estrategiaDeConstruccion() {
        return (new EstrategiaDeConstruccionMadera());
    }

    @Override
    public void daniar(Pico unPico, Metal unmetal) {
        //UN PICO DE MADERA NO PUEDE DANIAR METAL
    }

    @Override
    public void daniar(PicoFino unPicoFino) {
        //UNA MADERA NO PUEDE DANIAR UN PICO FINO
    }
}