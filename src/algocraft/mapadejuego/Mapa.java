package algocraft.mapadejuego;

import algocraft.jugador.Jugador;
import algocraft.Observable;
import algocraft.errores.PosicionInvalidaError;

import java.util.ArrayList;
import java.util.List;

public class Mapa{
    protected List<List<Casillero>> tablero;
    private Jugador jugador;

    public Mapa(int columna, int fila) {
        tablero = new ArrayList<>();
        inicializarTablero(columna,fila);
    }

    public void inicializarTablero(int cantidadInicialDeColumnas,int cantidadInicialDeFilas) {


        for (int i = 0; i < cantidadInicialDeColumnas; i++) {
            tablero.add(new ArrayList<Casillero>());
            for (int j = 0; j < cantidadInicialDeFilas; j++) {
                tablero.get(i).add(new Casillero());
            }
        }
    }

    public void aniadirElementoEnPosicion(Observable colocable, int columna, int fila) {
        try {
            tablero.get(columna).get(fila).aniadirElemento(colocable);
        } catch (IndexOutOfBoundsException indexoutofboundsexception) {
            if (columna > tablero.size()-1) {
                agrandarseADerecha();
            } else {
                if (columna < 0) {
                    throw new PosicionInvalidaError();
                }
            }
            if (fila>tablero.get(0).size()-1){
                agrandarseParaAbajo();
            }else{
                if (fila < 0) {
                    throw new PosicionInvalidaError();
                }
            }
        }
    }
    public void moverJugador(Jugador unJugador, int columna, int fila){
        aniadirElementoEnPosicion(unJugador, columna, fila);

    }
    public void aniadirJugadorAlMapa(Jugador unJugador, int columna, int fila){
        this.jugador = unJugador;
        aniadirElementoEnPosicion(unJugador, columna, fila);
        unJugador.aniadirJugadorAlMapa(columna, fila);
    }

    public String darNombreDeElementoEn(int columna, int fila){
        return (tablero.get(columna).get(fila).darNombre());
    }

    public void agrandarseADerecha(){

        int CANTIDAD_COLUMNAS_NUEVAS = 2;
        int CANTIDAD_DE_FILAS = tablero.get(0).size();

        for (int i = 1; i <= CANTIDAD_COLUMNAS_NUEVAS; i++) {
            tablero.add(new ArrayList<Casillero>());
            for (int j = 0; j < CANTIDAD_DE_FILAS; j++) {
                tablero.get(i).add(new Casillero());
            }
        }
    }

    public void agrandarseParaAbajo(){

        int CANTIDAD_FILAS_NUEVAS = 2;
        int CANTIDAD_DE_COLUMNAS = tablero.size();

        for (int i = 0; i < CANTIDAD_DE_COLUMNAS; i++) {
            for (int j = 0; j < CANTIDAD_FILAS_NUEVAS; j++) {
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
