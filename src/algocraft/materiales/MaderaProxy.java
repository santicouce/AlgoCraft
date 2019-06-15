package algocraft.materiales;

import algocraft.herramientas.Herramienta;
import algocraft.herramientas.PicoFino;

public class MaderaProxy extends Material{
    private Madera madera = new Madera();
    @Override
    public int durabilidad(){
        return madera.durabilidad();
    }
    @Override
    public void serGolpeadaPor(Herramienta unaHerramienta) {
        unaHerramienta.daniar(madera);
    }

    @Override
    public void daniar(PicoFino unPicoFino) {
        //UNA MADERAPROXY NO PUEDA DANIAR UN PICO FINO
    }
}
