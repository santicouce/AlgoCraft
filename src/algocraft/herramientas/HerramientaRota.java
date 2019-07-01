package algocraft.herramientas;

import algocraft.errores.GolpeInvalidoError;
import algocraft.materiales.Material;
import javafx.beans.binding.ObjectExpression;

public class HerramientaRota extends Herramienta{

    @Override
    public void golpear(Material unMaterial){
        throw new GolpeInvalidoError();
    }

    public Herramienta rompete(){
        return this;
    }
}
