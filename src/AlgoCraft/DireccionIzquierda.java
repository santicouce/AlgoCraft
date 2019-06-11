package AlgoCraft;

public class DireccionIzquierda extends Direccion{
    public DireccionIzquierda(Mapa unMapa) {
        super(unMapa);
    }
    @Override
    public void realizarMovimiento(Jugador unJugador, int columna, int fila) {
        moverJugadorA(unJugador, columna-1,fila);
        mapa.eliminarElementoEnPosicion(columna,fila);
    }

    @Override
    public void actualizarUbicacion(UbicacionJugador ubicacionJugador) {
        ubicacionJugador.actualizarUbicacion(this);
    }
}