package algocraft;

import algocraft.herramientas.Hacha;
import algocraft.herramientas.Pico;
import algocraft.herramientas.PicoFino;
import algocraft.materiales.Madera;
import algocraft.materiales.MaderaProxy;
import algocraft.materiales.Metal;
import algocraft.materiales.Piedra;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaderaProxyTest {

    private MaderaProxy madera = new MaderaProxy();

    @Test
    public void test01UnaMaderaDeberiaInicializarConDurabilidad10(){
        assertEquals(10,madera.durabilidad());
    }

    @Test
    public void test02UnaMaderaEsGolpeadaConUnaHachaDeMaderaYSuDurabilidadSeDeberiaReducirEn2(){
        Hacha hacha = new Hacha(new Madera());
        int durabilidadInicialMadera = madera.durabilidad();
        madera.serGolpeadaPor(hacha);
        assertEquals(durabilidadInicialMadera-2, madera.durabilidad());
    }

    @Test
    public void test03UnaMaderaEsGolpeadaConUnHachaDePiedraYSuDurabilidadSeDeberiaReducirEn5(){
        Hacha hacha = new Hacha(new Piedra());
        int durabilidadInicialMadera = madera.durabilidad();
        madera.serGolpeadaPor(hacha);
        assertEquals(durabilidadInicialMadera-5,madera.durabilidad());
    }

    @Test
    public void test03UnaMaderaEsGolpeadaConUnHachaDeMetalYSuDurabilidadSeDeberiaReducirEn10(){
        Hacha hacha = new Hacha(new Metal());
        int durabilidadInicialMadera = madera.durabilidad();
        madera.serGolpeadaPor(hacha);
        assertEquals(durabilidadInicialMadera-10,madera.durabilidad());
    }

    @Test
    public void test04MaderaEsGolpeadaConUnPicoDeMaderaYSuDurabilidadNoDeberiaCambiar(){
        Pico pico = new Pico(new Madera());
        int durabilidadInicialMadera = madera.durabilidad();
        madera.serGolpeadaPor(pico);
        assertEquals(durabilidadInicialMadera,madera.durabilidad());
    }

    @Test
    public void test05MaderaEsGolpeadaConUnPicoDePiedraYSuDurabilidadNoDeberiaCambiar(){
        Pico pico = new Pico(new Piedra());
        int durabilidadInicialMadera = madera.durabilidad();
        madera.serGolpeadaPor(pico);
        assertEquals(durabilidadInicialMadera,madera.durabilidad());
    }
    @Test
    public void test06MaderaEsGolpeadaConUnPicoDeMetalYSuDurabilidadNoDeberiaCambiar(){
        Pico pico = new Pico(new Metal());
        int durabilidadInicialMadera = madera.durabilidad();
        madera.serGolpeadaPor(pico);
        assertEquals(durabilidadInicialMadera,madera.durabilidad());
    }
    @Test
    public void test05MaderaEsGolpeadaConUnPicoFinoYSuDurabilidadNoDeberiaCambiar(){
        PicoFino picoFino = new PicoFino(new Piedra(), new Metal());
        int durabilidadInicialMadera = madera.durabilidad();
        madera.serGolpeadaPor(picoFino);
        assertEquals(durabilidadInicialMadera,madera.durabilidad());
    }
}
