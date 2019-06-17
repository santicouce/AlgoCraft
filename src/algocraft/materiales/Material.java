package algocraft.materiales;

import algocraft.construcciondeherramientas.Id;
import algocraft.vidadeobjetos.FortalezaHerramienta;
import algocraft.Observable;
import algocraft.herramientas.PicoFino;

public abstract class Material implements Observable {

    protected int durabilidad;
    public Id id; //agregué esto

    public int durabilidad(){
        return this.durabilidad;
    }
    public int id(){ return this.id.getNumeroDeId(); } //agregué esto

    public void daniadoCon(FortalezaHerramienta fuerzaHerramienta){
        durabilidad = fuerzaHerramienta.daniar(durabilidad);
    }
    public abstract void golpeadoCon(FortalezaHerramienta fortalezaHerramienta);
    public abstract void impactadoCon(PicoFino picoFino);
}
