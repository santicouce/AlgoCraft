import Objetos.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PiedraTest {
    @Test
    public void test01UnaPiedraDeberiaInicializarConDurabilidad30(){
        Piedra piedra = new Piedra();
        assertEquals(30,piedra.durabilidad());
    }

    @Test
    public void test02UnaPiedraEsGolpeadaPorUnHachaDeMaderaYSuDurabilidadNoDeberiaCambiar(){
        Piedra piedra = new Piedra();
        Hacha hacha= new Hacha(new Madera());
        int durabilidadInicialDePiedra = piedra.durabilidad();
        piedra.serGolpeadaPor(hacha);
        assertEquals(durabilidadInicialDePiedra, piedra.durabilidad());

    }
}