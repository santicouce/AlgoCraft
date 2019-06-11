package AlgoCraft;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JugadorTest {

    private Jugador jugador = new Jugador();
    Mapa mapa = new Mapa();

    @Test
    public void test01JugadorRecienCreadoCuentaSoloConUnHachaDeMadera(){
        Madera madera = new Madera();
        int durabilidadInicialMadera = madera.durabilidad();
        jugador.golpear(madera);
        assertEquals(durabilidadInicialMadera - 2, madera.durabilidad());
    }
    @Test
    public void test02UnJugadorSeIntentaMoverALaIzquieraAUnCasilleroOcupadoPorUnMaterialYNoDeberiaCambiarSuPosicion(){
        mapa.aniadirElementoEnPosicion(new MaderaProxy(),0,0);
        mapa.aniadirJugadorAlMapa(jugador,1,0);
        jugador.moverA(new DireccionIzquierda(mapa));
    }
    @Test
    public void test03UnJugadorIntentaMoverseALaIzquierdaAUnCasilleroVacioYSuPosicionDeberiaCambiar(){
        mapa.aniadirElementoEnPosicion(jugador,1,0);
        jugador.aniadirJugadorAlMapa(1,0);
        jugador.moverA(new DireccionIzquierda(mapa));
    }
    @Test
    public void test04UnJugadorIntentaMoverseALaIzquierdaEstandoEnElBordeIzquierdoDelMapaYSuPosicionNoDeberiaCambiar(){
        mapa.aniadirElementoEnPosicion(jugador,0,0);
        jugador.aniadirJugadorAlMapa(0,0);
        jugador.moverA(new DireccionIzquierda(mapa));
    }
    @Test
    public void test05UnJugadorIntentaMoverseALaDerechaAUnCasilleroOcupadoPorUnMaterialYNoDeberiaCambiarSuPosicion(){
        mapa.aniadirElementoEnPosicion(new MaderaProxy(),1,0);
        mapa.aniadirJugadorAlMapa(jugador,0,0);
        jugador.moverA(new DireccionDerecha(mapa));
    }
    @Test
    public void test06UnJugadorIntentaMoverseALaDerechaEstandoEnElBordeDerechoDelMapaYSuPosicionNoDeberiaCabiar(){
        mapa.aniadirJugadorAlMapa(jugador,9,0);
        jugador.moverA(new DireccionDerecha(mapa));
    }
    @Test
    public void test07UnJugadoIntentaMoverseALaDerechaHaciaUnCasilleroVacioYSuPosicionDeberiaCambiar(){
        mapa.aniadirJugadorAlMapa(jugador,0,0);
        jugador.moverA(new DireccionDerecha(mapa));
    }
    @Test
    public void test08UnJugadorIntentaMoverseArribaAUnCasillerOcupadoYSuPosicionNoDeberiaCambiar(){
        mapa.aniadirElementoEnPosicion(new MaderaProxy(),0 ,0);
        mapa.aniadirJugadorAlMapa(jugador,0,1);
        jugador.moverA(new DireccionArriba(mapa));
    }
    @Test
    public void test09UnJugadorIntentaMoverseArribaEstandoEnElBordeSuperiorDelMapaYSuPosicionNoDeberiaCambiar(){
        mapa.aniadirJugadorAlMapa(jugador,0,0);
        jugador.moverA(new DireccionArriba(mapa));
    }
    @Test
    public void test10UnJugadorIntentaMoverseArribaAUnCasilleroLibreYSuPosicionDeberiaCambiar(){
        mapa.aniadirJugadorAlMapa(jugador,0,2);
        jugador.moverA(new DireccionArriba(mapa));
    }
    @Test
    public void test11UnJugadorIntentaMoverseAbajoAUnCasilleroOcupadoYSuPosicionNoDeberiaCambiar(){
        mapa.aniadirElementoEnPosicion(new MaderaProxy(),0 ,1);
        mapa.aniadirJugadorAlMapa(jugador,0,0);
        jugador.moverA(new DireccionAbajo(mapa));
    }
    @Test
    public void test12UnJugadorIntentaMoverseAbajoEnElBordeInferiorDelMapaYSuPosicionNoDeberiaCambiar(){
        mapa.aniadirJugadorAlMapa(jugador, 0,9);
        jugador.moverA(new DireccionAbajo(mapa));
    }
    @Test
    public void test13UnJugadorIntentaMoverseAbajoAUnCasilleroVacioYSuPosicionDeberiaCambiar(){
        mapa.aniadirJugadorAlMapa(jugador, 0,0);
        jugador.moverA(new DireccionAbajo(mapa));
    }


}
