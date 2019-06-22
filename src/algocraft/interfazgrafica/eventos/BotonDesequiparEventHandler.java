package algocraft.interfazgrafica.eventos;

import algocraft.interfazgrafica.vista.ContenedorJuego;
import algocraft.jugador.Jugador;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class BotonDesequiparEventHandler implements EventHandler<ActionEvent> {
    private Jugador jugador;
    private ContenedorJuego botonera;
    private Button boton;

    public BotonDesequiparEventHandler (Jugador unJugador, ContenedorJuego unaBotonera, Button unBoton){
        jugador = unJugador;
        botonera = unaBotonera;
        boton = unBoton;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        jugador.desequiparHerramienta();
        botonera.actualizarBotonera();
        boton.setDisable(true);
    }
}
