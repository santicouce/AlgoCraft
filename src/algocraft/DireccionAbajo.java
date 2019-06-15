package algocraft;

public class DireccionAbajo extends Direccion {
    public DireccionAbajo(Mapa unMapa) {
        super(unMapa);
    }
    public void realizarMovimiento(Jugador unJugador, int columna, int fila){
        moverJugadorA(unJugador, columna,fila+1);
        mapa.eliminarElementoEnPosicion(columna,fila);
    }
    public void actualizarUbicacion(UbicacionJugador ubicacionJugador){
        ubicacionJugador.actualizarUbicacion(this);
    }
}
