import Objetos.*;
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

    @Test
    public void test03UnaMaderaEsGolpeadaConUnHachaDePiedraYSuDurabilidadSeDeberiaReducirEn5(){
        Madera madera = new Madera();
        Hacha hacha = new Hacha(new Piedra());
        int durabilidadInicialMadera = madera.durabilidad();
        madera.serGolpeadaPor(hacha);
        assertEquals(durabilidadInicialMadera-5,madera.durabilidad());
    }

    @Test
    public void test03UnaMaderaEsGolpeadaConUnHachaDeMetalYSuDurabilidadSeDeberiaReducirEn10(){
        Madera madera = new Madera();
        Hacha hacha = new Hacha(new Metal());
        int durabilidadInicialMadera = madera.durabilidad();
        madera.serGolpeadaPor(hacha);
        assertEquals(durabilidadInicialMadera-10,madera.durabilidad());
    }
}
