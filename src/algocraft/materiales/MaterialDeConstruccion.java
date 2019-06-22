package algocraft.materiales;

import algocraft.herramientas.Herramienta;
import algocraft.vidadeobjetos.AguanteHerramienta;
import algocraft.vidadeobjetos.FortalezaHerramienta;
import algocraft.vidadeobjetos.FortalezaPico;

import java.util.HashMap;
import java.util.List;

public  abstract class MaterialDeConstruccion extends Material {

    public abstract void inicializar(FortalezaHerramienta fuerzaHerramienta);
    public abstract void inicializar(AguanteHerramienta durabilidadHerramienta);
    public abstract void daniarCon(Metal unMetal, FortalezaPico fortalezaPico);

    public abstract void construirHacha(String identificadorDelTablero, HashMap<String, List<Herramienta>> InventarioHerramientas);
    public abstract void construirPico(String identificadorDelTablero, HashMap<String, List<Herramienta>> InventarioHerramientas);
}
