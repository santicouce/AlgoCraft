package AlgoCraft;

public abstract class Material implements Observable {

    protected int durabilidad;

    public int durabilidad(){
        return this.durabilidad;
    }

    public void serGolpeadaPor(Herramienta unaHerramienta){
        durabilidad = unaHerramienta.reducir(durabilidad);
    }
}
