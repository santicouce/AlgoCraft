package algocraft.interfazgrafica.eventos;

import algocraft.interfazgrafica.vista.ContenedorJuego;
import algocraft.jugador.Jugador;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class BotonDesequiparEventHandler implements EventHandler<ActionEvent> {
    private Jugador jugador;
    private ContenedorJuego contenedorJuego;
    private Button boton;

    public BotonDesequiparEventHandler (Jugador unJugador, ContenedorJuego unContenedorDeJuego, Button unBoton){
        jugador = unJugador;
        this.contenedorJuego = unContenedorDeJuego;
        boton = unBoton;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        jugador.desequiparHerramienta();
        contenedorJuego.actualizarImgagen();
        contenedorJuego.actualizarBotonera();
        boton.setDisable(true);
    }
}
