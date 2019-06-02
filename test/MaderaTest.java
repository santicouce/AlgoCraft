import Objetos.Madera;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MaderaTest {
    @Test
    public void test01UnaMaderaDeberiaInicializarConDurabilidad10(){
        Madera madera = new Madera();
        assertEquals(10,madera.durabilidad());
    }
}
