package algocraft.materiales;

import algocraft.vidadeobjetos.AguanteHerramienta;
import algocraft.vidadeobjetos.FortalezaHerramienta;
import algocraft.herramientas.PicoFino;
import algocraft.vidadeobjetos.FortalezaPico;

public class Madera extends MaterialDeConstruccion{
    public Madera (){
        this.durabilidad = 10;
        this.id ='1';
    }

    @Override
    public void golpeadoCon(FortalezaHerramienta fortalezaHerramienta) {
        fortalezaHerramienta.golpear(this);
    }

    @Override
    public void impactadoCon(PicoFino picoFino) {
        //UN PICO FINO NO SE DESGASTA AL IMPACTAR CON MADERA
    }

    @Override
    public void inicializar(FortalezaHerramienta fuerzaHerramienta){
        fuerzaHerramienta.inicializate(this);
    }
    @Override
    public void inicializar(AguanteHerramienta durabilidadHerramienta){durabilidadHerramienta.inicializate(this);}

    @Override
    public void daniarCon(Metal unMetal, FortalezaPico fortalezaPico) {
        //UN PICO DE MADERA NO PUEDE DANIAR METAL
    }
}