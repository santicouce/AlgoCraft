package algocraft.construcciondeherramientas;

import algocraft.errores.ImposibleCrearHerramientaError;
import algocraft.herramientas.Herramienta;
import algocraft.herramientas.Pico;
import algocraft.jugador.Inventario;
import algocraft.materiales.Madera;
import algocraft.materiales.Metal;
import algocraft.materiales.Piedra;

import java.util.HashMap;
import java.util.List;

public class FabricaDePico extends Fabrica {
    public void construir(Madera unaMadera, String identificadorDelTablero, HashMap<String, List<Herramienta>> InventarioHerramientas){

        identificador = "111010010" ;
        if (identificadorDelTablero.equals(identificador)){
            InventarioHerramientas.get("pico de madera").add(new Pico(new Madera()));

        }else {
            throw new ImposibleCrearHerramientaError();
        }
    }

    public void construir(Piedra unaPiedra, String identificadorDelTablero, HashMap<String, List<Herramienta>> InventarioHerramientas){
        identificador = "222010010" ;
        if (identificadorDelTablero.equals(identificador)){
            InventarioHerramientas.get("pico de piedra").add(new Pico(new Piedra()));
        }else {
            throw new ImposibleCrearHerramientaError();
        }
    }

    public void construir(Metal unMetal, String identificadorDelTablero, HashMap<String, List<Herramienta>> InventarioHerramientas){
        identificador = "333010010" ;
        if (identificadorDelTablero.equals(identificador)){
            InventarioHerramientas.get("pico de metal").add(new Pico(new Metal()));
        }else {
            throw new ImposibleCrearHerramientaError();
        }
    }
}
