package algocraft.interfazgrafica.vista;

import algocraft.Juego;
import algocraft.interfazgrafica.eventos.*;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class ContenedorJuego extends BorderPane{

    BarraDeMenu menuBar;
    JugadorVista jugador;
    GridPane contenedorCentral;
    Juego algoCraft;

    public ContenedorJuego(Stage stage, Juego juego) {
        this.algoCraft = juego;
        this.inicializarMenu(stage);
        this.inicializarCentro();
        this.inicializarBotonera();
    }

    private void inicializarBotonera() {

        Button botonMoverAbajo = new Button();
        botonMoverAbajo.setText("Mover Abajo");
        BotonMoverAbajoEventHandler moverButtonHandler = new BotonMoverAbajoEventHandler(jugador, algoCraft);
        botonMoverAbajo.setOnAction(moverButtonHandler);

        Button botonMoverArriba = new Button();
        botonMoverArriba.setText("Mover Arriba");
        BotonMoverArribaEventHandler moverArribaEventHandler = new BotonMoverArribaEventHandler(jugador, algoCraft);
        botonMoverArriba.setOnAction(moverArribaEventHandler);

        Button botonMoverIzquierda = new Button();
        botonMoverIzquierda.setText("Mover Izquierda");
        BotonMoverIzquierdaEventHandler moverIzquierdaEventHandler = new BotonMoverIzquierdaEventHandler(jugador, algoCraft);
        botonMoverIzquierda.setOnAction(moverIzquierdaEventHandler);

        Button botonMoverDerecha = new Button();
        botonMoverDerecha.setText("Mover Derecha");
        BotonMoverDerechaEventHandler moverDerechaEventHandler = new BotonMoverDerechaEventHandler(jugador, algoCraft);
        botonMoverDerecha.setOnAction(moverDerechaEventHandler);

        VBox contenedorVertical = new VBox(botonMoverAbajo, botonMoverArriba, botonMoverIzquierda, botonMoverDerecha);
        contenedorVertical.setSpacing(10);
        contenedorVertical.setPadding(new Insets(15));

        this.setLeft(contenedorVertical);
    }

    private void inicializarMenu(Stage stage) {
        this.menuBar = new BarraDeMenu(stage);
        this.setTop(menuBar);
    }

    private void inicializarCentro() {
        contenedorCentral = new GridPane();
        this.actualizarImgagen();
        Image imagen = new Image("file:src/algocraft/interfazgrafica/vista/imagenes/pasto.jpg");
        BackgroundImage imagenDeFondo = new BackgroundImage(imagen, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        this.setBackground(new Background(imagenDeFondo));
        this.setCenter(contenedorCentral);
        this.setOnKeyPressed(new TeclaPulsadaEventHandler(algoCraft, jugador));

    }
    public void actualizarImgagen(){
        int length = 10;
        int width = 10;
        Image imagen = new Image("file:src/algocraft/interfazgrafica/vista/imagenes/stevefrente.png");
        ImageView vistaImagen = new ImageView();
        vistaImagen.setFitWidth(50);
        vistaImagen.setFitHeight(50);
        vistaImagen.setImage(imagen);
        this.jugador = new JugadorVista(this, vistaImagen);
        for(int x= 0; x < length; x++){
            for(int y = 0; y < width; y++){
                String nombreDeElemento = algoCraft.darNombre(x,y);
                if(!nombreDeElemento.isEmpty()){
                    imagen = new Image("file:src/algocraft/interfazgrafica/vista/imagenes/" + nombreDeElemento + ".png");
                    vistaImagen = new ImageView();
                    vistaImagen.setFitWidth(50);
                    vistaImagen.setFitHeight(50);
                    vistaImagen.setImage(imagen);
                    contenedorCentral.add(vistaImagen, x, y);
                }
            }
        }
    }
    public void eliminarImager(){
        contenedorCentral.getChildren().clear();
    }
}
