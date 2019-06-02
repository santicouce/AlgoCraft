import Objetos.Hacha;
import Objetos.Madera;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HachaTest {

    @Test
    public void test01UnHachaDeMaderaDeberiaInicializarConDurabilidad100(){
        Hacha hachaDeMadera = new Hacha(new Madera());
        assertEquals(100,hachaDeMadera.durabilidad());
    }

    @Test
    public void test02UnHachaDeMaderaDeberiaInicializarConFuerza2(){
        Hacha hachaDeMadera = new Hacha(new Madera());
        assertEquals(2, hachaDeMadera.fuerza());
    }
}
