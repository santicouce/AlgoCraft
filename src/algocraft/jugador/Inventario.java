package algocraft.jugador;

import algocraft.herramientas.Herramienta;

import java.util.ArrayList;
import java.util.List;

public class Inventario {

    private List<Herramienta> herramientas;

    public Inventario(){
        herramientas = new ArrayList<>();
    }

    public void extraerHerramienta() { herramientas.remove(0); }


    public void aniadirHerramienta(Herramienta herramienta) {
        herramientas.add(herramienta);
    }

}
