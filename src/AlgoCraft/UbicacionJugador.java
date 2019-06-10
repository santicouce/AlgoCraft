package AlgoCraft;

public class UbicacionJugador {
    private int columna;
    private int fila;

    public UbicacionJugador(int unaColumna, int unaFila){
        this.columna = unaColumna;
        this.fila = unaFila;
    }

    public void moverJugadorA(Jugador unJugador, Direccion unaDireccion){
        unaDireccion.realizarMovimiento(unJugador, columna, fila);
        unaDireccion.actualizarUbicacion(this);
    }
    public void actualizarUbicacion(DireccionIzquierda direccionIzquierda){
        columna -= 1;
    }
    public void actualizarUbicacion(DireccionDerecha direccionDerecha){ columna += 1;}
    public void actualizarUbicacion(DireccionArriba direccionArriba) { fila -= 1; }
    public void actualizarUbicacion(DireccionAbajo direccionAbajo) {fila += 1;}
}
