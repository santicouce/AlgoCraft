package algocraft;

import algocraft.interfazgrafica.vista.ContenedorBienvenida;
import algocraft.interfazgrafica.vista.ContenedorJuego;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class  Main extends Application{

    private Juego algoCraft = new Juego();
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(final Stage stage) throws Exception{

        stage.setTitle("AlgoCraft");

        ContenedorJuego contenedorJuego = new ContenedorJuego(stage, algoCraft);
        Scene escenaJuego = new Scene(contenedorJuego, 640, 480);

        ContenedorBienvenida contenedorBienvenidos = new ContenedorBienvenida(stage, escenaJuego);
        Scene escenaBienvenidos = new Scene(contenedorBienvenidos, 640, 480);

        stage.setScene(escenaBienvenidos);
        stage.setFullScreen(true);
        stage.show();
    }

}
