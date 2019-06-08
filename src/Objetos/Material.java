package Objetos;

public abstract class Material {

    protected int durabilidad;

    public int durabilidad(){
        return this.durabilidad;
    }

    public abstract void serGolpeadaPor(Herramienta unaHerramienta);

}
