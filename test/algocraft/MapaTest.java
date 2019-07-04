package algocraft;

import algocraft.errores.CasilleroOcupadoError;
import algocraft.errores.PosicionInvalidaError;
import algocraft.jugador.Jugador;
import algocraft.mapadejuego.Casillero;
import algocraft.mapadejuego.Mapa;
import algocraft.materiales.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import static junit.framework.TestCase.fail;

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
    public void test09AlIntentarAniadirUnElementoEnUnaFilaMenorA0DeberiaLanzarseUnPosicionInvalidaError(){
        mapa.aniadirElementoEnPosicion(jugador,0,-1);
    }
    @Test(expected = PosicionInvalidaError.class)
    public void test10AlIntentarAniadirUnElementoEnUnaColumnaMenorA0DeberiaLanzarseUnPosicionInvalidaError(){
        mapa.aniadirElementoEnPosicion(jugador,-1,0);
    }

    @Test
    public void test11MapaBorraElementoDeLaUicacionColumnaFila(){
        mapa.aniadirElementoEnPosicion(new Madera(),2, 2);
        mapa.eliminarElementoEnPosicion(2,2);
        assertEquals(new Casillero().darNombre(),mapa.darNombreDeElementoEn(2,2));
    }

    @Test
    public void test12UnJugadorPuedeGolpearMaterialAledanio(){
        try {
            mapa.aniadirJugadorAlMapa(jugador, 5, 5);
            mapa.aniadirElementoEnPosicion(madera, 5, 6);
            mapa.aniadirElementoEnPosicion(madera, 5, 4);
            mapa.aniadirElementoEnPosicion(madera, 4, 5);
            mapa.aniadirElementoEnPosicion(madera, 6, 5);
            jugador.golpear(mapa);
        }catch(Exception e){
            fail("Algo salio mal");
        }
    }

    @Test
    public void test13DurabilidadDeMaterialAledanioSeReduceAlGolpearlo(){

        mapa.aniadirJugadorAlMapa(jugador,5,5);
        mapa.aniadirElementoEnPosicion(madera,5,6);
        mapa.aniadirElementoEnPosicion(piedra,5,4);
        mapa.aniadirElementoEnPosicion(diamante,4,5);
        mapa.aniadirElementoEnPosicion(metal,6,5);
        jugador.golpear(mapa);
        Material materialGolpeado = (Material)mapa.getTablero().get(5).get(6).getObservable();
        assertEquals(8,materialGolpeado.durabilidad());
    }


}
