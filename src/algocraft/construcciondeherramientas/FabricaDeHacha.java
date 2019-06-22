package algocraft.construcciondeherramientas;

import algocraft.errores.ImposibleCrearHerramientaError;
import algocraft.herramientas.Hacha;
import algocraft.herramientas.Herramienta;
import algocraft.jugador.Inventario;
import algocraft.materiales.Madera;
import algocraft.materiales.Material;
import algocraft.materiales.Metal;
import algocraft.materiales.Piedra;

import java.util.HashMap;
import java.util.List;

public class FabricaDeHacha extends Fabrica{

    public void construir(Madera unaMadera, String identificadorDelTablero, HashMap<String, List<Herramienta>> InventarioHerramientas){

        identificador = "110110010" ;
        if (identificadorDelTablero.equals(identificador)){
            InventarioHerramientas.get("hacha de madera").add(new Hacha(new Madera()));
        }else {
            throw new ImposibleCrearHerramientaError();
        }
    }

    public void construir(Piedra unaPiedra,String identificadorDelTablero, HashMap<String, List<Herramienta>>  InventarioHerramientas){
        identificador = "220210010" ;
        if (identificadorDelTablero.equals(identificador)){
            InventarioHerramientas.get("hacha de piedra").add(new Hacha(new Piedra()));
        }else {
            throw new ImposibleCrearHerramientaError();
        }
    }

    public void construir(Metal unMetal,String identificadorDelTablero, HashMap<String, List<Herramienta>> InventarioHerramientas){
        identificador = "330310010" ;
        if (identificadorDelTablero.equals(identificador)){
            InventarioHerramientas.get("hacha de metal").add(new Hacha(new Metal()));
        }else {
            throw new ImposibleCrearHerramientaError();
        }
    }
}
