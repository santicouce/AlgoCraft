package algocraft.construcciondeherramientas;

import algocraft.errores.ImposibleCrearHerramientaError;
import algocraft.herramientas.Hacha;
import algocraft.jugador.Inventario;
import algocraft.materiales.Madera;
import algocraft.materiales.Metal;
import algocraft.materiales.Piedra;

public class FabricaDeHacha extends Fabrica{

    public void construir(Madera unaMadera, String identificadorDelTablero, Inventario inventario){

        identificador = "110110010" ;
        if (identificadorDelTablero.equals(identificador)){
            inventario.aniadirHerramienta(new Hacha(new Madera()));
        }else {
            throw new ImposibleCrearHerramientaError();
        }
    }

    public void construir(Piedra unaPiedra,String identificadorDelTablero, Inventario inventario){
        identificador = "220210010" ;
        if (identificadorDelTablero.equals(identificador)){
            inventario.aniadirHerramienta(new Hacha(new Piedra()));
        }else {
            throw new ImposibleCrearHerramientaError();
        }
    }

    public void construir(Metal unMetal,String identificadorDelTablero, Inventario inventario){
        identificador = "330310010" ;
        if (identificadorDelTablero.equals(identificador)){
            inventario.aniadirHerramienta(new Hacha(new Metal()));
        }else {
            throw new ImposibleCrearHerramientaError();
        }
    }
}
