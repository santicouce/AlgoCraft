package algocraft.interfazgrafica.eventos;

import algocraft.Juego;
import algocraft.interfazgrafica.vista.JugadorVista;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonMoverIzquierdaEventHandler implements EventHandler<ActionEvent> {
    JugadorVista jugador;
    Juego algocraft;

    public BotonMoverIzquierdaEventHandler(JugadorVista jugadorVista, Juego juego){
        jugador = jugadorVista;
        algocraft = juego;
    }
    @Override
    public void handle(ActionEvent actionEvent) {
        algocraft.moverJugadorIzquierda();
        jugador.actualizate();
    }
}