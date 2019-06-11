package AlgoCraft;

public class MetalProxy extends Material{
    private Metal metal = new Metal();
    @Override
    public int durabilidad(){
        return metal.durabilidad();
    }
    @Override
    public void serGolpeadaPor(Herramienta unaHerramienta) {
        unaHerramienta.daniar(metal);
    }
}
