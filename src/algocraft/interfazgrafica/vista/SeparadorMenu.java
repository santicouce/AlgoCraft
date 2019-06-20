package algocraft.interfazgrafica.vista;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

public class SeparadorMenu extends HBox {
    public SeparadorMenu(String nombreSeparador){
        Label label = new Label(nombreSeparador);
        this.getChildren().add(label);
        Image fondoitem = new Image("file:src/algocraft/interfazgrafica/vista/imagenes/gris.png");
        BackgroundImage fondoItem = new BackgroundImage(fondoitem, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        this.setAlignment(Pos.CENTER);
        this.setBackground(new Background(fondoItem));
    }
}
