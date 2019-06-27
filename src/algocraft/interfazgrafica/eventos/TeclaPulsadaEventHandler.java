package algocraft.interfazgrafica.eventos;

import algocraft.Juego;
import algocraft.interfazgrafica.vista.VistaJugador;
import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class TeclaPulsadaEventHandler implements EventHandler <KeyEvent>{
    private Juego algocraft;
    private VistaJugador jugador;
    public TeclaPulsadaEventHandler(Juego juego, VistaJugador jugadorVista){
        algocraft = juego;
        jugador = jugadorVista;
    }
    @Override
    public void handle(KeyEvent keyEvent) {
        if(keyEvent.getCode() == KeyCode.W) {
            algocraft.moverJugadorArriba();
            jugador.actualizate();
        }
        if(keyEvent.getCode()== KeyCode.A){
            algocraft.moverJugadorIzquierda();
            jugador.actualizate();
        }
        if(keyEvent.getCode()== KeyCode.S){
            algocraft.moverJugadorAbajo();
            jugador.actualizate();
        }
        if(keyEvent.getCode()== KeyCode.D){
            algocraft.moverJugadorDerecha();
            jugador.actualizate();
        }
        keyEvent.consume();
    }
}
