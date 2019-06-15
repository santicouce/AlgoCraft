package algocraft.materiales;

import algocraft.herramientas.Herramienta;
import algocraft.herramientas.PicoFino;

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

    @Override
    public void daniar(PicoFino unPicoFino) {
        //UN METAL PROXY NO PUEDE NO PUEDE DESGASTAR UN PICO FINO
    }
}
