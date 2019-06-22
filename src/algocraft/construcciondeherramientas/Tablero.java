package algocraft.construcciondeherramientas;
import algocraft.errores.PosicionInvalidaError;
import algocraft.mapadejuego.Casillero;

import java.util.ArrayList;
import java.util.List;

public class Tablero {

    protected List<List<Casillero>> tablero;

    public Tablero(){
        tablero = new ArrayList<>();
    }

    public void inicializarTablero(int cantidadInicialDeFilas,int cantidadInicialDeColumnas) {

        for (int i = 0; i < cantidadInicialDeColumnas; i++) {
            tablero.add(new ArrayList<Casillero>());
            for (int j = 0; j < cantidadInicialDeFilas; j++) {
                tablero.get(i).add(new Casillero());
            }
        }
    }


    public void validarPosicion(int columna, int fila) {
        this.validarColumna(columna);
        this.validarFila(fila);
    }

    private void validarColumna(int columna) {
        if (columna < 0 || columna > (tablero.get(0).size() - 1)) {
            throw new PosicionInvalidaError();
        }
    }

    private void validarFila(int fila) {
        if (fila < 0 || fila > (tablero.size() - 1)) {
            throw new PosicionInvalidaError();
        }

    }
    public void eliminarElementoEnPosicion(int columna, int fila) {
        tablero.get(columna).get(fila).eliminarElemento();
    }
}
