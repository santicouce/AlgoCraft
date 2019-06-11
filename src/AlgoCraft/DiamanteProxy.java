package AlgoCraft;

public class DiamanteProxy extends  Material{
    Diamante diamante = new Diamante();
    @Override
    public int durabilidad(){
        return diamante.durabilidad();
    }
    public void serGolpeadaPor(Herramienta unaHerramienta){
        unaHerramienta.daniar(diamante);
    }

    @Override
    public void daniar(PicoFino unPicoFino) {
     //UN DIAMANTEPROXY NO PUEDE DANIAR UN PICO FINO
    }
}
