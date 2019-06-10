package AlgoCraft;

public class UbicacionJugador {
    private int columna;
    private int fila;
    Mapa mapa;

    public UbicacionJugador(Mapa unMapa, int unaColumna, int unaFila){
        this.mapa = unMapa;
        this.columna = unaColumna;
        this.fila = unaFila;
    }

    public void moverALaIzquierda(Jugador unJugador){
       try {
           mapa.moverJugador(unJugador, columna - 1, fila);
       }catch (CasilleroOcupadoError | PosicionInvalidaError erroresDeMovimiento){
           throw new MovimientoInvalidoError();
        }
        columna = columna -1;
    }
}
