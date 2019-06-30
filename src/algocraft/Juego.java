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
    private Mapa mapa = new Mapa(10,10);
    private Jugador jugador = new Jugador();

    public Juego(){

        mapa.aniadirElementoEnPosicion(new Madera() , 0,0);
        mapa.aniadirElementoEnPosicion(new Madera() , 0,1);
        mapa.aniadirElementoEnPosicion(new Madera() , 0,2);
        mapa.aniadirElementoEnPosicion(new Madera() , 0,3);
        mapa.aniadirElementoEnPosicion(new Madera() , 0,4);
        mapa.aniadirElementoEnPosicion(new Madera() , 0,5);
        mapa.aniadirElementoEnPosicion(new Madera() , 0,6);
        mapa.aniadirElementoEnPosicion(new Madera() , 0,7);
        mapa.aniadirElementoEnPosicion(new Madera() , 0,8);
        mapa.aniadirElementoEnPosicion(new Madera() , 0,9);


        mapa.aniadirElementoEnPosicion(new Madera() , 2,3);
        mapa.aniadirElementoEnPosicion(new Madera() , 1,0);
        mapa.aniadirElementoEnPosicion(new Madera() , 2,0);
        mapa.aniadirElementoEnPosicion(new Madera() , 3,0);
        mapa.aniadirElementoEnPosicion(new Madera() , 4,0);
        mapa.aniadirElementoEnPosicion(new Madera() , 5,0);
        mapa.aniadirElementoEnPosicion(new Madera() , 6,0);
        mapa.aniadirElementoEnPosicion(new Madera() , 7,0);
        mapa.aniadirElementoEnPosicion(new Madera() , 8,0);
        mapa.aniadirElementoEnPosicion(new Madera() , 9,0);
        mapa.aniadirElementoEnPosicion(new Madera() , 5,3);
        mapa.aniadirElementoEnPosicion(new Madera() , 9,8);
        mapa.aniadirElementoEnPosicion(new Madera() , 6,7);

        mapa.aniadirElementoEnPosicion(new Diamante() , 3,2);

        mapa.aniadirElementoEnPosicion(new Metal() , 3,3);
        mapa.aniadirElementoEnPosicion(new Metal() , 8,6);
        mapa.aniadirElementoEnPosicion(new Metal() , 3,8);

        mapa.aniadirElementoEnPosicion(new Piedra() , 5,9);
        mapa.aniadirElementoEnPosicion(new Piedra() , 5,2);
        mapa.aniadirElementoEnPosicion(new Madera() , 7,3);
        mapa.aniadirElementoEnPosicion(new Metal() , 4,1);
        mapa.aniadirJugadorAlMapa(jugador,5,5);
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

    public Jugador darJugador(){
        return jugador;
    }

    public void golpear(){
        try {
            jugador.golpear(mapa);
        }catch (NullPointerException nullpointer){
            //No hay objeto a golpear.
        }
    }

    public int cantidadFilasDelTablero() {
        return mapa.getTablero().get(0).size();
    }
    public int cantidadColumnasDelTablero() {
        return mapa.getTablero().size();
    }
}
