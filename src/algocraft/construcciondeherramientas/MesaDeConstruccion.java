package algocraft.construcciondeherramientas;
import algocraft.errores.PosicionInvalidaError;
import algocraft.jugador.Inventario;
import algocraft.mapadejuego.Casillero;
import algocraft.mapadejuego.Mapa;
import algocraft.materiales.Material;
import algocraft.materiales.MaterialDeConstruccion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MesaDeConstruccion {

    private int cantidadDeColumnas=3;
    private int cantidadDeFilas=3;
    private Casillero tablero[][];

    public MesaDeConstruccion() {
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

    public void aniadirElementoEnPosicion(int columna, int fila, Material material) {
        validarPosicion(columna, fila);
        tablero[columna][fila].aniadirElemento(material);
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