package algocraft.vidaDeObjetos;

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
}
