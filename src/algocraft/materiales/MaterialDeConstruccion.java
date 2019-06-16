package algocraft.materiales;

import algocraft.vidadeobjetos.AguanteHerramienta;
import algocraft.vidadeobjetos.FortalezaHerramienta;
import algocraft.vidadeobjetos.FortalezaPico;

public  abstract class MaterialDeConstruccion extends Material {
    public abstract void inicializar(FortalezaHerramienta fuerzaHerramienta);
    public abstract void inicializar(AguanteHerramienta durabilidadHerramienta);
    public abstract void daniarCon(Metal unMetal, FortalezaPico fortalezaPico);
}
