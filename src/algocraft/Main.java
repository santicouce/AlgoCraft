package algocraft;

import algocraft.interfazgrafica.vista.ContenedorBienvenida;
import algocraft.interfazgrafica.vista.ContenedorJuego;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.File;


public class  Main extends Application{

    private Juego algoCraft = new Juego();
    private MediaPlayer mediaPlayer;
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

    /*    String s = "musica/m.mp3";
        Media media = new Media(new File(s).toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setVolume(0.2);
*/
        stage.setScene(escenaBienvenidos);
        stage.setFullScreen(true);
        stage.show();
//        mediaPlayer.setAutoPlay(true);
    }

}
