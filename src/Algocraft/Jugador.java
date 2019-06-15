package Algocraft;
public class Jugador implements Observable {
    private Inventario inventario = new Inventario();
    private Mano mano = new Mano();
    private UbicacionJugador ubicacion;
    public Jugador(){
        Hacha hacha = new Hacha(new Madera());
        mano.equiparHerramienta(hacha);
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
