package algocraft.construcciondeherramientas;

import algocraft.errores.ImposibleCrearHerramientaError;
import algocraft.herramientas.PicoFino;
import algocraft.jugador.Inventario;
import algocraft.materiales.Metal;
import algocraft.materiales.Piedra;

public class FabricaDePicoFino {

    String identificador = new String();

    public FabricaDePicoFino(){
        identificador = "333210010";
    }

    public void construir(String identificadorDelTablero, Inventario inventario){

        if (identificadorDelTablero.equals(identificador)){
            inventario.aniadirHerramienta(new PicoFino(new Piedra(),new Metal()));
        }else {
            throw new ImposibleCrearHerramientaError();
        }
    }
}
