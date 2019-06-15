package algocraft;

public class Juego {
    private Mapa mapa = new Mapa();
    private Jugador jugador = new Jugador();

    public Juego(){
        Madera madera = new Madera();
        Piedra piedra = new Piedra();
        Metal metal = new Metal();
        Diamante diamante = new Diamante();

        mapa.aniadirElementoEnPosicion(madera , 2,2);
        mapa.aniadirElementoEnPosicion(madera , 2,3);
        mapa.aniadirElementoEnPosicion(diamante , 3,2);
        mapa.aniadirElementoEnPosicion(metal , 3,3);
        mapa.aniadirElementoEnPosicion(piedra , 5,2);
        mapa.aniadirElementoEnPosicion(madera , 7,3);
        mapa.aniadirElementoEnPosicion(metal , 4,1);

        jugador.aniadirJugadorAlMapa(5,5);
    }
}
