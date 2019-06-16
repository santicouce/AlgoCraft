package algocraft;

import algocraft.materiales.Madera;
import algocraft.materiales.Metal;
import algocraft.materiales.Piedra;
import algocraft.herramientas.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MaderaTest {

    Madera madera = new Madera();

    @Test
    public void test01UnaMaderaDeberiaInicializarConDurabilidad10(){
        assertEquals(10,madera.durabilidad());
    }

    @Test
    public void test02UnaMaderaEsGolpeadaConUnaHachaDeMaderaYSuDurabilidadSeDeberiaReducirEn2(){
        Hacha hacha = new Hacha(new Madera());
        int durabilidadInicialMadera = madera.durabilidad();
        hacha.golpear(madera);
        assertEquals(durabilidadInicialMadera-2, madera.durabilidad());
    }

    @Test
    public void test03UnaMaderaEsGolpeadaConUnHachaDePiedraYSuDurabilidadSeDeberiaReducirEn5(){
        Hacha hacha = new Hacha(new Piedra());
        int durabilidadInicialMadera = madera.durabilidad();
        hacha.golpear(madera);
        assertEquals(durabilidadInicialMadera-5,madera.durabilidad());
    }

    @Test
    public void test03UnaMaderaEsGolpeadaConUnHachaDeMetalYSuDurabilidadSeDeberiaReducirEn10(){
        Hacha hacha = new Hacha(new Metal());
        int durabilidadInicialMadera = madera.durabilidad();
        hacha.golpear(madera);
        assertEquals(durabilidadInicialMadera-10,madera.durabilidad());
    }

    @Test
    public void test04UnaMaderaEsGolpeadaConUnPicoDeMaderaYSuDurabilidadNoDeberiaCambiar(){
        Pico picoMadera = new Pico(new Madera());
        int durabilidadInicialMadera = madera.durabilidad();
        picoMadera.golpear(madera);
        assertEquals(durabilidadInicialMadera,madera.durabilidad());
    }

    @Test
    public void test05UnaMaderaEsGolpeadaConUnPicoDePiedraYSuDurabilidadNoDeberiaCambiar(){
        Pico picoPiedra = new Pico(new Piedra());
        int durabilidadInicialMadera = madera.durabilidad();
        picoPiedra.golpear(madera);
        assertEquals(durabilidadInicialMadera,madera.durabilidad());
    }
    @Test
    public void test06UnaMaderaEsGolpeadaConUnPicoDeMetalYSuDurabilidadNoDeberiaCambiar(){
        Pico picoMetal = new Pico(new Metal());
        int durabilidadInicialMadera = madera.durabilidad();
        picoMetal.golpear(madera);
        assertEquals(durabilidadInicialMadera,madera.durabilidad());
    }
    @Test
    public void test07UnaMaderaEsGolpeadaConUnPicoFinoYSuDurabilidadNoDeberiaCambiar(){
        PicoFino picoFino = new PicoFino(new Metal(), new Piedra());
        int durabilidadInicialMadera = madera.durabilidad();
        picoFino.golpear(madera);
        assertEquals(durabilidadInicialMadera,madera.durabilidad());
    }
}
