package algocraft;

public class Hacha extends Herramienta {

    public Hacha(MaterialDeConstruccion unMaterial) {
        fortaleza = new FortalezaHacha();
        aguante = new AguanteHacha();
        unMaterial.inicializar(fortaleza);
        unMaterial.inicializar(aguante);
    }
}
