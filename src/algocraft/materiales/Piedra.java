package algocraft.materiales;

import algocraft.vidadeobjetos.AguanteHerramienta;
import algocraft.vidadeobjetos.FortalezaHerramienta;
import algocraft.herramientas.Pico;
import algocraft.herramientas.PicoFino;

public class Piedra extends MaterialDeConstruccion{
    public Piedra (){
        this.durabilidad =30;
        this.id ='3';
    }

    @Override
    public void daniar(Pico unPico, Metal unmetal) {
        unmetal.serGolpeadaPor(unPico);
    }

    @Override
    public void daniar(PicoFino unPicoFino) {
        //UNA PIEDRA NO PUEDE DANIAR UN PICO FINO
    }

    @Override
    public void inicializar(FortalezaHerramienta fuerzaHerramienta){
        fuerzaHerramienta.inicializate(this);
    }
    @Override
    public void inicializar(AguanteHerramienta durabilidadHerramienta){durabilidadHerramienta. inicializate(this);}
}
