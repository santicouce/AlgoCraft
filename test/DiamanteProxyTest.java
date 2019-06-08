import Objetos.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiamanteProxyTest {
    @Test
    public void test01UnDiamanteDeberiaInicializarConDurabilidad100(){
        DiamanteProxy diamante = new DiamanteProxy();
        assertEquals(100,diamante.durabilidad());
    }
    @Test
    public void test02UnDiamanteEsGolpeadoConUnPicoFinoYSuDurailidadDeberiaReducirseEn20(){
        DiamanteProxy diamante = new DiamanteProxy();
        PicoFino picoFino = new PicoFino(new Piedra());
        int durabilidadInicialDiamante = diamante.durabilidad();
        diamante.serGolpeadaPor(picoFino);
        assertEquals(durabilidadInicialDiamante-20,diamante.durabilidad());
    }
    @Test
    public void test03UnDiamanteEsGolpeadoConUnHachaDeMaderaYSuDurailidadNoDeberiaReducirse(){
        DiamanteProxy diamante = new DiamanteProxy();
        Hacha hacha = new Hacha(new Madera());
        int durabilidadInicialDiamante = diamante.durabilidad();
        diamante.serGolpeadaPor(hacha);
        assertEquals(durabilidadInicialDiamante,diamante.durabilidad());
    }
    @Test
    public void test04UnDiamanteEsGolpeadoConUnHachaDePiedraYSuDurailidadNoDeberiaReducirse(){
        DiamanteProxy diamante = new DiamanteProxy();
        Hacha hacha = new Hacha(new Piedra());
        int durabilidadInicialDiamante = diamante.durabilidad();
        diamante.serGolpeadaPor(hacha);
        assertEquals(durabilidadInicialDiamante,diamante.durabilidad());
    }
    @Test
    public void test05UnDiamanteEsGolpeadoConUnHachaDeMetalYSuDurailidadNoDeberiaReducirse(){
        DiamanteProxy diamante = new DiamanteProxy();
        Hacha hacha = new Hacha(new Metal());
        int durabilidadInicialDiamante = diamante.durabilidad();
        diamante.serGolpeadaPor(hacha);
        assertEquals(durabilidadInicialDiamante,diamante.durabilidad());
    }
    @Test
    public void test06UnDiamanteEsGolpeadoConUnPicoDeMaderaYSuDurailidadNoDeberiaReducirse(){
        DiamanteProxy diamante = new DiamanteProxy();
        Pico pico = new Pico(new Madera());
        int durabilidadInicialDiamante = diamante.durabilidad();
        diamante.serGolpeadaPor(pico);
        assertEquals(durabilidadInicialDiamante,diamante.durabilidad());
    }
    @Test
    public void test07UnDiamanteEsGolpeadoConUnPicoDePiedraYSuDurailidadNoDeberiaReducirse(){
        DiamanteProxy diamante = new DiamanteProxy();
        Pico pico = new Pico(new Piedra());
        int durabilidadInicialDiamante = diamante.durabilidad();
        diamante.serGolpeadaPor(pico);
        assertEquals(durabilidadInicialDiamante,diamante.durabilidad());
    }
    @Test
    public void test08UnDiamanteEsGolpeadoConUnPicoDeMetalYSuDurailidadNoDeberiaReducirse(){
        DiamanteProxy diamante = new DiamanteProxy();
        Pico pico = new Pico(new Metal());
        int durabilidadInicialDiamante = diamante.durabilidad();
        diamante.serGolpeadaPor(pico);
        assertEquals(durabilidadInicialDiamante,diamante.durabilidad());
    }
}
