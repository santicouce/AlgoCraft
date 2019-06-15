package algocraft.materiales;

import algocraft.vidaDeObjetos.AguanteHerramienta;
import algocraft.vidaDeObjetos.FortalezaHerramienta;
import algocraft.herramientas.Pico;

public  abstract class MaterialDeConstruccion extends Material {
    public abstract void daniar(Pico unPico, Metal unmetal);
    public abstract void inicializar(FortalezaHerramienta fuerzaHerramienta);
    public abstract void inicializar(AguanteHerramienta durabilidadHerramienta);
}
