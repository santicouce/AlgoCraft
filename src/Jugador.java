package Objetos;

import java.util.ArrayList;
import java.util.List;

public class Jugador {
    Inventario inventario = new Inventario();
    public Jugador(){
        Hacha hacha = new Hacha(new Madera());
        inventario.aniadirHerramienta(hacha);
    }

}
