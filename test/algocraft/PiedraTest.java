package algocraft;

import algocraft.herramientas.Hacha;
import algocraft.herramientas.Pico;
import algocraft.herramientas.PicoFino;
import algocraft.materiales.Madera;
import algocraft.materiales.Metal;
import algocraft.materiales.Piedra;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PiedraTest {
    @Test
    public void test01UnaPiedraDeberiaInicializarConDurabilidad30(){
        Piedra piedra = new Piedra();
        assertEquals(30,piedra.durabilidad());
    }

    @Test
    public void test02UnaPiedraEsGolpeadaPorUnPicoDeMaderaYSuDurabilidadSeDeberiaReducirEn2(){
        Piedra piedra = new Piedra();
        Pico pico = new Pico(new Madera());
        int durabilidadInicialDePiedra = piedra.durabilidad();
        pico.golpear(piedra);
        assertEquals(durabilidadInicialDePiedra-2, piedra.durabilidad());
    }
    @Test
    public void test03UnaPiedraEsGolpeadaPorUnPicoDePiedraYSuDurabilidadSeDeberiaReducirEn4(){
        Piedra piedra = new Piedra();
        Pico pico = new Pico(new Piedra());
        int durabilidadInicialDePiedra = piedra.durabilidad();
        pico.golpear(piedra);
        assertEquals(durabilidadInicialDePiedra-4, piedra.durabilidad());
    }
    @Test
    public void test04UnaPiedraEsGolpeadaPorUnPicoDeMetalYSuDurabilidadSeDeberiaReducirEn12(){
        Piedra piedra = new Piedra();
        Pico pico = new Pico(new Metal());
        int durabilidadInicialDePiedra = piedra.durabilidad();
        pico.golpear(piedra);
        assertEquals(durabilidadInicialDePiedra-12, piedra.durabilidad());
    }
    @Test
    public void test05UnaPiedraEsGolpeadaPorUnHachaDeMaderaYSuDurabilidadNoDeberiaReducirse(){
        Piedra piedra = new Piedra();
        Hacha hachaDeMadera = new Hacha(new Madera());
        int durabilidadInicialDePiedra = piedra.durabilidad();
        hachaDeMadera.golpear(piedra);
        assertEquals(durabilidadInicialDePiedra, piedra.durabilidad());
    }
    @Test
    public void test06UnaPiedraEsGolpeadaPorUnHachaDePiedraYSuDurabilidadNoDeberiaReducirse(){
        Piedra piedra = new Piedra();
        Hacha hachaDePiedra = new Hacha(new Piedra());
        int durabilidadInicialDePiedra = piedra.durabilidad();
        hachaDePiedra.golpear(piedra);
        assertEquals(durabilidadInicialDePiedra, piedra.durabilidad());
    }
    @Test
    public void test06UnaPiedraEsGolpeadaPorUnHachaDeMetalYSuDurabilidadNoDeberiaReducirse(){
        Piedra piedra = new Piedra();
        Hacha hachaDeMetal = new Hacha(new Piedra());
        int durabilidadInicialDePiedra = piedra.durabilidad();
        hachaDeMetal.golpear(piedra);
        assertEquals(durabilidadInicialDePiedra, piedra.durabilidad());
    }
    @Test
    public void test07UnaPiedraEsGolpeadaPorUnPicoFinoYSuDurabilidadNoDeberiaReducirse(){
        Piedra piedra = new Piedra();
        PicoFino picoFino = new PicoFino(new Piedra(), new Metal());
        int durabilidadInicialDePiedra = piedra.durabilidad();
        picoFino.golpear(piedra);
        assertEquals(durabilidadInicialDePiedra, piedra.durabilidad());
    }
    @Test
    public void test09UnaPiedraSeInicializaConNumeroDeId3(){
        Piedra piedra = new Piedra();
        assertEquals(piedra.getId(), "2");
    }
}