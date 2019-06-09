import AlgoCraft.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MapaTest {

    private Mapa mapa = new Mapa();

/*    @Test
    public void test02ElMapaTieneCasilleros(){
        assertEquals(true, mapa.accederAPosicion(2,2).esUnCasillero());
    }
*/
    @Test
    public void test01UnCasilleroVacioDeUnMapaDeberiaPoderSerOcupadoPorMadera(){
        MaderaProxy maderaProxy = new MaderaProxy();
        mapa.aniadirElementoEnPosicion(maderaProxy, 1, 1);
    }
  /*  @Test
    public void test02UnCasilleroVacioDeUnMapaDeberiaPdoerSerOcupadoPorMetal(){
        MetalProxy metalProxy = new MetalProxy();
        mapa.aniadirElementoEnPosicion(metalProxy,1,1);
    }*/
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
}
