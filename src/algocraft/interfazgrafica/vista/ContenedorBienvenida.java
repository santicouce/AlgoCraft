package algocraft.interfazgrafica.vista;

import algocraft.interfazgrafica.eventos.BotonEntrarEventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class ContenedorBienvenida extends VBox {

    Stage stage;

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
        BotonEntrarEventHandler botonEntrarHandler = new BotonEntrarEventHandler(stage, proximaEscena);
        botonEntrar.setOnAction(botonEntrarHandler);

        this.getChildren().addAll(vistaLogo, botonEntrar);
    }

}
