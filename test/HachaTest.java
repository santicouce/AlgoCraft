import Objetos.Hacha;
import Objetos.Madera;
import Objetos.Metal;
import Objetos.Piedra;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HachaTest {

    @Test
    public void test01UnHachaDeMaderaDeberiaInicializarConDurabilidad100(){
        Hacha hachaDeMadera = new Hacha(new Madera());
        assertEquals(100, hachaDeMadera.durabilidad());
    }

    @Test
    public void test02UnHachaDeMaderaDeberiaInicializarConFuerza2(){
        Hacha hachaDeMadera = new Hacha(new Madera());
        assertEquals(2, hachaDeMadera.fuerza());
    }

    @Test
    public void test03UnHachaDePiedraDeberiaInicializarConDurabilidad200(){
        Hacha hachaDePiedra = new Hacha(new Piedra());
        assertEquals(200, hachaDePiedra.durabilidad());
    }

    @Test
    public void test04UnHachaDePiedraDeberiaInicializarConFuerza5(){
        Hacha hachaDePiedra = new Hacha(new Piedra());
        assertEquals(5, hachaDePiedra.fuerza());
    }

    @Test
    public void test05UnHachaDeMetalDeberiaInicializarConDurabilidad400(){
        Hacha hachaDeMetal = new Hacha(new Metal());
        assertEquals(400, hachaDeMetal.durabilidad());
    }

    @Test
    public void test06UnHachaDeMetalDeberiaInicializarConFuerza10(){
        Hacha hachaDeMetal = new Hacha(new Metal());
        assertEquals(10, hachaDeMetal.fuerza());
    }

    @Test
    public void test07HachaDeMaderaGolpeaMaderaLuegoDurabilidadDeHachaDisminuyeEn2() {
        Hacha hacha = new Hacha(new Madera());
        int durabilidadHacha = 100;
        hacha.golpear(new Madera());

        assertEquals(durabilidadHacha-2, hacha.durabilidad());

    }

    /*@Test
    public void test08HachaDeMaderaGolpeaPiedraLuegoDurabilidadNoCambia() {
        Hacha hacha = new Hacha(new Piedra());
        int durabilidadHacha = 100;
        hacha.golpear(new Piedra());

        assertEquals(durabilidadHacha, hacha.durabilidad());

    }*/


}