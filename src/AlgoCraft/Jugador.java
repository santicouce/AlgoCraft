package AlgoCraft;
public class Jugador implements Colocable{
    Inventario inventario = new Inventario();
    Mano mano = new Mano();
    UbicacionJugador ubicacion;
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
    public void aniadirJugadorAlMapa(Mapa mapa, int columna, int fila){
        ubicacion = new UbicacionJugador(mapa, columna, fila);
    }
    public void moverALaIzquierda(){
        ubicacion.moverALaIzquierda(this);
    }

}
