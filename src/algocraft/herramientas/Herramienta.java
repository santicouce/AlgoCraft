package algocraft.herramientas;

import algocraft.construcciondeherramientas.Id;
import algocraft.vidadeobjetos.AguanteHerramienta;
import algocraft.vidadeobjetos.FortalezaHerramienta;
import algocraft.materiales.*;

public abstract class Herramienta {

    protected FortalezaHerramienta fortaleza;
    protected AguanteHerramienta aguante;
    protected Id id;

    public double durabilidad(){
        return aguante.durabilidad();
    }
    public int fuerza(){return fortaleza.fuerza();}

    public void golpear (Material unMaterial){
        unMaterial.golpeadoCon(fortaleza);
        this.desgastate();
    }
    public void desgastate(){
        aguante.desgastate(fortaleza);
    }
    public void rompete(){}
    public int Id(){ return this.id.getNumeroDeId();}
}
