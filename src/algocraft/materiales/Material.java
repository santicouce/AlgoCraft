package algocraft.materiales;

import algocraft.construcciondeherramientas.FabricaDeHacha;
import algocraft.vidadeobjetos.FortalezaHerramienta;
import algocraft.Observable;
import algocraft.herramientas.PicoFino;

public abstract class Material extends Observable {

    protected int durabilidad;
    String id = new String();

    public int durabilidad(){
        return this.durabilidad;
    }
    public String getId(){
        return id;
    }

    public void daniadoCon(FortalezaHerramienta fuerzaHerramienta){
        durabilidad = fuerzaHerramienta.daniar(durabilidad);
    }
    public abstract void golpeadoCon(FortalezaHerramienta fortalezaHerramienta);
    public abstract void impactadoCon(PicoFino picoFino);
}
