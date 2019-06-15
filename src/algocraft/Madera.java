package algocraft;

public class Madera extends MaterialDeConstruccion{
    public Madera (){
        this.durabilidad = 10;
    }

    @Override
    public void daniar(Pico unPico, Metal unmetal) {
        //UN PICO DE MADERA NO PUEDE DANIAR METAL
    }

    @Override
    public void daniar(PicoFino unPicoFino) {
        //UNA MADERA NO PUEDE DANIAR UN PICO FINO
    }
    @Override
    public void inicializar(FortalezaHerramienta fuerzaHerramienta){
        fuerzaHerramienta.inicializate(this);
    }
    @Override
    public void inicializar(AguanteHerramienta durabilidadHerramienta){durabilidadHerramienta.inicializate(this);}

}