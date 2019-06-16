package algocraft.vidadeobjetos;

import algocraft.materiales.Diamante;
import algocraft.materiales.Madera;
import algocraft.materiales.Metal;
import algocraft.materiales.Piedra;

public abstract class FortalezaHerramienta {
    protected int fuerza;
    public abstract void inicializate(Madera unaMadera);
    public abstract void inicializate(Piedra unaPiedra);
    public abstract void inicializate(Metal unMetal);

    public int daniar(int durabilidad){
        return (durabilidad - fuerza);
    }
    public int fuerza(){return fuerza;}

    public abstract void golpear(Madera unaMadera);
    public abstract void golpear(Piedra unaPiedra);
    public abstract void golpear(Metal unMetal);
    public abstract void golpear(Diamante unDiamante);
}
