package algocraft.herramientas;

import algocraft.materiales.*;
import algocraft.vidadeobjetos.AguantePico;
import algocraft.vidadeobjetos.FortalezaPico;

public class Pico extends Herramienta {
    public Pico(MaterialDeConstruccion unMaterialDeConstruccion) {
        fortaleza = new FortalezaPico();
        aguante = new AguantePico();
        unMaterialDeConstruccion.inicializar(fortaleza);
        unMaterialDeConstruccion.inicializar(aguante);
        nombre = "pico de ";
        material = unMaterialDeConstruccion;
    }
}
