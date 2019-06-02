package Objetos;

import java.util.ArrayList;
import java.util.List;

public class Jugador {

    private List<Herramienta> herramientasDisponibles = new ArrayList<Herramienta>();

    public Jugador(){

        Hacha hacha = new Hacha(new Madera());
        herramientasDisponibles.add(hacha);
    }

   // public boolean contieneHerramienta(Herramienta herramienta){

     //   return herramientasDisponibles.contains(herramienta);
    //}


}
