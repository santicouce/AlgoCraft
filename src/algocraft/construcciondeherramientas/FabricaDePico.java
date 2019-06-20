package algocraft.construcciondeherramientas;

import algocraft.errores.ImposibleCrearHerramientaError;
import algocraft.herramientas.Pico;
import algocraft.jugador.Inventario;
import algocraft.materiales.Madera;
import algocraft.materiales.Metal;
import algocraft.materiales.Piedra;

public class FabricaDePico extends Fabrica {
    public void construir(Madera unaMadera, String identificadorDelTablero, Inventario inventario){

        identificador = "111010010" ;
        if (identificadorDelTablero.equals(identificador)){
            inventario.aniadirHerramienta(new Pico(new Madera()));
        }else {
            throw new ImposibleCrearHerramientaError();
        }
    }

    public void construir(Piedra unaPiedra, String identificadorDelTablero, Inventario inventario){
        identificador = "222010010" ;
        if (identificadorDelTablero.equals(identificador)){
            inventario.aniadirHerramienta(new Pico(new Piedra()));
        }else {
            throw new ImposibleCrearHerramientaError();
        }
    }

    public void construir(Metal unMetal, String identificadorDelTablero, Inventario inventario){
        identificador = "333010010" ;
        if (identificadorDelTablero.equals(identificador)){
            inventario.aniadirHerramienta(new Pico(new Metal()));
        }else {
            throw new ImposibleCrearHerramientaError();
        }
    }
}
