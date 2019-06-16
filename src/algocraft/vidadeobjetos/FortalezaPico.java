package algocraft.vidadeobjetos;

import algocraft.materiales.Diamante;
import algocraft.materiales.Madera;
import algocraft.materiales.Metal;
import algocraft.materiales.Piedra;

public class FortalezaPico extends FortalezaHerramienta{
    public void inicializate(Madera unaMadera){
        fuerza = 2;
        material = unaMadera;
    }
    public void inicializate(Piedra unaPiedra){
        fuerza = 4;
        material = unaPiedra;
    }
    public void inicializate(Metal unMetal){
        fuerza = 12;
        material = unMetal;
    }

    @Override
    public void golpear(Madera unaMadera) {
        //UN PICO NO PUEDE DANIEAR MADERA
    }

    @Override
    public void golpear(Piedra unaPiedra) {
        unaPiedra.daniadoCon(this);
    }

    @Override
    public void golpear(Metal unMetal) {
        material.daniarCon(unMetal, this);
    }

    @Override
    public void golpear(Diamante unDiamante) {
        //UN PICO NO PUEDE DANIAR DIAMANTE
    }
}
