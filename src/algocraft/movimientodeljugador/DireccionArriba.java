package algocraft.movimientodeljugador;

import algocraft.jugador.Jugador;
import algocraft.mapadejuego.Mapa;

public class DireccionArriba extends Direccion {
    public DireccionArriba(Mapa unMapa) {
        super(unMapa);
    }
    public void realizarMovimiento(Jugador unJugador, int columna, int fila){
        moverJugadorA(unJugador, columna,fila-1);
        mapa.eliminarElementoEnPosicion(columna,fila);
    }
    public void actualizarUbicacion(UbicacionJugador ubicacionJugador){
        ubicacionJugador.actualizarUbicacion(this);
    }

    @Override
    public String vista(String mirando) {
        return "espalda";
    }
}
