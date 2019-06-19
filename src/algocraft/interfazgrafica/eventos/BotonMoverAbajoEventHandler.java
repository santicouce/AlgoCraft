package algocraft.interfazgrafica.eventos;

import algocraft.Juego;
import algocraft.interfazgrafica.vista.JugadorVista;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class BotonMoverAbajoEventHandler implements EventHandler<ActionEvent> {
    JugadorVista jugador;
    Juego algocraft;

    public BotonMoverAbajoEventHandler(JugadorVista jugadorVista, Juego juego){
        jugador = jugadorVista;
        algocraft = juego;
    }
    @Override
    public void handle(ActionEvent actionEvent) {
        algocraft.moverJugadorAbajo();
        jugador.actualizate();
    }
}
