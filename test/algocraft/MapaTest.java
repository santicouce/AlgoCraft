package algocraft;

import algocraft.errores.CasilleroOcupadoError;
import algocraft.errores.PosicionInvalidaError;
import algocraft.jugador.Jugador;
import algocraft.mapadejuego.Mapa;
import algocraft.materiales.*;
import org.junit.Test;

public class MapaTest {

    private Mapa mapa = new Mapa(10,10);
    private Jugador jugador = new Jugador();
    private Madera madera = new Madera();
    private Metal metal = new Metal();
    private Piedra piedra = new Piedra();
    private Diamante diamante = new Diamante();

    @Test
    public void test01UnCasilleroVacioDeUnMapaDeberiaPoderSerOcupadoPorMadera(){
        mapa.aniadirElementoEnPosicion(madera, 1, 1);
    }
    @Test
    public void test02UnCasilleroVacioDeUnMapaDeberiaPdoerSerOcupadoPorMetal(){
        mapa.aniadirElementoEnPosicion(metal,1,1);
    }
    @Test
    public void test03UnCasilleroVacioDeUnMapaDeberiaPoderSerOcupadoPorPiedra(){
        mapa.aniadirElementoEnPosicion(piedra,1,1);
    }
    @Test
    public void test04UnCasilleroVacioDeUnMapaDeberiaPoderSerOcupadoPorDiamanteProxy(){
        mapa.aniadirElementoEnPosicion(diamante,1,1);
    }
    @Test(expected = CasilleroOcupadoError.class)
    public void test05AlIntentarOcuparConUnMaterialUnCasilleroOcupadoPorOtroMaterialDeberiaLanzarseUnCasilleroOcupadoError(){
        mapa.aniadirElementoEnPosicion(madera,1,1);
        mapa.aniadirElementoEnPosicion(piedra,1,1);
    }
    @Test
    public void test06UnCasilleroVacioDeUnMapaDeberiaPoderSerOcupadoPorUnJugador(){
        mapa.aniadirElementoEnPosicion(jugador,1,1);
    }
    @Test(expected = CasilleroOcupadoError.class)
    public void test07AlIntentarOcuparConUnJugadorUnCasilleroOcupadoPorUnMaterialDeberiaLanzarseUnCasilleroOcupadoError(){
        mapa.aniadirElementoEnPosicion(madera,1,1);
        mapa.aniadirElementoEnPosicion(jugador,1,1);
    }
    @Test(expected = CasilleroOcupadoError.class)
    public void test08AlIntentarOcuparConUnMaterialUnCasilleroOcupadoPorUnJugadorDeberiaLanzarseUnCasilleroOcupadoError(){
        mapa.aniadirElementoEnPosicion(jugador,1,1);
        mapa.aniadirElementoEnPosicion(madera,1,1);
    }
    @Test(expected = PosicionInvalidaError.class)
    public void test09AlIntentarAniadirUnElementoEnUnaFilaMayorALaFilaMaximaDelMapaDeberiaLanzarseUnPosicionInvalidaError(){
        mapa.aniadirElementoEnPosicion(madera,1,10);
    }

    @Test(expected = PosicionInvalidaError.class)
    public void test10AlIntentarAniadirUnElementoEnUnaColumnaMayorALaColumnaMaximaDelMapaDeberiaLanzarseUnPosicionInvalidaError(){
        mapa.aniadirElementoEnPosicion(madera,10,0);
    }
    @Test(expected = PosicionInvalidaError.class)
    public void test11AlIntentarAniadirUnElementoEnUnaFilaMenorA0DeberiaLanzarseUnPosicionInvalidaError(){
        mapa.aniadirElementoEnPosicion(jugador,0,-1);
    }
    @Test(expected = PosicionInvalidaError.class)
    public void test12AlIntentarAniadirUnElementoEnUnaColumnaMenorA0DeberiaLanzarseUnPosicionInvalidaError(){
        mapa.aniadirElementoEnPosicion(jugador,-1,0);
    }


    /*
    @Test
    public void test13CreoBienUnMApa(){
        Mapa unMapa = new Mapa(5,5);
    }
     */
}
