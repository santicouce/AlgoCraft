package algocraft.interfazgrafica.eventos;

import algocraft.interfazgrafica.vista.VistaMesaDeConstruccion;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonBorrarEventHandler implements EventHandler<ActionEvent> {
    private VistaMesaDeConstruccion mesaDeConstruccion;
    public BotonBorrarEventHandler(VistaMesaDeConstruccion unaMesaDeConstruccion){
        mesaDeConstruccion = unaMesaDeConstruccion;
    }
    @Override
    public void handle(ActionEvent actionEvent) {
        mesaDeConstruccion.borrarSinConstruir();
    }
}
