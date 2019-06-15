package algocraft;

public abstract class FortalezaHerramienta {
    int fuerza;
    public abstract void inicializate(Madera unaMadera);
    public abstract void inicializate(Piedra unaPiedra);
    public abstract void inicializate(Metal unMetal);

    public int daniar(int durabilidad){
        return (durabilidad - fuerza);
    }

    public int fuerza(){return fuerza;}
}
