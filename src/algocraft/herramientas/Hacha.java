package algocraft.herramientas;

import algocraft.materiales.*;
import algocraft.vidadeobjetos.AguanteHacha;
import algocraft.vidadeobjetos.FortalezaHacha;

public class Hacha extends Herramienta {

    public Hacha(MaterialDeConstruccion unMaterial) {
        fortaleza = new FortalezaHacha();
        aguante = new AguanteHacha();
        unMaterial.inicializar(fortaleza);
        unMaterial.inicializar(aguante);
        nombre = "hacha de ";
        material = unMaterial;
    }

}
