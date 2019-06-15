package algocraft.herramientas;

import algocraft.vidaDeObjetos.AguantePicoFino;
import algocraft.vidaDeObjetos.FortalezaPicoFino;
import algocraft.materiales.MaterialDeConstruccion;

public class PicoFino extends Herramienta {
    public PicoFino(MaterialDeConstruccion unMaterialDeConstruccion, MaterialDeConstruccion otroMaterialdeConstruccion){
        fortaleza = new FortalezaPicoFino();
        aguante = new AguantePicoFino();
        unMaterialDeConstruccion.inicializar(fortaleza);
        otroMaterialdeConstruccion.inicializar(aguante);
    }
}
