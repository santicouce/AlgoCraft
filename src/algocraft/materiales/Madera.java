package algocraft.materiales;

import algocraft.vidadeobjetos.AguanteHerramienta;
import algocraft.vidadeobjetos.FortalezaHerramienta;
import algocraft.herramientas.Pico;
import algocraft.herramientas.PicoFino;

public class Madera extends MaterialDeConstruccion{
    public Madera (){
        this.durabilidad = 10;
        this.id ='1';
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