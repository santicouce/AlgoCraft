package algocraft.mapadejuego;

import algocraft.construcciondeherramientas.Tablero;
import algocraft.jugador.Jugador;
import algocraft.Observable;
import algocraft.errores.PosicionInvalidaError;

public class Mapa extends Tablero {

    public Mapa(int fila, int columna) {
        inicializarTablero(columna,fila);
    }

    public void aniadirElementoEnPosicion(Observable colocable, int columna, int fila){
            try {
                tablero.get(fila).get(columna).aniadirElemento(colocable);
            }catch (IndexOutOfBoundsException indexoutofboundsexception){
                throw new PosicionInvalidaError();
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
}
