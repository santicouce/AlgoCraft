package algocraft.interfazgrafica.vista;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.HBox;

public class VistaItemInventario extends HBox {
    public VistaItemInventario (String etiqueta, Image imagen, BackgroundImage imagenDeFondo){
        Label label = new Label(etiqueta);
        ImageView imagenDeMaterial = new ImageView(imagen);
        imagenDeMaterial.setFitWidth(30);
        imagenDeMaterial.setFitHeight(30);
        HBox hBox1 = new HBox(imagenDeMaterial, label, new Button("ATR PAPU"));
        hBox1.setSpacing(20);
        hBox1.setBackground(new Background(imagenDeFondo));
    }
}
