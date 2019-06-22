package algocraft.construcciondeherramientas;

import algocraft.herramientas.Herramienta;
import algocraft.jugador.Inventario;
import algocraft.materiales.Madera;
import algocraft.materiales.Material;
import algocraft.materiales.Metal;
import algocraft.materiales.Piedra;

import java.util.HashMap;
import java.util.List;

public abstract class Fabrica {

    protected String identificador = new String();

    public abstract void construir(Madera unaMadera, String identificadorDelTablero, HashMap<String, List<Herramienta>> unInventario);
    public abstract void construir(Piedra unaPiedra,String identificadorDelTablero, HashMap<String, List<Herramienta>>  unInventario);
    public abstract void construir(Metal unMetal,String identificadorDelTablero, HashMap<String, List<Herramienta>>  unInventario);
}
