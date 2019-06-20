package algocraft;

import algocraft.errores.MovimientoInvalidoError;
import algocraft.jugador.Jugador;
import algocraft.mapadejuego.Mapa;
import algocraft.materiales.Diamante;
import algocraft.materiales.Madera;
import algocraft.materiales.Metal;
import algocraft.materiales.Piedra;
import algocraft.movimientodeljugador.DireccionAbajo;
import algocraft.movimientodeljugador.DireccionArriba;
import algocraft.movimientodeljugador.DireccionDerecha;
import algocraft.movimientodeljugador.DireccionIzquierda;

public class Juego {
    private Mapa mapa = new Mapa();
    private Jugador jugador = new Jugador();

    public Juego(){
        Madera madera = new Madera();
        Piedra piedra = new Piedra();
        Metal metal = new Metal();
        Diamante diamante = new Diamante();

        mapa.aniadirElementoEnPosicion(madera , 0,0);
        mapa.aniadirElementoEnPosicion(madera , 0,1);
        mapa.aniadirElementoEnPosicion(madera , 0,2);
        mapa.aniadirElementoEnPosicion(madera , 0,3);
        mapa.aniadirElementoEnPosicion(madera , 0,4);
        mapa.aniadirElementoEnPosicion(madera , 0,5);
        mapa.aniadirElementoEnPosicion(madera , 0,6);
        mapa.aniadirElementoEnPosicion(madera , 0,7);
        mapa.aniadirElementoEnPosicion(madera , 0,8);
        mapa.aniadirElementoEnPosicion(madera , 0,9);
        mapa.aniadirElementoEnPosicion(madera , 2,3);
        mapa.aniadirElementoEnPosicion(madera , 1,0);
        mapa.aniadirElementoEnPosicion(madera , 2,0);
        mapa.aniadirElementoEnPosicion(madera , 3,0);
        mapa.aniadirElementoEnPosicion(madera , 4,0);
        mapa.aniadirElementoEnPosicion(madera , 5,0);
        mapa.aniadirElementoEnPosicion(madera , 6,0);
        mapa.aniadirElementoEnPosicion(madera , 7,0);
        mapa.aniadirElementoEnPosicion(madera , 8,0);
        mapa.aniadirElementoEnPosicion(madera , 9,0);
        mapa.aniadirElementoEnPosicion(madera , 5,3);

        mapa.aniadirElementoEnPosicion(diamante , 3,2);

        mapa.aniadirElementoEnPosicion(metal , 3,3);

        mapa.aniadirElementoEnPosicion(piedra , 5,2);
        mapa.aniadirElementoEnPosicion(madera , 7,3);
        mapa.aniadirElementoEnPosicion(metal , 4,1);
        mapa.aniadirJugadorAlMapa(jugador,5,5);
        jugador.aniadirJugadorAlMapa(5,5);
    }

    public String darNombre(int columna, int fila){
        return mapa.darNombreDeElementoEn(columna, fila);
    }
    public void moverJugadorAbajo(){
        try{
            jugador.moverA(new DireccionAbajo(mapa));
        }catch (MovimientoInvalidoError movimientoInvalidoError){
        }
    }
    public void moverJugadorArriba(){
        try{
            jugador.moverA(new DireccionArriba(mapa));
        }catch (MovimientoInvalidoError movimientoInvalidoError){
        }
    }
    public void moverJugadorDerecha(){
        try{
            jugador.moverA(new DireccionDerecha(mapa));
        }catch (MovimientoInvalidoError movimientoInvalidoError){
        }
    }
    public void moverJugadorIzquierda(){
        try{
            jugador.moverA(new DireccionIzquierda(mapa));
        }catch (MovimientoInvalidoError movimientoInvalidoError){
        }
    }

}
