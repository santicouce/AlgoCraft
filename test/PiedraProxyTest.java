import Objetos.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PiedraProxyTest {
    @Test
    public void test01UnaPiedraDeberiaInicializarConDurabilidad30(){
        PiedraProxy piedra = new PiedraProxy();
        assertEquals(30,piedra.durabilidad());
    }

    @Test
    public void test02UnaPiedraEsGolpeadaPorUnPicoDeMaderaYSuDurabilidadSeDeberiaReducirEn2(){
        PiedraProxy piedra = new PiedraProxy();
        Pico pico = new Pico(new Madera());
        int durabilidadInicialDePiedra = piedra.durabilidad();
        piedra.serGolpeadaPor(pico);
        assertEquals(durabilidadInicialDePiedra-2, piedra.durabilidad());
    }
    @Test
    public void test03UnaPiedraEsGolpeadaPorUnPicoDePiedraYSuDurabilidadSeDeberiaReducirEn4(){
        PiedraProxy piedra = new PiedraProxy();
        Pico pico = new Pico(new Piedra());
        int durabilidadInicialDePiedra = piedra.durabilidad();
        piedra.serGolpeadaPor(pico);
        assertEquals(durabilidadInicialDePiedra-4, piedra.durabilidad());
    }
    @Test
    public void test04UnaPiedraEsGolpeadaPorUnPicoDeMetalYSuDurabilidadSeDeberiaReducirEn12(){
        PiedraProxy piedra = new PiedraProxy();
        Pico pico = new Pico(new Metal());
        int durabilidadInicialDePiedra = piedra.durabilidad();
        piedra.serGolpeadaPor(pico);
        assertEquals(durabilidadInicialDePiedra-12, piedra.durabilidad());
    }

    @Test
    public void test05UnaPiedraEsGolpeadaPorUnHachaDeMaderaYSuDurabildiadNoDeberiaDisminuir(){
        PiedraProxy piedra = new PiedraProxy();
        Hacha hacha = new Hacha(new Madera());
        int durabilidadInicialDePiedra = piedra.durabilidad();
        piedra.serGolpeadaPor(hacha);
        assertEquals(durabilidadInicialDePiedra, piedra.durabilidad());
    }
    @Test
    public void test06UnaPiedraEsGolpeadaPorUnHachaDePiedraYSuDurabildiadNoDeberiaDisminuir(){
        PiedraProxy piedra = new PiedraProxy();
        Hacha hacha = new Hacha(new Piedra());
        int durabilidadInicialDePiedra = piedra.durabilidad();
        piedra.serGolpeadaPor(hacha);
        assertEquals(durabilidadInicialDePiedra, piedra.durabilidad());
    }
    @Test
    public void test07UnaPiedraEsGolpeadaPorUnHachaDeMetalYSuDurabildiadNoDeberiaDisminuir(){
        PiedraProxy piedra = new PiedraProxy();
        Hacha hacha = new Hacha(new Metal());
        int durabilidadInicialDePiedra = piedra.durabilidad();
        piedra.serGolpeadaPor(hacha);
        assertEquals(durabilidadInicialDePiedra, piedra.durabilidad());
    }
    @Test
    public void test08UnaPiedraEsGolpeadaPorUnPicoFinoYSuDurabildiadNoDeberiaDisminuir(){
        PiedraProxy piedra = new PiedraProxy();
        PicoFino picoFino = new PicoFino(new Piedra());
        int durabilidadInicialDePiedra = piedra.durabilidad();
        piedra.serGolpeadaPor(picoFino);
        assertEquals(durabilidadInicialDePiedra, piedra.durabilidad());
    }
}
