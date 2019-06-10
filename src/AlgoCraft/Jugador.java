package AlgoCraft;
public class Jugador implements Observable {
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
    public void aniadirJugadorAlMapa(int columna, int fila){
        ubicacion = new UbicacionJugador(columna, fila);
    }
    public void moverA(Direccion unaDireccion) {
        try{
            ubicacion.moverJugadorA(this, unaDireccion);
        }catch (MovimientoInvalidoError e){}
    }
}
