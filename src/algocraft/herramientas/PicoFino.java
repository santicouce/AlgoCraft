package algocraft.herramientas;

import algocraft.errores.GolpeInvalidoError;
import algocraft.materiales.*;
import algocraft.vidadeobjetos.AguantePicoFino;
import algocraft.vidadeobjetos.FortalezaPicoFino;

public class PicoFino extends Herramienta {
    public PicoFino(MaterialDeConstruccion unMaterialDeConstruccion, MaterialDeConstruccion otroMaterialdeConstruccion){
        fortaleza = new FortalezaPicoFino();
        aguante = new AguantePicoFino();
        unMaterialDeConstruccion.inicializar(fortaleza);
        otroMaterialdeConstruccion.inicializar(aguante);
        nombre = "pico fino";
    }

    @Override
    public void golpear (Material unMaterial) {

        if (this.durabilidad() <= 0) {
            throw new GolpeInvalidoError();
        }
        unMaterial.golpeadoCon(fortaleza);
        unMaterial.impactadoCon(this);
    }

    @Override
    public String getNombre(){
        return (nombre);
    }

}
