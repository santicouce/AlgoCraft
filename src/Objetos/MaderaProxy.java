package Objetos;

public class MaderaProxy extends Material{
    private Material madera = new Madera();
    @Override
    public int durabilidad(){
        return madera.durabilidad();
    }
    @Override
    public void serGolpeadaPor(Herramienta unaHerramienta) {
        if(unaHerramienta.esUnHacha()){
            madera.serGolpeadaPor(unaHerramienta);
        }
    }
}
