package algocraft.interfazgrafica.vista;


import algocraft.interfazgrafica.eventos.BotonSalirEventHandler;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class BarraDeMenu extends MenuBar {

    public BarraDeMenu(Stage stage) {

        Menu menuArchivo = new Menu("Archivo");
        MenuItem opcionSalir = new MenuItem("Salir");

        BotonSalirEventHandler opcionSalirHandler = new BotonSalirEventHandler();
        opcionSalir.setOnAction(opcionSalirHandler);
        menuArchivo.getItems().addAll(opcionSalir);

        this.getMenus().addAll(menuArchivo);
    }
}