package algocraft;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiamanteProxyTest {

    DiamanteProxy diamante = new DiamanteProxy();

    @Test
    public void test01UnDiamanteDeberiaInicializarConDurabilidad100(){
        assertEquals(100,diamante.durabilidad());
    }
    @Test
    public void test02UnDiamanteEsGolpeadoConUnPicoFinoYSuDurailidadDeberiaReducirseEn20(){
        PicoFino picoFino = new PicoFino(new Piedra());
        int durabilidadInicialDiamante = diamante.durabilidad();
        diamante.serGolpeadaPor(picoFino);
        assertEquals(durabilidadInicialDiamante-20,diamante.durabilidad());
    }
    @Test
    public void test03UnDiamanteEsGolpeadoConUnHachaDeMaderaYSuDurailidadNoDeberiaReducirse(){
        Hacha hacha = new Hacha(new Madera());
        int durabilidadInicialDiamante = diamante.durabilidad();
        diamante.serGolpeadaPor(hacha);
        assertEquals(durabilidadInicialDiamante,diamante.durabilidad());
    }
    @Test
    public void test04UnDiamanteEsGolpeadoConUnHachaDePiedraYSuDurailidadNoDeberiaReducirse(){
        Hacha hacha = new Hacha(new Piedra());
        int durabilidadInicialDiamante = diamante.durabilidad();
        diamante.serGolpeadaPor(hacha);
        assertEquals(durabilidadInicialDiamante,diamante.durabilidad());
    }
    @Test
    public void test05UnDiamanteEsGolpeadoConUnHachaDeMetalYSuDurailidadNoDeberiaReducirse(){
        Hacha hacha = new Hacha(new Metal());
        int durabilidadInicialDiamante = diamante.durabilidad();
        diamante.serGolpeadaPor(hacha);
        assertEquals(durabilidadInicialDiamante,diamante.durabilidad());
    }
    @Test
    public void test06UnDiamanteEsGolpeadoConUnPicoDeMaderaYSuDurailidadNoDeberiaReducirse(){
        Pico pico = new Pico(new Madera());
        int durabilidadInicialDiamante = diamante.durabilidad();
        diamante.serGolpeadaPor(pico);
        assertEquals(durabilidadInicialDiamante,diamante.durabilidad());
    }
    @Test
    public void test07UnDiamanteEsGolpeadoConUnPicoDePiedraYSuDurailidadNoDeberiaReducirse(){
        Pico pico = new Pico(new Piedra());
        int durabilidadInicialDiamante = diamante.durabilidad();
        diamante.serGolpeadaPor(pico);
        assertEquals(durabilidadInicialDiamante,diamante.durabilidad());
    }
    @Test
    public void test08UnDiamanteEsGolpeadoConUnPicoDeMetalYSuDurailidadNoDeberiaReducirse(){
        Pico pico = new Pico(new Metal());
        int durabilidadInicialDiamante = diamante.durabilidad();
        diamante.serGolpeadaPor(pico);
        assertEquals(durabilidadInicialDiamante,diamante.durabilidad());
    }
}
