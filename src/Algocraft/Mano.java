package Algocraft;

public class Mano {
    private EstadoMano estadoMano;
    public Mano(){
        estadoMano = new ManoVacia();
    }
    public void golpear(Material unMaterial){
        estadoMano.golpear(unMaterial);
    }
    public void equiparHerramienta(Herramienta unaHerramienta){
        estadoMano = new ManoLlena(unaHerramienta);
    }
    public void guardarHerramientaEn(Inventario unInventario){
        estadoMano.guardarHerramientaEn(unInventario);
        estadoMano = new ManoVacia();
    }
}
