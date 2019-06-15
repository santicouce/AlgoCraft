package algocraft.materiales;

import algocraft.vidaDeObjetos.FortalezaHerramienta;
import algocraft.Observable;
import algocraft.herramientas.Herramienta;
import algocraft.herramientas.PicoFino;

public abstract class Material implements Observable {

    protected int durabilidad;
    protected char id;

    public int durabilidad(){
        return this.durabilidad;
    }
    public char id(){ return this.id; }
    public void serGolpeadaPor(Herramienta unaHerramienta){
        durabilidad = unaHerramienta.reducir(durabilidad);
    }
    public abstract void daniar(PicoFino unPicoFino);

    public void daniadoCon(FortalezaHerramienta fuerzaHerramienta){
        durabilidad = fuerzaHerramienta.daniar(durabilidad);
    }
}
