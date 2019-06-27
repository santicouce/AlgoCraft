package algocraft.movimientodeljugador;

import algocraft.jugador.Jugador;

public class UbicacionJugador {
    private int columna;
    private int fila;
    String mirando;

    public UbicacionJugador(int unaColumna, int unaFila){
        this.columna = unaColumna;
        this.fila = unaFila;
        this.mirando = "frente";
    }

    public void moverJugadorA(Jugador unJugador, Direccion unaDireccion){
        mirando = unaDireccion.vista(mirando);
        unaDireccion.realizarMovimiento(unJugador, columna, fila);
        unaDireccion.actualizarUbicacion(this);
    }
    public void actualizarUbicacion(DireccionIzquierda direccionIzquierda){
        columna -= 1;
    }
    public void actualizarUbicacion(DireccionDerecha direccionDerecha){
        columna += 1;
    }
    public void actualizarUbicacion(DireccionArriba direccionArriba) {
        fila -= 1;
    }
    public void actualizarUbicacion(DireccionAbajo direccionAbajo) {
        fila += 1;
    }

    public String frente() {
        return mirando;
    }

    public int getColumna(){
        return columna;
    }

    public int getFila(){
        return fila;
    }
}
