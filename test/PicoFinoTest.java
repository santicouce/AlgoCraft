import AlgoCraft.Diamante;
import AlgoCraft.Metal;
import AlgoCraft.PicoFino;
import AlgoCraft.Piedra;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PicoFinoTest {

    PicoFino picoFinoDeMetal = new PicoFino(new Metal());
    PicoFino picoFinoDePiedra = new PicoFino(new Piedra());

    @Test
    public void test01UnPicoFinoDeMetalDeberiaInicializarConDurabilidad1000(){
        assertEquals(1000, picoFinoDeMetal.durabilidad(),0.0001);
    }
    @Test
    public void test02UnPicoFinoDePiedraDeberiaInicializarConDurabilidad1000(){
        assertEquals(1000, picoFinoDePiedra.durabilidad(),0.0001);
    }
    @Test
    public void test03UnPicoFinoDeMetalDeberiaInicializarConFuerza20(){
        assertEquals(20, picoFinoDeMetal.fuerza());
    }
    @Test
    public void test04UnPicoFinoDePiedraDeberiaInicializarConFuerza20(){
        assertEquals(20, picoFinoDePiedra.fuerza());
    }

    @Test
    public void test05UnPicoFinoSeUsaContraDiamanteYSuDurabilidadDeberiaDisminuirEn2(){
        double durabilidadInicialPicoFino = picoFinoDeMetal.durabilidad();
        picoFinoDeMetal.golpear(new Diamante());
        assertEquals(durabilidadInicialPicoFino-2, picoFinoDeMetal.durabilidad(), 0.00001);
    }
}
