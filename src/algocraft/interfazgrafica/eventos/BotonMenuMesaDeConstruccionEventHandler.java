package algocraft.interfazgrafica.eventos;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;

public class BotonMenuMesaDeConstruccionEventHandler implements EventHandler<ActionEvent> {
    private BotonMesaDeConstruccion vistaMesaDeConstruccion;
    private ImageView imagen;
    private MenuItem boton;
    public BotonMenuMesaDeConstruccionEventHandler(BotonMesaDeConstruccion botonMesaDeConstruccion, MenuItem unBoton, ImageView imagen){
        vistaMesaDeConstruccion = botonMesaDeConstruccion;
        this.imagen = imagen;
        unBoton.setDisable(true);
    }
    @Override
    public void handle(ActionEvent actionEvent) {
        vistaMesaDeConstruccion.setGraphic(imagen);
    }
}
