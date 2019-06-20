package algocraft.jugador;

import algocraft.herramientas.Herramienta;
import algocraft.materiales.*;

import java.util.ArrayList;
import java.util.List;

public class Inventario {

    private List<Herramienta> herramientas;
    private List<Madera> maderas;
    private List<Piedra> piedras;
    private List<Metal> metales;
    private List<Diamante> diamantes;
    public Inventario(){
        maderas = new ArrayList<>();
        piedras = new ArrayList<>();
        metales = new ArrayList<>();
        diamantes = new ArrayList<>();
        herramientas = new ArrayList<>();
    }


    public Madera extraerMadera(){
        return maderas.remove(0);
    }
    public Piedra extraerPiedra(){
        return piedras.remove(0);
    }
    public Metal extraerMetal(){
        return metales.remove(0);
    }

    public void extraerHerramienta() { herramientas.remove(0); }

    public boolean validarStockDePiedra() {
        if (piedras.isEmpty()) { return false; };
        return true;
    }
    public boolean validarStockDeMetal() {
        if (metales.isEmpty()) { return false; };
        return true;
    }
    public boolean validarStockDeMadera() {
        if (piedras.isEmpty()) { return false; };
        return true;
    }

    public void aniadirHerramienta(Herramienta herramienta) {
        herramientas.add(herramienta);
    }

    public void aniadirDiamante(Diamante diamante) {
        diamantes.add(diamante);
    }
    public void aniadirMetal(Metal metal) {metales.add(metal); }
    public void aniadirMadera(Madera madera){
        maderas.add(madera);
    }
    public void aniadirPiedra(Piedra piedra){
        piedras.add(piedra);
    }

    public int cantidadDeMadera(){return maderas.size();}
    public int cantidadDePiedra(){return piedras.size();}
    public int cantidadDeMetal(){return metales.size();}
    public int cantidadDeDiamante(){return diamantes.size();}
}
