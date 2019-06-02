import Objetos.Piedra;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PiedraTest {
    @Test
    public void test01UnaPiedraDeberiaInicializarConDurabilidad30(){
        Piedra piedra = new Piedra();
        assertEquals(30,piedra.durabilidad());
    }
}