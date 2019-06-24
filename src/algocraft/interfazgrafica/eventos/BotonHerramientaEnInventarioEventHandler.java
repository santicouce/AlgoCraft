package algocraft.interfazgrafica.eventos;

import algocraft.jugador.Jugador;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class BotonHerramientaEnInventarioEventHandler implements EventHandler<MouseEvent> {
    private String nombreDeHerramienta;
    private Jugador jugador;
    public BotonHerramientaEnInventarioEventHandler(String nombreDeHerramienta, Jugador jugador){
        this.nombreDeHerramienta = nombreDeHerramienta;
        this.jugador = jugador;
    }
    @Override
    public void handle(MouseEvent mouseEvent) {
        jugador.equiparHerramienta(nombreDeHerramienta);
    }
}
