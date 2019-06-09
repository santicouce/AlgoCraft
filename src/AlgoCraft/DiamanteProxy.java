package AlgoCraft;

public class DiamanteProxy extends  Material{
    Diamante diamante = new Diamante();
    @Override
    public int durabilidad(){
        return diamante.durabilidad();
    }
    public void serGolpeadaPor(Herramienta unaHerramienta){
        if(unaHerramienta.esUnPicoFino()){
            diamante.serGolpeadaPor(unaHerramienta);
        }
    }
}
