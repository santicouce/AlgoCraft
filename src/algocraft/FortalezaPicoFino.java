package algocraft;

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
    private void inicializate(){
        fuerza = 20;
    }
}
