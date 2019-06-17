package algocraft.herramientas;

import algocraft.construcciondeherramientas.IdPicoFino;
import algocraft.materiales.*;
import algocraft.vidadeobjetos.AguantePicoFino;
import algocraft.vidadeobjetos.FortalezaPicoFino;

public class PicoFino extends Herramienta {
    public PicoFino(MaterialDeConstruccion unMaterialDeConstruccion, MaterialDeConstruccion otroMaterialdeConstruccion){
        fortaleza = new FortalezaPicoFino();
        aguante = new AguantePicoFino();
        unMaterialDeConstruccion.inicializar(fortaleza);
        otroMaterialdeConstruccion.inicializar(aguante);
        id = new IdPicoFino();
    }
    @Override
    public void golpear (Material unMaterial){
        unMaterial.golpeadoCon(fortaleza);
        unMaterial.impactadoCon(this);
    }
}
