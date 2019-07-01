package algocraft.herramientas;

import algocraft.errores.HerramientaRotaError;
import algocraft.vidadeobjetos.AguanteHerramienta;
import algocraft.vidadeobjetos.FortalezaHerramienta;
import algocraft.materiales.*;

public abstract class Herramienta {

    protected FortalezaHerramienta fortaleza;
    protected AguanteHerramienta aguante;
    protected String nombre;
    protected Material material;
    public double durabilidad(){
        return aguante.durabilidad();
    }
    public int fuerza(){return fortaleza.fuerza();}

    public void golpear (Material unMaterial){
        try {
            unMaterial.golpeadoCon(fortaleza);
        }catch (NullPointerException nullpointer){
            //No hay objeto a golpear en esa posicion.
        }
        if (this.durabilidad() <= 0){
            throw new HerramientaRotaError();
        }
        this.desgastate();
    }
    public void desgastate(){
        aguante.desgastate(fortaleza);
    }
//    public abstract Herramienta rompete();
    public String getNombre(){
        return (nombre + material.darNombre());
    }

}
