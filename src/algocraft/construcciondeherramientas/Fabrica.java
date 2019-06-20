package algocraft.construcciondeherramientas;

import algocraft.jugador.Inventario;
import algocraft.materiales.Madera;
import algocraft.materiales.Metal;
import algocraft.materiales.Piedra;

public abstract class Fabrica {

    protected String identificador = new String();

    public abstract void construir(Madera unaMadera,String identificadorDelTablero, Inventario unInventario);
    public abstract void construir(Piedra unaPiedra,String identificadorDelTablero, Inventario unInventario);
    public abstract void construir(Metal unMetal,String identificadorDelTablero, Inventario unInventario);
}
