package algocraft;

import algocraft.errores.MovimientoInvalidoError;
import algocraft.jugador.Jugador;
import algocraft.movimientodeljugador.*;
import algocraft.materiales.Madera;
import algocraft.mapadejuego.Mapa;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JugadorTest {

    private Jugador jugador = new Jugador();
    Mapa mapa = new Mapa();

    @Test
    public void test01JugadorRecienCreadoDeberiaCuentaSoloConUnHachaDeMadera(){
        Madera madera = new Madera();
        int durabilidadInicialMadera = madera.durabilidad();
        jugador.golpear(madera);
        assertEquals(durabilidadInicialMadera - 2, madera.durabilidad());
    }
    @Test(expected = MovimientoInvalidoError.class)
    public void test02UnJugadorSeIntentaMoverALaIzquieraAUnCasilleroOcupadoPorUnMaterialYSeDeberiaLanzarMovimientoInvalidoError(){
        mapa.aniadirElementoEnPosicion(new Madera(),0,0);
        mapa.aniadirJugadorAlMapa(jugador,1,0);
        jugador.moverA(new DireccionIzquierda(mapa));
    }
    @Test
    public void test03UnJugadorIntentaMoverseALaIzquierdaAUnCasilleroVacioYSuPosicionDeberiaCambiar(){
        mapa.aniadirElementoEnPosicion(jugador,1,0);
        jugador.aniadirJugadorAlMapa(1,0);
        jugador.moverA(new DireccionIzquierda(mapa));
    }
    @Test(expected = MovimientoInvalidoError.class)
    public void test04UnJugadorIntentaMoverseALaIzquierdaEstandoEnElBordeIzquierdoDelMapaYSeDeberiaLanzarMovimientoInvalidoError(){
        mapa.aniadirElementoEnPosicion(jugador,0,0);
        jugador.aniadirJugadorAlMapa(0,0);
        jugador.moverA(new DireccionIzquierda(mapa));
    }
    @Test(expected = MovimientoInvalidoError.class)
    public void test05UnJugadorIntentaMoverseALaDerechaAUnCasilleroOcupadoPorUnMaterialYSeDeberiaLanzarMovimientoInvalidoError(){
        mapa.aniadirElementoEnPosicion(new Madera(),1,0);
        mapa.aniadirJugadorAlMapa(jugador,0,0);
        jugador.moverA(new DireccionDerecha(mapa));
    }
    @Test(expected = MovimientoInvalidoError.class)
    public void test06UnJugadorIntentaMoverseALaDerechaEstandoEnElBordeDerechoDelMapaYSeDeberiaLanzarMovimientoInvalidoError(){
        mapa.aniadirJugadorAlMapa(jugador,9,0);
        jugador.moverA(new DireccionDerecha(mapa));
    }
    @Test
    public void test07UnJugadoIntentaMoverseALaDerechaHaciaUnCasilleroVacioYSuPosicionDeberiaCambiar(){
        mapa.aniadirJugadorAlMapa(jugador,0,0);
        jugador.moverA(new DireccionDerecha(mapa));
    }
    @Test(expected = MovimientoInvalidoError.class)
    public void test08UnJugadorIntentaMoverseArribaAUnCasillerOcupadoYSeDeberiaLanzarMovimientoInvalidoError(){
        mapa.aniadirElementoEnPosicion(new Madera(),0 ,0);
        mapa.aniadirJugadorAlMapa(jugador,0,1);
        jugador.moverA(new DireccionArriba(mapa));
    }
    @Test(expected = MovimientoInvalidoError.class)
    public void test09UnJugadorIntentaMoverseArribaEstandoEnElBordeSuperiorDelMapaYSeDeberiaLanzarMovimientoInvalidoError(){
        mapa.aniadirJugadorAlMapa(jugador,0,0);
        jugador.moverA(new DireccionArriba(mapa));
    }
    @Test
    public void test10UnJugadorIntentaMoverseArribaAUnCasilleroLibreYSuPosicionDeberiaCambiar(){
        mapa.aniadirJugadorAlMapa(jugador,0,2);
        jugador.moverA(new DireccionArriba(mapa));
    }
    @Test(expected = MovimientoInvalidoError.class)
    public void test11UnJugadorIntentaMoverseAbajoAUnCasilleroOcupadoYSeDeberiaLanzarMovimientoInvalidoError(){
        mapa.aniadirElementoEnPosicion(new Madera(),0 ,1);
        mapa.aniadirJugadorAlMapa(jugador,0,0);
        jugador.moverA(new DireccionAbajo(mapa));
    }
    @Test(expected = MovimientoInvalidoError.class)
    public void test12UnJugadorIntentaMoverseAbajoEnElBordeInferiorDelMapaYSeDeberiaLanzarMovimientoInvalidoError(){
        mapa.aniadirJugadorAlMapa(jugador, 0,9);
        jugador.moverA(new DireccionAbajo(mapa));
    }
    @Test
    public void test13UnJugadorIntentaMoverseAbajoAUnCasilleroVacioYSuPosicionDeberiaCambiar(){
        mapa.aniadirJugadorAlMapa(jugador, 0,0);
        jugador.moverA(new DireccionAbajo(mapa));
    }
}
