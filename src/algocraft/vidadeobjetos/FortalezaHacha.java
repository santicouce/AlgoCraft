package algocraft.vidadeobjetos;

import algocraft.materiales.Diamante;
import algocraft.materiales.Madera;
import algocraft.materiales.Metal;
import algocraft.materiales.Piedra;

public class FortalezaHacha extends FortalezaHerramienta {

    @Override
    public void inicializate(Madera unaMadera){
        fuerza = 2;
    }

    @Override
    public void inicializate(Piedra unaPiedra){
        fuerza = 5;
    }

    @Override
    public void inicializate(Metal unMetal){
        fuerza = 10;
    }

    @Override
    public void golpear(Madera unaMadera) {
        unaMadera.daniadoCon(this);
    }

    @Override
    public void golpear(Piedra unaPiedra) {
        //UN HACHA NO PUEDE DANIAR  PIEDRA
    }

    @Override
    public void golpear(Metal unMetal) {
        //UN HACHA NO PUEDE DANIAR METAL
    }

    @Override
    public void golpear(Diamante unDiamante) {
        //UN HACHA NO PUEDE DANIAR DIAMANTE
    }
}
