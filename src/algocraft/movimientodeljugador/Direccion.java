package algocraft.movimientodeljugador;

import algocraft.jugador.Jugador;
import algocraft.mapadejuego.Mapa;
import algocraft.errores.CasilleroOcupadoError;
import algocraft.errores.MovimientoInvalidoError;
import algocraft.errores.PosicionInvalidaError;

public abstract class Direccion {
    protected Mapa mapa;

    public Direccion(Mapa unMapa){
        mapa = unMapa;
    }
    public abstract void realizarMovimiento(Jugador unJugador, int columna, int fila);
    protected void moverJugadorA(Jugador unJugador, int columna, int fila){
        try {
            mapa.moverJugador(unJugador, columna, fila);
        }catch (CasilleroOcupadoError casilleroocupado){
            throw new MovimientoInvalidoError();
        }
        catch (IndexOutOfBoundsException erroresDeMovimiento){
            if (columna > mapa.getTablero().size()-1) {
                mapa.agrandarseADerecha();
                mapa.getTablero().get(columna).get(fila).aniadirElemento(unJugador);
                mapa.moverJugador(unJugador, columna, fila);
            } else {
                if (columna < 0) {
                    throw new PosicionInvalidaError();
                }
            }
            if (fila>mapa.getTablero().get(0).size()-1){
                mapa.agrandarseParaAbajo();
                mapa.getTablero().get(columna).get(fila).aniadirElemento(unJugador);
                mapa.moverJugador(unJugador, columna, fila);
            }else{
                if (fila < 0) {
                    throw new PosicionInvalidaError();
                }
            }
        }
    }
    public abstract void actualizarUbicacion(UbicacionJugador ubicacionJugador);
}
