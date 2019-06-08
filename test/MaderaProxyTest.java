import Objetos.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaderaProxyTest {
    @Test
    public void test01UnaMaderaDeberiaInicializarConDurabilidad10(){
        MaderaProxy madera = new MaderaProxy();
        assertEquals(10,madera.durabilidad());
    }

    @Test
    public void test02UnaMaderaEsGolpeadaConUnaHachaDeMaderaYSuDurabilidadSeDeberiaReducirEn2(){
        MaderaProxy madera = new MaderaProxy();
        Hacha hacha = new Hacha(new Madera());
        int durabilidadInicialMadera = madera.durabilidad();
        madera.serGolpeadaPor(hacha);
        assertEquals(durabilidadInicialMadera-2, madera.durabilidad());
    }

    @Test
    public void test03UnaMaderaEsGolpeadaConUnHachaDePiedraYSuDurabilidadSeDeberiaReducirEn5(){
        MaderaProxy madera = new MaderaProxy();
        Hacha hacha = new Hacha(new Piedra());
        int durabilidadInicialMadera = madera.durabilidad();
        madera.serGolpeadaPor(hacha);
        assertEquals(durabilidadInicialMadera-5,madera.durabilidad());
    }

    @Test
    public void test03UnaMaderaEsGolpeadaConUnHachaDeMetalYSuDurabilidadSeDeberiaReducirEn10(){
        MaderaProxy madera = new MaderaProxy();
        Hacha hacha = new Hacha(new Metal());
        int durabilidadInicialMadera = madera.durabilidad();
        madera.serGolpeadaPor(hacha);
        assertEquals(durabilidadInicialMadera-10,madera.durabilidad());
    }

    @Test
    public void test04MaderaEsGolpeadaConUnPicoDeMaderaYSuDurabilidadNoDeberiaCambiar(){
        MaderaProxy madera = new MaderaProxy();
        Pico pico = new Pico(new Madera());
        int durabilidadInicialMadera = madera.durabilidad();
        madera.serGolpeadaPor(pico);
        assertEquals(durabilidadInicialMadera,madera.durabilidad());
    }

    @Test
    public void test05MaderaEsGolpeadaConUnPicoDePiedraYSuDurabilidadNoDeberiaCambiar(){
        MaderaProxy madera = new MaderaProxy();
        Pico pico = new Pico(new Piedra());
        int durabilidadInicialMadera = madera.durabilidad();
        madera.serGolpeadaPor(pico);
        assertEquals(durabilidadInicialMadera,madera.durabilidad());
    }
    @Test
    public void test06MaderaEsGolpeadaConUnPicoDeMetalYSuDurabilidadNoDeberiaCambiar(){
        MaderaProxy madera = new MaderaProxy();
        Pico pico = new Pico(new Metal());
        int durabilidadInicialMadera = madera.durabilidad();
        madera.serGolpeadaPor(pico);
        assertEquals(durabilidadInicialMadera,madera.durabilidad());
    }
    @Test
    public void test05MaderaEsGolpeadaConUnPicoFinoYSuDurabilidadNoDeberiaCambiar(){
        MaderaProxy madera = new MaderaProxy();
        PicoFino picoFino = new PicoFino(new Piedra());
        int durabilidadInicialMadera = madera.durabilidad();
        madera.serGolpeadaPor(picoFino);
        assertEquals(durabilidadInicialMadera,madera.durabilidad());
    }

}
