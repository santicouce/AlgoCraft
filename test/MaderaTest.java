import Objetos.Madera;
import Objetos.Hacha;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MaderaTest {
    @Test
    public void test01UnaMaderaDeberiaInicializarConDurabilidad10(){
        Madera madera = new Madera();
        assertEquals(10,madera.durabilidad());
    }

    @Test
    public void test02UnaMaderaEsGolpeadaConUnaHachaDeMaderaYSuDurabilidadSeDeberiaReducirEn2(){
        Madera madera = new Madera();
        Hacha hacha = new Hacha(new Madera());
        int durabilidadInicialMadera = madera.durabilidad();
        madera.serGolpeadaPor(hacha);
        assertEquals(durabilidadInicialMadera-2, madera.durabilidad());
    }
}
