package algocraft.interfazgrafica.vista;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class ContenedorJuego extends BorderPane{

    BarraDeMenu menuBar;
    Canvas canvasCentral;
    GridPane contenedorCentral;

    public ContenedorJuego(Stage stage) {
        this.inicializarMenu(stage);
        this.inicializarCentro();
        this.inicializarBotonera();
    }

    private void inicializarBotonera() {

        Button botonMover = new Button();
        botonMover.setText("Mover");

        Button botonDireccion = new Button();
        botonDireccion.setText("Cambiar direccion");

        VBox contenedorVertical = new VBox(botonMover, botonDireccion);
        contenedorVertical.setSpacing(10);
        contenedorVertical.setPadding(new Insets(15));

        this.setLeft(contenedorVertical);
    }

    private void inicializarMenu(Stage stage) {
        this.menuBar = new BarraDeMenu(stage);
        this.setTop(menuBar);
    }

    private void inicializarCentro() {

        int length = 16;
        int width = 27;

        contenedorCentral = new GridPane();

        for(int y = 0; y < length; y++){
            for(int x = 0; x < width; x++){

                Image imagen = new Image("file:src/algocraft/interfazgrafica/vista/imagenes/madera1.png");
                ImageView tf = new ImageView();
                tf.setFitWidth(50);
                tf.setFitHeight(50);
                tf.setImage(imagen);

                contenedorCentral.setRowIndex(tf,y);
                contenedorCentral.setColumnIndex(tf,x);
                contenedorCentral.getChildren().add(tf);
            }
        }
        Image imagen = new Image("file:src/algocraft/interfazgrafica/vista/imagenes/pasto.jpg");
        BackgroundImage imagenDeFondo = new BackgroundImage(imagen, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        this.setBackground(new Background(imagenDeFondo));
        this.setCenter(contenedorCentral);
    }
}
