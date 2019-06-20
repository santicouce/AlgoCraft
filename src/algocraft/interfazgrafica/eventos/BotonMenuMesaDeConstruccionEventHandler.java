package algocraft.interfazgrafica.eventos;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.ImageView;

public class BotonMenuMesaDeConstruccionEventHandler implements EventHandler<ActionEvent> {
    private BotonMesaDeConstruccion vistaMesaDeConstruccion;
    private ImageView imagen;
    public BotonMenuMesaDeConstruccionEventHandler(BotonMesaDeConstruccion botonMesaDeConstruccion, ImageView imagen){
        vistaMesaDeConstruccion = botonMesaDeConstruccion;
        this.imagen = imagen;

    }
    @Override
    public void handle(ActionEvent actionEvent) {
        vistaMesaDeConstruccion.setGraphic(imagen);
    }
}
