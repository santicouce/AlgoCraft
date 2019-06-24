package algocraft.interfazgrafica.eventos;

import algocraft.interfazgrafica.vista.ContenedorBienvenida;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BotonEntrarEventHandler implements EventHandler<ActionEvent> {

    private Stage stage;
    private Scene proximaEscena;
    private ContenedorBienvenida contenedorBienvenida;


    public BotonEntrarEventHandler(Stage stage, Scene proximaEscena, ContenedorBienvenida contenedorBienvenida) {
        this.stage = stage;
        this.proximaEscena = proximaEscena;
        this.contenedorBienvenida = contenedorBienvenida;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        contenedorBienvenida.pararMusica();
        stage.setScene(proximaEscena);
        stage.setFullScreenExitHint("");
        stage.setFullScreen(true);
    }
}