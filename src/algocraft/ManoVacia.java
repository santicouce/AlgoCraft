package algocraft;

public class ManoVacia implements EstadoMano{
    @Override
    public void golpear(Material unMaterial) {
        //UNA MANO VACIA NO GOLPEA
    }

    @Override
    public void guardarHerramientaEn(Inventario unInventario) {
        //UNA MANO VACIA NO PUEDE GUARDAR HERRAMIENTAS
    }
}
