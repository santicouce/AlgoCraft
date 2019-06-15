package algocraft.herramientas;

import algocraft.vidaDeObjetos.AguanteHacha;
import algocraft.vidaDeObjetos.FortalezaHacha;
import algocraft.materiales.MaterialDeConstruccion;

public class Hacha extends Herramienta {

    public Hacha(MaterialDeConstruccion unMaterial) {
        fortaleza = new FortalezaHacha();
        aguante = new AguanteHacha();
        unMaterial.inicializar(fortaleza);
        unMaterial.inicializar(aguante);
    }
}
