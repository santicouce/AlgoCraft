package algocraft.interfazgrafica.vista;

import algocraft.Juego;
import algocraft.interfazgrafica.eventos.*;
import algocraft.jugador.Inventario;
import algocraft.jugador.Jugador;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.VBox;

import java.io.File;


public class ContenedorJuego extends BorderPane{
    private BarraDeMenu menuBar;
    private JugadorVista jugador;
    private GridPane contenedorCentral;
    private Juego algoCraft;
    private Stage stage;
    private MediaPlayer mediaPlayer;
    public ContenedorJuego(Stage stage, Juego juego) {
        this.algoCraft = juego;
        this.stage = stage;
        this.inicializarMenu(stage);
        this.inicializarCentro();
        this.inicializarBotonera();
        String s = "musica/m.mp3";
        Media media = new Media(new File(s).toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setVolume(0.2);
    }

    private void inicializarBotonera() {
        ListView<String> listView = new ListView<String>();
        ObservableList<String> items = FXCollections.observableArrayList (
                "Madera", "Piedra", "Metal", "Diamante", "Hacha De Madera", "Hacha De Piedra", "Hacha De Metal",
                "Pico De Madera", "Pico De Piedra", "Pico De Metal", "Pico Fino");
        listView.setItems(items);
        Image madera  = new Image("file:src/algocraft/interfazgrafica/vista/imagenes/maderaMenu.png");
        Image piedra  = new Image("file:src/algocraft/interfazgrafica/vista/imagenes/piedramenu.png");
        Image metal  = new Image("file:src/algocraft/interfazgrafica/vista/imagenes/metalmenu.png");
        Image diamante = new Image("file:src/algocraft/interfazgrafica/vista/imagenes/diamantemenu.png");
        Image hachamadera = new Image("file:src/algocraft/interfazgrafica/vista/imagenes/hachamaderamenu.png");
        Image hachapiedra = new Image("file:src/algocraft/interfazgrafica/vista/imagenes/hachapiedra.png");
        Image hachametal = new Image("file:src/algocraft/interfazgrafica/vista/imagenes/hachametal.png");
        Image picomadera = new Image("file:src/algocraft/interfazgrafica/vista/imagenes/picomadera.png");
        Image picopiedra = new Image("file:src/algocraft/interfazgrafica/vista/imagenes/picopiedra.png");
        Image picometal = new Image("file:src/algocraft/interfazgrafica/vista/imagenes/picometal.png");
        Image picofino = new Image("file:src/algocraft/interfazgrafica/vista/imagenes/picofino.jpg");
        Image[] listOfImages = {madera, piedra, metal, diamante, hachamadera, hachapiedra, hachametal, picomadera, picopiedra,
        picometal, picofino};
        Image imagen = new Image("file:src/algocraft/interfazgrafica/vista/imagenes/azul.png");
        BackgroundImage imagenDeFondo = new BackgroundImage(imagen, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);

        Jugador jugador = algoCraft.darJugador();

        listView.setPrefHeight(397);
        listView.setCellFactory(param -> new ListCell<String>() {
            private ImageView imageView = new ImageView();
            @Override

            public void updateItem(String name, boolean empty) {
                super.updateItem(name, empty);
                if (empty) {
                    setText(null);
                    setGraphic(null);
                } else {
                    if(name.equals("Madera")){
                        imageView.setImage(listOfImages[0]);
                        setText(name +": " + jugador.cantidadDe("madera"));
                    } else if(name.equals("Piedra")){
                        imageView.setImage(listOfImages[1]);
                        setText(name +": " + jugador.cantidadDe("piedra"));
                    } else if(name.equals("Metal")){
                        imageView.setImage(listOfImages[2]);
                        setText(name +": " + jugador.cantidadDe("metal"));
                    } else if(name.equals("Diamante")){
                        imageView.setImage(listOfImages[3]);
                        setText(name +": " + jugador.cantidadDe("diamante"));
                    }else if(name.equals("Hacha De Madera")){
                        imageView.setImage(listOfImages[4]);
                    }else if(name.equals("Hacha De Piedra")){
                        imageView.setImage(listOfImages[5]);
                    }else if(name.equals("Hacha De Metal")){
                        imageView.setImage(listOfImages[6]);
                    } else if(name.equals("Pico De Madera")){
                        imageView.setImage(listOfImages[7]);
                    }else if(name.equals("Pico De Piedra")){
                        imageView.setImage(listOfImages[8]);
                    }else if(name.equals("Pico De Metal")){
                        imageView.setImage(listOfImages[9]);
                    }else if(name.equals("Pico Fino")){
                        imageView.setImage(listOfImages[10]);
                    }

                    imageView.setFitHeight(30);
                    imageView.setFitWidth(30);
                //    setText(name + ":  0");
                    setGraphic(imageView);
                    setBackground(new Background(imagenDeFondo));
                }
            }
        });
        ImageView imageView = new ImageView(hachamadera);
        imageView.setFitWidth(30);
        imageView.setFitHeight(30);
        Button button = new Button("Desequipar");
        HBox hBox = new HBox(new Label("Hacha De Madera"), imageView, button);
        hBox.setAlignment(Pos.CENTER);

        SeparadorMenu separadorInventario = new SeparadorMenu("   Inventario");
        SeparadorMenu separadorHerramientaEquipada = new SeparadorMenu("   Herramienta Equipada");
        SeparadorMenu separadorMesaDeConstruccion = new SeparadorMenu("   Mesa De Construccion");

        VistaMesaDeConstruccion mesaDeConstruccion = new VistaMesaDeConstruccion();
        Button botonBorranMesaDeConstruccion = new Button("Borrar Todo");
        botonBorranMesaDeConstruccion.setOnAction(new BotonBorrarEventHandler(mesaDeConstruccion));
        Button botonConstruirHerramienta = new Button("Construir");
        HBox botonesControlMesaDeConstruccion = new HBox(botonConstruirHerramienta, botonBorranMesaDeConstruccion);
        botonesControlMesaDeConstruccion.setAlignment(Pos.CENTER);
        VBox botonera = new VBox(separadorInventario, listView, separadorHerramientaEquipada, hBox, separadorMesaDeConstruccion,
                mesaDeConstruccion, botonesControlMesaDeConstruccion);
        botonera.setBackground(new Background(imagenDeFondo));
        botonera.setAlignment(Pos.TOP_CENTER);
        this.setLeft(botonera);
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
        contenedorCentral.setBackground(new Background(imagenDeFondo));
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
        mediaPlayer.setAutoPlay(true);
    }
}
