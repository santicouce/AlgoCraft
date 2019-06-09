import Objetos.Diamante;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiamanteTest {
    @Test
    public void test01UnDiamanteDeberiaInicializarConDurabilidad100(){
        Diamante diamante = new Diamante();
        assertEquals(100,diamante.durabilidad());
    }
}