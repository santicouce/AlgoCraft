package algocraft.vidadeobjetos;

import algocraft.errores.ConstruccionInvalidaError;
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
    private void inicializate(){
        fuerza = 20;
    }
}
