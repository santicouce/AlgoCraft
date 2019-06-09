package AlgoCraft;
public class Jugador {
    Inventario inventario = new Inventario();
    Mano mano = new Mano();
    public Jugador(){
        Hacha hacha = new Hacha(new Madera());
        mano.aniadirHerramienta(hacha);
    }
    public void golpear(Material unMaterial){
        mano.golpear(unMaterial);
    }
    public void desequiparHerramientaEnMano(){
        mano.guardarHerramientaEn(inventario);
    }

}
