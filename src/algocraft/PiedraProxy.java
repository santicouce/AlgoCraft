package algocraft;

public class PiedraProxy extends Material {
    private Piedra piedra = new Piedra();

    @Override
    public int durabilidad(){
        return piedra.durabilidad();
    }
    @Override
    public void serGolpeadaPor(Herramienta unaHerramienta) {
        unaHerramienta.daniar(piedra);
    }

    @Override
    public void daniar(PicoFino unPicoFino) {
        //UNA PIEDRA PROXY NO PUEDE DANIAR UN PICO FINO
    }
}
