package algocraft.materiales;

import algocraft.vidadeobjetos.FortalezaHerramienta;
import algocraft.Observable;
import algocraft.herramientas.PicoFino;

public abstract class Material extends Observable {

    protected int durabilidad;
    protected char id;

    public int durabilidad(){
        return this.durabilidad;
    }
    public char id(){ return this.id; }

    public void daniadoCon(FortalezaHerramienta fuerzaHerramienta){
        durabilidad = fuerzaHerramienta.daniar(durabilidad);
    }
    public abstract void golpeadoCon(FortalezaHerramienta fortalezaHerramienta);
    public abstract void impactadoCon(PicoFino picoFino);
}
