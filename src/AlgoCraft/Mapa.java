package AlgoCraft;

import AlgoCraft.Casillero;

public class Mapa {

    private Casillero tablero[][];

    public Mapa() {
        //Creo tablero de 10x10
        this.tablero = new Casillero[10][10];
        this.inicializarTablero();
    }
    private void inicializarTablero(){
        for(int i=0; i<10; i++){
            for (int j=0; j<10; j++){
                tablero[i][j]= new Casillero();
            }
        }
    }

    public void aniadirElementoEnPosicion(Colocable colocable, int columna, int fila){
        tablero[columna][fila].aniadirElemento(colocable);
    }

    
}
