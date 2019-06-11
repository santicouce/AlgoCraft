package AlgoCraft;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiamanteTest {

    Diamante diamante = new Diamante();

    @Test
    public void test01UnDiamanteDeberiaInicializarConDurabilidad100(){
        assertEquals(100,diamante.durabilidad());
    }
}