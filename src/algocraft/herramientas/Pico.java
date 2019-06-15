package algocraft.herramientas;

import algocraft.vidadeobjetos.AguantePico;
import algocraft.vidadeobjetos.FortalezaPico;
import algocraft.materiales.MaterialDeConstruccion;

public class Pico extends Herramienta {
    public Pico(MaterialDeConstruccion unMaterialDeConstruccion) {
        fortaleza = new FortalezaPico();
        aguante = new AguantePico();
        unMaterialDeConstruccion.inicializar(fortaleza);
        unMaterialDeConstruccion.inicializar(aguante);
    }
}
