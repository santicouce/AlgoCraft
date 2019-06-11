package AlgoCraft;

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
}