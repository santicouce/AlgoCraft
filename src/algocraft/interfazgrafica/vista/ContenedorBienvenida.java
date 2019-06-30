package algocraft.interfazgrafica.vista;

import algocraft.interfazgrafica.eventos.BotonEntrarEventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.File;
public class ContenedorBienvenida extends VBox {

    Stage stage;
    MediaPlayer mediaPlayer;

    public ContenedorBienvenida(Stage stage, Scene proximaEscena) {
        super();

        this.stage = stage;

        this.setAlignment(Pos.CENTER);
        this.setSpacing(20);
        this.setPadding(new Insets(25));
        Image imagen = new Image("file:src/algocraft/interfazgrafica/vista/imagenes/fondo-web-12.jpg");

        BackgroundImage imagenDeFondo = new BackgroundImage(imagen, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        this.setBackground(new Background(imagenDeFondo));

        Button botonEntrar = new Button();
        botonEntrar.setGraphic(new ImageView(new Image("file:src/algocraft/interfazgrafica/vista/imagenes/n.png")));

        Image logo = new Image("file:src/algocraft/interfazgrafica/vista/imagenes/ALGOCRAFT.png");
        ImageView vistaLogo = new ImageView(logo);
        BotonEntrarEventHandler botonEntrarHandler = new BotonEntrarEventHandler(stage, proximaEscena, this);
        botonEntrar.setOnAction(botonEntrarHandler);

        String s = "musica/DatGroove.mp3";
        Media media = new Media(new File(s).toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setVolume(0.2);
        this.getChildren().addAll(vistaLogo, botonEntrar);
        mediaPlayer.setAutoPlay(true);
    }
    public void pararMusica(){
        mediaPlayer.pause();
    }

}
