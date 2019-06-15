package algocraft;

public class FortalezaPico extends FortalezaHerramienta{
    public void inicializate(Madera unaMadera){
        fuerza = 2;
    }
    public void inicializate(Piedra unaPiedra){
        fuerza = 4;
    }
    public void inicializate(Metal unaMetal){
        fuerza = 12;
    }
}
