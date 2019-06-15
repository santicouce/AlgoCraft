package algocraft.herramientas;

import algocraft.vidadeobjetos.AguantePicoFino;
import algocraft.vidadeobjetos.FortalezaPicoFino;
import algocraft.materiales.MaterialDeConstruccion;

public class PicoFino extends Herramienta {
    public PicoFino(MaterialDeConstruccion unMaterialDeConstruccion, MaterialDeConstruccion otroMaterialdeConstruccion){
        fortaleza = new FortalezaPicoFino();
        aguante = new AguantePicoFino();
        unMaterialDeConstruccion.inicializar(fortaleza);
        otroMaterialdeConstruccion.inicializar(aguante);
    }
}
