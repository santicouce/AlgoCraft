package AlgoCraft;

import AlgoCraft.Casillero;

public class Mapa {

    private Material tablero[][];

    public Mapa() {

        //Creo tablero de 10x10
        this.tablero = new Material[10][10];
    }

//    public Casillero accederAPosicion(int columna, int fila){
  //      return this.tablero[columna][fila];
        /*for (int i = 0; i < columna; i++) {
            for (int j = 0; j < fila; j++) {
                return this.tablero[i][j];
            }
        }*/
//    }
    public void aniadirElementoEnPosicion(Material material, int columna, int fila){
        tablero[columna][fila] = material;
    }



}
