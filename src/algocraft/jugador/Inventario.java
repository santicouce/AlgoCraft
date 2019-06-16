package algocraft.jugador;

import algocraft.herramientas.Herramienta;
import algocraft.materiales.Material;

import java.util.ArrayList;
import java.util.List;

public class Inventario {

    private List<Herramienta> herramientas;
    private List<Material> materiales;

    public Inventario(){
        materiales = new ArrayList<>();
        herramientas = new ArrayList<>();
    }

    public void aniadirHerramienta(Herramienta unaHerramienta){
        herramientas.add(unaHerramienta);
    }
    public void aniadirMaterial(Material unMaterial){
        materiales.add(unMaterial);
    }

    public void extraerHerramienta() { herramientas.remove(0); }
    public void extraerMaterial() { materiales.remove(0); }
}
