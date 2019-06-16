package algocraft.materiales;

import algocraft.vidadeobjetos.AguanteHerramienta;
import algocraft.vidadeobjetos.FortalezaHerramienta;
import algocraft.herramientas.Pico;
import algocraft.herramientas.PicoFino;

public class Metal extends MaterialDeConstruccion{
    public Metal ()
    {
        this.durabilidad =50;
        this.id ='2';
    }

    @Override
    public void daniar(Pico unPico, Metal unmetal) {
        //UN PICO DE METAL NO PUEDE DANIAR UN PICO
    }
    @Override
    public void golpeadoCon(FortalezaHerramienta fortalezaHerramienta) {
        fortalezaHerramienta.golpear(this);
    }

    @Override
    public void impactadoCon(PicoFino picoFino) {
        //UN PICO FINO NO SE DESGASTA AL IMPAZTAR CON METAL
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
