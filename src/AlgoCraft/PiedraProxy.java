package AlgoCraft;

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
}
