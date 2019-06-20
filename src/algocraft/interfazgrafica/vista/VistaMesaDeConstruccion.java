package algocraft.interfazgrafica.vista;

import algocraft.interfazgrafica.eventos.BotonMesaDeConstruccion;
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
    public VistaMesaDeConstruccion(){
        button1 = new BotonMesaDeConstruccion();
        button2 = new BotonMesaDeConstruccion();
        button3 = new BotonMesaDeConstruccion();
        button4 = new BotonMesaDeConstruccion();
        button5 = new BotonMesaDeConstruccion();
        button6 = new BotonMesaDeConstruccion();
        button7 = new BotonMesaDeConstruccion();
        button8 = new BotonMesaDeConstruccion();
        button9 = new BotonMesaDeConstruccion();
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
    }
}
