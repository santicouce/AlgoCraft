import AlgoCraft.*;
import org.junit.Test;

public class MapaTest {

    private Mapa mapa = new Mapa();

    @Test
    public void test01UnCasilleroVacioDeUnMapaDeberiaPoderSerOcupadoPorMadera(){
        MaderaProxy maderaProxy = new MaderaProxy();
        mapa.aniadirElementoEnPosicion(maderaProxy, 1, 1);
    }
    @Test
    public void test02UnCasilleroVacioDeUnMapaDeberiaPdoerSerOcupadoPorMetal(){
        MetalProxy metalProxy = new MetalProxy();
        mapa.aniadirElementoEnPosicion(metalProxy,1,1);
    }
    @Test
    public void test03UnCasilleroVacioDeUnMapaDeberiaPoderSerOcupadoPorPiedra(){
        PiedraProxy piedraProxy = new PiedraProxy();
        mapa.aniadirElementoEnPosicion(piedraProxy,1,1);
    }
    @Test
    public void test04UnCasilleroVacioDeUnMapaDeberiaPoderSerOcupadoPorDiamanteProxy(){
        DiamanteProxy diamanteProxy = new DiamanteProxy();
        mapa.aniadirElementoEnPosicion(diamanteProxy,1,1);
    }
    @Test(expected = CasilleroOcupadoError.class)
    public void test05AlIntentarOcuparConUnMaterialUnCasilleroOcupadoPorOtroMaterialDeberiaLanzarseUnCasilleroOcupadoError(){
        MaderaProxy maderaProxy = new MaderaProxy();
        PiedraProxy piedraProxy = new PiedraProxy();
        mapa.aniadirElementoEnPosicion(maderaProxy,1,1);
        mapa.aniadirElementoEnPosicion(piedraProxy,1,1);
    }
    @Test
    public void test06UnCasilleroVacioDeUnMapaDeberiaPoderSerOcupadoPorUnJugador(){
        Jugador jugador = new Jugador();
        mapa.aniadirElementoEnPosicion(jugador,1,1);
    }
    @Test(expected = CasilleroOcupadoError.class)
    public void test07AlIntentarOcuparConUnJugadorUnCasilleroOcupadoPorUnMaterialDeberiaLanzarseUnCasilleroOcupadoError(){
        MaderaProxy maderaProxy = new MaderaProxy();
        Jugador jugador = new Jugador();
        mapa.aniadirElementoEnPosicion(maderaProxy,1,1);
        mapa.aniadirElementoEnPosicion(jugador,1,1);
    }
    @Test(expected = CasilleroOcupadoError.class)
    public void test08AlIntentarOcuparConUnMaterialUnCasilleroOcupadoPorUnJugadorDeberiaLanzarseUnCasilleroOcupadoError(){
        MaderaProxy maderaProxy = new MaderaProxy();
        Jugador jugador = new Jugador();
        mapa.aniadirElementoEnPosicion(jugador,1,1);
        mapa.aniadirElementoEnPosicion(maderaProxy,1,1);
    }
    @Test(expected = PosicionInvalidaError.class)
    public void test09AlIntentarAniadirUnElementoEnUnaFilaMayorALaFilaMaximaDelMapaDeberiaLanzarseUnPosicionInvalidaError(){
        MaderaProxy maderaProxy = new MaderaProxy();
        mapa.aniadirElementoEnPosicion(maderaProxy,1,10);
    }
    @Test(expected = PosicionInvalidaError.class)
    public void test10AlIntentarAniadirUnElementoEnUnaColumnaMayorALaColumnaMaximaDelMapaDeberiaLanzarseUnPosicionInvalidaError(){
        MaderaProxy maderaProxy = new MaderaProxy();
        mapa.aniadirElementoEnPosicion(maderaProxy,10,0);
    }
    @Test(expected = PosicionInvalidaError.class)
    public void test11AlIntentarAniadirUnElementoEnUnaFilaMenorA0DeberiaLanzarseUnPosicionInvalidaError(){
        Jugador jugador = new Jugador();
        mapa.aniadirElementoEnPosicion(jugador,0,-1);
    }
    @Test(expected = PosicionInvalidaError.class)
    public void test12AlIntentarAniadirUnElementoEnUnaColumnaMenorA0DeberiaLanzarseUnPosicionInvalidaError(){
        Jugador jugador = new Jugador();
        mapa.aniadirElementoEnPosicion(jugador,-1,0);
    }
}
