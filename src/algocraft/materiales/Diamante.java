package algocraft.materiales;

import algocraft.herramientas.PicoFino;

public class Diamante extends Material {
    public Diamante(){
        this.durabilidad=100;
        this.id ='4';
    }

    @Override
    public void daniar(PicoFino unPicoFino) {
        unPicoFino.desgastate();
    }
}