package algocraft;

public abstract class Direccion {
    protected Mapa mapa;

    public Direccion(Mapa unMapa){
        mapa = unMapa;
    }
    public abstract void realizarMovimiento(Jugador unJugador, int columna, int fila);
    protected void moverJugadorA(Jugador unJugador, int columna, int fila){
        try {
            mapa.moverJugador(unJugador, columna, fila);
        }catch (CasilleroOcupadoError | PosicionInvalidaError erroresDeMovimiento){
            throw new MovimientoInvalidoError();
        }
    }
    public abstract void actualizarUbicacion(UbicacionJugador ubicacionJugador);
}
