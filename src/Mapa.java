public class Mapa {

    private Casillero tablero[][];

    public Mapa() {

        //Creo tablero de 10x10
        this.tablero = new Casillero[10][10];
    }

    public boolean esUnMapa() {
        return true;
    }

    public Casillero accederAPosicion(int columna, int fila){
        return this.tablero[columna][fila];
        /*for (int i = 0; i < columna; i++) {
            for (int j = 0; j < fila; j++) {
                return this.tablero[i][j];
            }
        }*/
    }

}
