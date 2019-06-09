import AlgoCraft.*;
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
        int durabilidadInicialPiedra = piedra.durabilidad();
        piedra.serGolpeadaPor(pico);
        assertEquals(durabilidadInicialPiedra-2, piedra.durabilidad());
    }
    @Test
    public void test03UnaPiedraEsGolpeadaPorUnPicoDePiedraYSuDurabilidadSeDeberiaReducirEn4(){
        PiedraProxy piedra = new PiedraProxy();
        Pico pico = new Pico(new Piedra());
        int durabilidadInicialPiedra = piedra.durabilidad();
        piedra.serGolpeadaPor(pico);
        assertEquals(durabilidadInicialPiedra-4, piedra.durabilidad());
    }
    @Test
    public void test04UnaPiedraEsGolpeadaPorUnPicoDeMetalYSuDurabilidadSeDeberiaReducirEn12(){
        PiedraProxy piedra = new PiedraProxy();
        Pico pico = new Pico(new Metal());
        int durabilidadInicialPiedra = piedra.durabilidad();
        piedra.serGolpeadaPor(pico);
        assertEquals(durabilidadInicialPiedra-12, piedra.durabilidad());
    }

    @Test
    public void test05UnaPiedraEsGolpeadaPorUnHachaDeMaderaYSuDurabildiadNoDeberiaDisminuir(){
        PiedraProxy piedra = new PiedraProxy();
        Hacha hacha = new Hacha(new Madera());
        int durabilidadInicialPiedra = piedra.durabilidad();
        piedra.serGolpeadaPor(hacha);
        assertEquals(durabilidadInicialPiedra, piedra.durabilidad());
    }
    @Test
    public void test06UnaPiedraEsGolpeadaPorUnHachaDePiedraYSuDurabildiadNoDeberiaDisminuir(){
        PiedraProxy piedra = new PiedraProxy();
        Hacha hacha = new Hacha(new Piedra());
        int durabilidadInicialPiedra = piedra.durabilidad();
        piedra.serGolpeadaPor(hacha);
        assertEquals(durabilidadInicialPiedra, piedra.durabilidad());
    }
    @Test
    public void test07UnaPiedraEsGolpeadaPorUnHachaDeMetalYSuDurabildiadNoDeberiaDisminuir(){
        PiedraProxy piedra = new PiedraProxy();
        Hacha hacha = new Hacha(new Metal());
        int durabilidadInicialPiedra = piedra.durabilidad();
        piedra.serGolpeadaPor(hacha);
        assertEquals(durabilidadInicialPiedra, piedra.durabilidad());
    }
    @Test
    public void test08UnaPiedraEsGolpeadaPorUnPicoFinoYSuDurabildiadNoDeberiaDisminuir(){
        PiedraProxy piedra = new PiedraProxy();
        PicoFino picoFino = new PicoFino(new Piedra());
        int durabilidadInicialPiedra = piedra.durabilidad();
        piedra.serGolpeadaPor(picoFino);
        assertEquals(durabilidadInicialPiedra, piedra.durabilidad());
    }
}
