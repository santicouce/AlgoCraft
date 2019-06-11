package AlgoCraft;
// Futura clase madre de Mapa y MesaDeConstrucción, ingloba los comportamientos de ambas
public class Tablero {

    private int cantidadDeColumnas;
    private int cantidadDeFilas;
    private Casillero tablero[][];

    public Tablero(int cantidadDeColumnas, int cantidadDeFilas) {
        this.cantidadDeColumnas = cantidadDeColumnas;
        this.cantidadDeFilas = cantidadDeFilas;
        this.tablero = new Casillero[cantidadDeColumnas][cantidadDeFilas];
        this.inicializarTablero();
    }

    private void inicializarTablero() {
        for (int i = 0; i < cantidadDeColumnas; i++) {
            for (int j = 0; j < cantidadDeFilas; j++) {
                tablero[i][j] = new Casillero();
            }
        }
    }

    public void aniadirElementoEnPosicion(Observable observable, int columna, int fila) {
        validarPosicion(columna, fila);
        tablero[columna][fila].aniadirElemento(observable);
    }

    public void validarPosicion(int columna, int fila) {
        this.validarColumna(columna);
        this.validarFila(fila);
    }

    private void validarColumna(int columna) {
        if (columna < 0 || columna > (cantidadDeColumnas - 1)) {
            throw new PosicionInvalidaError();
        }
    }

    private void validarFila(int fila) {
        if (fila < 0 || fila > (cantidadDeColumnas - 1)) {
            throw new PosicionInvalidaError();
        }

    }
}
