package algocraft.interfazgrafica.eventos;

import algocraft.errores.ImposibleDesequiparNingunaHerramientaError;
import algocraft.interfazgrafica.vista.VistaJuego;
import algocraft.jugador.Jugador;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class BotonHerramientaEnInventarioEventHandler implements EventHandler<MouseEvent> {
    private String nombreDeHerramienta;
    private Jugador jugador;
    private VistaJuego juego;
    private Button boton;
    public BotonHerramientaEnInventarioEventHandler(String nombreDeHerramienta, Jugador jugador, VistaJuego juego){
        this.nombreDeHerramienta = nombreDeHerramienta;
        this.jugador = jugador;
        this.juego = juego;
        if(jugador.cantidadDeHerramienta(nombreDeHerramienta) == 0){

        }
    }
    @Override
    public void handle(MouseEvent mouseEvent) {
        try{
            jugador.desequiparHerramienta();
        }catch (ImposibleDesequiparNingunaHerramientaError imposibleDesequiparNingunaHerramientaError){

        }
        jugador.equiparHerramienta(nombreDeHerramienta);
        juego.actualizar();
    }
}
