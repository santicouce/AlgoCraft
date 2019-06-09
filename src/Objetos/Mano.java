package Objetos;

public class Mano {
    private Herramienta herramienta;
    public void golpear(Material unMaterial){
        unMaterial.serGolpeadaPor(herramienta);
    }
    public void aniadirHerramienta(Herramienta unaHerramienta){
        herramienta = unaHerramienta;
    }
    public void guardarHerramientaEn(Inventario unInventario){
        unInventario.aniadirHerramienta(herramienta);
        herramienta = null;
    }
}
