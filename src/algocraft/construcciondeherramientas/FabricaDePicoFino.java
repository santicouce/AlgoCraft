package algocraft.construcciondeherramientas;

import algocraft.errores.ImposibleCrearHerramientaError;
import algocraft.herramientas.Herramienta;
import algocraft.herramientas.PicoFino;
import algocraft.jugador.Inventario;
import algocraft.materiales.Metal;
import algocraft.materiales.Piedra;

import java.util.HashMap;
import java.util.List;

public class FabricaDePicoFino {

    String identificador = new String();

    public FabricaDePicoFino(){
        identificador = "333210010";
    }

    public void construir(String identificadorDelTablero, HashMap<String, List<Herramienta>> InventarioHerramientas){

        if (identificadorDelTablero.equals(identificador)){
            InventarioHerramientas.get("pico fino").add(new PicoFino(new Piedra(),new Metal()));
        }else {
            throw new ImposibleCrearHerramientaError();
        }
    }
}
