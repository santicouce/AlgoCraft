package Algocraft;

public class Diamante extends Material {
    public Diamante(){
        this.durabilidad=100;
    }

    @Override
    public void daniar(PicoFino unPicoFino) {
        unPicoFino.desgastate();
    }
}
