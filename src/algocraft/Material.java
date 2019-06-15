package algocraft;

public abstract class Material implements Observable {

    protected int durabilidad;

    public int durabilidad(){
        return this.durabilidad;
    }

    public void serGolpeadaPor(Herramienta unaHerramienta){
        durabilidad = unaHerramienta.reducir(durabilidad);
    }
    public abstract void daniar(PicoFino unPicoFino);
}
