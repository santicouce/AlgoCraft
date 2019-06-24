package algocraft.interfazgrafica.eventos;

import algocraft.interfazgrafica.vista.VistaMesaDeConstruccion;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonConstruirEventHandler implements EventHandler<ActionEvent> {

    private VistaMesaDeConstruccion mesaDeConstruccion;

    public BotonConstruirEventHandler(VistaMesaDeConstruccion mesaDeConstruccion){
        this.mesaDeConstruccion = mesaDeConstruccion;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        mesaDeConstruccion.construir();
    }
}
