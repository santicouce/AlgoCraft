package algocraft;

import algocraft.errores.CasilleroOcupadoError;
import algocraft.errores.PosicionInvalidaError;
import algocraft.jugador.Jugador;
import algocraft.mapadejuego.Mapa;
import algocraft.materiales.DiamanteProxy;
import algocraft.materiales.MaderaProxy;
import algocraft.materiales.MetalProxy;
import algocraft.materiales.PiedraProxy;
import org.junit.Test;

public class MapaTest {

    private Mapa mapa = new Mapa();
    private Jugador jugador = new Jugador();
    private MaderaProxy maderaProxy = new MaderaProxy();
    private MetalProxy metalProxy = new MetalProxy();
    private PiedraProxy piedraProxy = new PiedraProxy();
    private DiamanteProxy diamanteProxy = new DiamanteProxy();

    @Test
    public void test01UnCasilleroVacioDeUnMapaDeberiaPoderSerOcupadoPorMadera(){
        mapa.aniadirElementoEnPosicion(maderaProxy, 1, 1);
    }
    @Test
    public void test02UnCasilleroVacioDeUnMapaDeberiaPdoerSerOcupadoPorMetal(){
        mapa.aniadirElementoEnPosicion(metalProxy,1,1);
    }
    @Test
    public void test03UnCasilleroVacioDeUnMapaDeberiaPoderSerOcupadoPorPiedra(){
        mapa.aniadirElementoEnPosicion(piedraProxy,1,1);
    }
    @Test
    public void test04UnCasilleroVacioDeUnMapaDeberiaPoderSerOcupadoPorDiamanteProxy(){
        mapa.aniadirElementoEnPosicion(diamanteProxy,1,1);
    }
    @Test(expected = CasilleroOcupadoError.class)
    public void test05AlIntentarOcuparConUnMaterialUnCasilleroOcupadoPorOtroMaterialDeberiaLanzarseUnCasilleroOcupadoError(){
        mapa.aniadirElementoEnPosicion(maderaProxy,1,1);
        mapa.aniadirElementoEnPosicion(piedraProxy,1,1);
    }
    @Test
    public void test06UnCasilleroVacioDeUnMapaDeberiaPoderSerOcupadoPorUnJugador(){
        mapa.aniadirElementoEnPosicion(jugador,1,1);
    }
    @Test(expected = CasilleroOcupadoError.class)
    public void test07AlIntentarOcuparConUnJugadorUnCasilleroOcupadoPorUnMaterialDeberiaLanzarseUnCasilleroOcupadoError(){
        mapa.aniadirElementoEnPosicion(maderaProxy,1,1);
        mapa.aniadirElementoEnPosicion(jugador,1,1);
    }
    @Test(expected = CasilleroOcupadoError.class)
    public void test08AlIntentarOcuparConUnMaterialUnCasilleroOcupadoPorUnJugadorDeberiaLanzarseUnCasilleroOcupadoError(){
        mapa.aniadirElementoEnPosicion(jugador,1,1);
        mapa.aniadirElementoEnPosicion(maderaProxy,1,1);
    }
    @Test(expected = PosicionInvalidaError.class)
    public void test09AlIntentarAniadirUnElementoEnUnaFilaMayorALaFilaMaximaDelMapaDeberiaLanzarseUnPosicionInvalidaError(){
        mapa.aniadirElementoEnPosicion(maderaProxy,1,10);
    }
    @Test(expected = PosicionInvalidaError.class)
    public void test10AlIntentarAniadirUnElementoEnUnaColumnaMayorALaColumnaMaximaDelMapaDeberiaLanzarseUnPosicionInvalidaError(){
        mapa.aniadirElementoEnPosicion(maderaProxy,10,0);
    }
    @Test(expected = PosicionInvalidaError.class)
    public void test11AlIntentarAniadirUnElementoEnUnaFilaMenorA0DeberiaLanzarseUnPosicionInvalidaError(){
        mapa.aniadirElementoEnPosicion(jugador,0,-1);
    }
    @Test(expected = PosicionInvalidaError.class)
    public void test12AlIntentarAniadirUnElementoEnUnaColumnaMenorA0DeberiaLanzarseUnPosicionInvalidaError(){
        mapa.aniadirElementoEnPosicion(jugador,-1,0);
    }
}
