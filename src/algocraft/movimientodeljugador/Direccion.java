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

        }catch (PosicionInvalidaError erroresDeMovimiento){

            mapa.agrandarse(unJugador,columna,fila);
        }
        catch (CasilleroOcupadoError casilleroocupado){

            throw new MovimientoInvalidoError();
        }

    }
    public abstract void actualizarUbicacion(UbicacionJugador ubicacionJugador);
    public abstract String vista(String mirando);
}
