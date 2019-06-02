import Objetos.Metal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MetalTest {
    @Test
    public void test01UnaMetalDeberiaInicializarConDurabilidad50(){
        Metal metal = new Metal();
        assertEquals(50,metal.durabilidad());
    }
}