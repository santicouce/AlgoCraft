package algocraft.vidadeobjetos;

import algocraft.errores.ConstruccionInvalidaError;
import algocraft.materiales.Diamante;
import algocraft.materiales.Madera;
import algocraft.materiales.Metal;
import algocraft.materiales.Piedra;

public class FortalezaPicoFino extends  FortalezaHerramienta{
    public void inicializate(Madera unaMadera){
        throw new ConstruccionInvalidaError();
    }
    public void inicializate(Piedra unaPiedra){
        this.inicializate();
    }
    public void inicializate(Metal unaMetal){
        this.inicializate();
    }

    @Override
    public void golpear(Madera unaMadera) {
        //UN PICO FINO NO PUEDE DANIAR MADERA
    }

    @Override
    public void golpear(Piedra unaPiedra) {
        //UN PICO FINO NO PUEDE DANIAR PIEDRA
    }

    @Override
    public void golpear(Metal unMetal) {
        //UN PICO FINO NO PUEDA DANIAR METAL
    }

    @Override
    public void golpear(Diamante unDiamante) {
        unDiamante.daniadoCon(this);
    }

    private void inicializate(){
        fuerza = 20;
    }
}
