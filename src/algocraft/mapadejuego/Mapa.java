package algocraft.mapadejuego;

import algocraft.construcciondeherramientas.Tablero;
import algocraft.jugador.Jugador;
import algocraft.Observable;
import algocraft.errores.PosicionInvalidaError;

import java.util.ArrayList;
import java.util.List;

public class Mapa extends Tablero {

    public Mapa(int fila, int columna) {
        inicializarTablero(columna,fila);
    }

    public void aniadirElementoEnPosicion(Observable colocable, int columna, int fila){
            try {
                tablero.get(fila).get(columna).aniadirElemento(colocable);
            }catch (IndexOutOfBoundsException indexoutofboundsexception){
                if (columna>tablero.size()-1) {
                    agrandarseADerecha();
                }else {agrandarseParaAbajo();}
            }
    }
    public void moverJugador(Jugador unJugador, int columna, int fila){
        aniadirElementoEnPosicion(unJugador, columna, fila);

    }
    public void aniadirJugadorAlMapa(Jugador unJugador, int columna, int fila){
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

        for (int i = 1; i <= CANTIDAD_DE_COLUMNAS; i++) {
            for (int j = 0; j < CANTIDAD_FILAS_NUEVAS; j++) {
                tablero.get(i).add(new Casillero());
            }
        }
    }
}
