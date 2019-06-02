import Objetos.Metal;
import Objetos.PicoFino;
import Objetos.Piedra;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PicoFinoTest {
    @Test
    public void test01UnPicoFinoDeMetalDeberiaInicializarConDurabilidad1000(){
        PicoFino picoFinoDeMetal = new PicoFino(new Metal());
        assertEquals(1000, picoFinoDeMetal.durabilidad());
    }
    @Test
    public void test02UnPicoFinoDePiedraDeberiaInicializarConDurabilidad1000(){
        PicoFino picoFinoDePiedra = new PicoFino(new Piedra());
        assertEquals(1000, picoFinoDePiedra.durabilidad());
    }
    @Test
    public void test03UnPicoFinoDeMetalDeberiaInicializarConFuerza20(){
        PicoFino picoFinoDeMetal = new PicoFino(new Metal());
        assertEquals(20, picoFinoDeMetal.fuerza());
    }
    @Test
    public void test04UnPicoFinoDePiedraDeberiaInicializarConFuerza20(){
        PicoFino picoFinoDePiedra = new PicoFino(new Piedra());
        assertEquals(20, picoFinoDePiedra.fuerza());
    }
}
