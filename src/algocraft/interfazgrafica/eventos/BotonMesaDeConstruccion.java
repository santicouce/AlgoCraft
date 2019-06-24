package algocraft.interfazgrafica.eventos;

import algocraft.interfazgrafica.vista.VistaMesaDeConstruccion;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BotonMesaDeConstruccion extends MenuButton {
    private ImageView cofre = new ImageView(new Image("file:src/algocraft/interfazgrafica/vista/imagenes/cofre.png"));
    private int columna;
    private int fila;
    private VistaMesaDeConstruccion mesaDeConstruccion;
    public BotonMesaDeConstruccion(int columna, int fila, VistaMesaDeConstruccion mesaDeConstruccion){
        ImageView madera = new ImageView(new Image("file:src/algocraft/interfazgrafica/vista/imagenes/maderamenu.png"));
        ImageView metal = new ImageView(new Image("file:src/algocraft/interfazgrafica/vista/imagenes/metalmenu.png"));
        ImageView piedra = new ImageView(new Image("file:src/algocraft/interfazgrafica/vista/imagenes/piedramenu.png"));
        metal.setFitHeight(30);
        metal.setFitWidth(30);
        piedra.setFitWidth(30);
        piedra.setFitHeight(30);
        madera.setFitWidth(30);
        madera.setFitHeight(30);
        cofre.setFitHeight(30);
        cofre.setFitWidth(30);
        this.columna = columna;
        this.fila = fila;
        this.mesaDeConstruccion = mesaDeConstruccion;
        MenuItem menuMadera = new MenuItem("Madera");
        menuMadera.setOnAction(new BotonMenuMesaDeConstruccionEventHandler(this, menuMadera, madera, "madera"));
        MenuItem menuPiedra = new MenuItem("Piedra");
        menuPiedra.setOnAction(new BotonMenuMesaDeConstruccionEventHandler(this, menuPiedra, piedra, "piedra"));
        MenuItem menuMetal = new MenuItem("Metal");
        menuMetal.setOnAction(new BotonMenuMesaDeConstruccionEventHandler(this, menuMetal, metal, "metal"));
        this.getItems().addAll(menuMadera, menuPiedra, menuMetal);
        this.setGraphic(cofre);
    }
    public void borrar(){
        this.setGraphic(cofre);
    }

    public void aniadirMaterial(String unMaterial){
        mesaDeConstruccion.aniadirMaterialEnPosicion(columna, fila, unMaterial);
    }
}
