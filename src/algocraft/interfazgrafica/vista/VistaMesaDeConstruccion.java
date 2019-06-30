package algocraft.interfazgrafica.vista;

import algocraft.interfazgrafica.eventos.BotonMesaDeConstruccion;
import algocraft.jugador.Jugador;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;

public class VistaMesaDeConstruccion extends GridPane {
    private BotonMesaDeConstruccion button1;
    private BotonMesaDeConstruccion button2;
    private BotonMesaDeConstruccion button3;
    private BotonMesaDeConstruccion button4;
    private BotonMesaDeConstruccion button5;
    private BotonMesaDeConstruccion button6;
    private BotonMesaDeConstruccion button7;
    private BotonMesaDeConstruccion button8;
    private BotonMesaDeConstruccion button9;
    private Jugador jugador;
    private ContenedorJuego contenedorJuego;
    public VistaMesaDeConstruccion(Jugador unJugador, ContenedorJuego contenedorJuego){
        jugador = unJugador;
        button1 = new BotonMesaDeConstruccion(0,0, this, jugador);
        button2 = new BotonMesaDeConstruccion(1,0, this, jugador);
        button3 = new BotonMesaDeConstruccion(2,0, this, jugador);
        button4 = new BotonMesaDeConstruccion(0,1, this, jugador);
        button5 = new BotonMesaDeConstruccion(1,1, this, jugador);
        button6 = new BotonMesaDeConstruccion(2,1, this, jugador);
        button7 = new BotonMesaDeConstruccion(0,2, this, jugador);
        button8 = new BotonMesaDeConstruccion(1,2, this, jugador);
        button9 = new BotonMesaDeConstruccion(2,2, this, jugador);
        this.contenedorJuego = contenedorJuego;
        this.add(button1, 0, 0, 1, 1);
        this.add(button2, 1, 0, 1, 1);
        this.add(button3, 2, 0, 1, 1);
        this.add(button4, 0, 1, 1, 1);
        this.add(button5, 1, 1, 1, 1);
        this.add(button6, 2, 1, 1, 1);
        this.add(button7, 0, 2, 1, 1);
        this.add(button8, 1, 2, 1, 1);
        this.add(button9, 2, 2, 1, 1);
        this.setAlignment(Pos.CENTER);
    }
    public void borrar(){
        button1.borrar();
        button2.borrar();
        button3.borrar();
        button4.borrar();
        button5.borrar();
        button6.borrar();
        button7.borrar();
        button8.borrar();
        button9.borrar();
        jugador.limpiarMesaDeConstruccion();
    }
    public void aniadirMaterialEnPosicion(int columna, int fila, String unMaterial){
        jugador.aniadirMaterialEnPosicion(columna, fila, unMaterial);
    }
    public void construir(){
        jugador.fabricarUnaHerramienta();
        borrar();
        contenedorJuego.actualizarBotonera();
    }
}
