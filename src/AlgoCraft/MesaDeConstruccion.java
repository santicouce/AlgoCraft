package AlgoCraft;

public class MesaDeConstruccion {


    static final int CANTIDAD_DE_COLUMNAS = 10;
    static final int CANTIDAD_DE_FILAS = 10;
    private Casillero tablero[][];

    public MesaDeConstruccion() {
        //Creo tablero de 3x3
        this.tablero = new Casillero[3][3];
        this.inicializarTablero();
    }

    private void inicializarTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = new Casillero();
            }
        }
    }

    public void aniadirElementoEnPosicion(Observable colocable, int columna, int fila){}

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
