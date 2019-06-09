import Objetos.Metal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MetalTest {

    Metal metal = new Metal();

    @Test
    public void test01UnaMetalDeberiaInicializarConDurabilidad50(){
        assertEquals(50,metal.durabilidad());
    }
}