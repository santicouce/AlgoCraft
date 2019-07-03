package algocraft.mapadejuego;

import algocraft.jugador.Jugador;
import algocraft.Observable;
import algocraft.errores.PosicionInvalidaError;
import algocraft.materiales.Madera;

import java.util.ArrayList;
import java.util.List;

public class Mapa{
    protected List<List<Casillero>> tablero;

    public Mapa(int columna, int fila) {
        tablero = new ArrayList<>();
        inicializarTablero(columna,fila);
    }

    public void inicializarTablero(int cantidadInicialDeColumnas,int cantidadInicialDeFilas) {


        for (int i = 0; i < cantidadInicialDeColumnas; i++) {
            tablero.add(new ArrayList<Casillero>());
            for (int j = 0; j < cantidadInicialDeFilas; j++) {
                tablero.get(i).add(j,new Casillero());
            }
        }
    }

    public void aniadirElementoEnPosicion(Observable colocable, int columna, int fila) {
        try {
            tablero.get(columna).get(fila).aniadirElemento(colocable);
        }catch (IndexOutOfBoundsException indexoutofbounds){
            throw new PosicionInvalidaError();
        }
    }
    public void moverJugador(Jugador unJugador, int columna, int fila){
        aniadirElementoEnPosicion(unJugador, columna, fila);

    }
    public void aniadirJugadorAlMapa(Jugador unJugador, int columna, int fila){
        aniadirElementoEnPosicion(unJugador, columna, fila);
    }

    public String darNombreDeElementoEn(int columna, int fila){
        return (tablero.get(columna).get(fila).darNombre());
    }

    public void agrandarse(Jugador unJugador, int columna,int fila){
        if (columna > tablero.size()-1) {
            agrandarseADerecha();
            moverJugador(unJugador, columna, fila);
        } else {
            if (columna < 0) {
                throw new PosicionInvalidaError();
            }
        }
        if (fila>tablero.get(0).size()-1){
            agrandarseParaAbajo();
            moverJugador(unJugador, columna, fila);
        }else{
            if (fila < 0) {
                throw new PosicionInvalidaError();
            }
        }
    }
    private void agrandarseADerecha(){

        int CANTIDAD_COLUMNAS_NUEVAS = 2;
        int CANTIDAD_DE_FILAS = tablero.get(0).size();
        int CANTIDAD_COLUMNAS_ACTUALES = tablero.size();

        for (int i = CANTIDAD_COLUMNAS_ACTUALES; i < CANTIDAD_COLUMNAS_ACTUALES+CANTIDAD_COLUMNAS_NUEVAS; i++) {
            tablero.add(new ArrayList<Casillero>());
            for (int j = 0; j < CANTIDAD_DE_FILAS; j++) {
                tablero.get(i).add(new Casillero());
            }
        }
        aniadirElementoEnPosicion(new Madera(),CANTIDAD_COLUMNAS_ACTUALES,0);
        aniadirElementoEnPosicion(new Madera(),CANTIDAD_COLUMNAS_ACTUALES+1,0);

    }

    private void agrandarseParaAbajo(){

        int CANTIDAD_FILAS_NUEVAS = 2;
        int CANTIDAD_DE_COLUMNAS = tablero.size();
        int CANTIDAD_FILAS_ACTUALES = tablero.get(0).size();

        for (int i = 0; i < CANTIDAD_DE_COLUMNAS; i++) {
            for (int j = 0; j < CANTIDAD_FILAS_NUEVAS; j++) {
                tablero.get(i).add(new Casillero());
            }
        }
        aniadirElementoEnPosicion(new Madera(),0,CANTIDAD_FILAS_ACTUALES);
        aniadirElementoEnPosicion(new Madera(),0,CANTIDAD_FILAS_ACTUALES+1);

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

    public List<List<Casillero>> getTablero() {
        return tablero;
    }


    public Observable obtenerObservable(int columna, int fila) {
        return tablero.get(columna).get(fila).getObservable();
    }
}
