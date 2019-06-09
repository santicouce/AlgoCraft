import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MapaTest {

    private Mapa mapa = new Mapa();

    @Test
    public void test01SeCreaMapa(){
        assertEquals(true, mapa.esUnMapa());
    }
/*    @Test
    public void test02ElMapaTieneCasilleros(){
        assertEquals(true, mapa.accederAPosicion(2,2).esUnCasillero());
    }
*/
}
