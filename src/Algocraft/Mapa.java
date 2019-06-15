package Algocraft;

public class Mapa {
    static final int CANTIDAD_DE_COLUMNAS = 10;
    static final int CANTIDAD_DE_FILAS = 10;
    private Casillero tablero[][];

    public Mapa() {
        //Creo tablero de 10x10
        this.tablero = new Casillero[CANTIDAD_DE_COLUMNAS][CANTIDAD_DE_FILAS];
        this.inicializarTablero();
    }
    private void inicializarTablero(){
        for(int i=0; i<10; i++){
            for (int j=0; j<10; j++){
                tablero[i][j]= new Casillero();
            }
        }
    }

    public void aniadirElementoEnPosicion(Observable colocable, int columna, int fila){
        validarPosicion(columna,fila);
        tablero[columna][fila].aniadirElemento(colocable);
    }

    public void moverJugador(Jugador unJugador, int columna, int fila){
        aniadirElementoEnPosicion(unJugador, columna, fila);
    }
    public void aniadirJugadorAlMapa(Jugador unJugador, int columna, int fila){
        aniadirElementoEnPosicion(unJugador, columna, fila);
        unJugador.aniadirJugadorAlMapa(columna, fila);
    }

    public void validarPosicion(int columna, int fila){
        this.validarColumna(columna);
        this.validarFila(fila);
    }

    private void validarColumna(int columna){
        if(columna < 0 || columna > (CANTIDAD_DE_COLUMNAS -1)){
            throw new PosicionInvalidaError();
        }
    }

    private void validarFila(int fila){
        if(fila < 0 || fila > (CANTIDAD_DE_COLUMNAS -1)){
            throw new PosicionInvalidaError();
        }
    }

    public void eliminarElementoEnPosicion(int columna, int fila) {
        tablero[columna][fila].eliminarElemento();
    }
}
