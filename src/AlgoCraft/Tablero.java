package AlgoCraft;
// Futura clase madre de Mapa y tablero, ingloba los comportamientos de ambas
public class Tablero {

    private int CANTIDAD_DE_COLUMNAS;
    private int CANTIDAD_DE_FILAS;
    private Casillero tablero[][];

    public Tablero(int cantidadDeColumnas, int cantidadDeFilas) {
        this.CANTIDAD_DE_COLUMNAS = cantidadDeColumnas;
        this.CANTIDAD_DE_FILAS = cantidadDeFilas;
        this.tablero = new Casillero[cantidadDeColumnas][cantidadDeFilas];
        this.inicializarTablero();
    }

    private void inicializarTablero() {
        for (int i = 0; i < CANTIDAD_DE_COLUMNAS; i++) {
            for (int j = 0; j < CANTIDAD_DE_FILAS; j++) {
                tablero[i][j] = new Casillero();
            }
        }
    }

    public void aniadirElementoEnPosicion(Colocable colocable, int columna, int fila) {
        validarPosicion(columna, fila);
        tablero[columna][fila].aniadirElemento(colocable);
    }

    public void validarPosicion(int columna, int fila) {
        this.validarColumna(columna);
        this.validarFila(fila);
    }

    private void validarColumna(int columna) {
        if (columna < 0 || columna > (CANTIDAD_DE_COLUMNAS - 1)) {
            throw new PosicionInvalidaError();
        }
    }

    private void validarFila(int fila) {
        if (fila < 0 || fila > (CANTIDAD_DE_COLUMNAS - 1)) {
            throw new PosicionInvalidaError();
        }

    }
}
