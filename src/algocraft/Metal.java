package algocraft;

public class Metal extends MaterialDeConstruccion{
    public Metal ()
    {
        this.durabilidad =50;
    }

    @Override
    public void daniar(Pico unPico, Metal unmetal) {
        //UN PICO DE METAL NO PUEDE DANIAR UN PICO
    }

    @Override
    public void daniar(PicoFino unPicoFino) {
        //UN METAL NO PUEDA DANIAR UN PICO FINO
    }

    @Override
    public void inicializar(FortalezaHerramienta fuerzaHerramienta){
        fuerzaHerramienta.inicializate(this);
    }
    @Override
    public void inicializar(AguanteHerramienta durabilidadHerramienta){
        durabilidadHerramienta.inicializate(this);
    }
}
