package algocraft;

public abstract class Herramienta {

    protected FortalezaHerramienta fortaleza;
    protected AguanteHerramienta aguante;

    public double durabilidad(){
        return aguante.durabilidad();
    }
    public void golpear (Material unMaterial){
        unMaterial.daniadoCon(fortaleza);
        aguante.desgastate(fortaleza);
    }
    public int reducir(int unaDurabilidad){return 0;}
    public void daniar(Material unMaterial){}
    public void desgastate(){
    }
    public void rompete(){}
}
