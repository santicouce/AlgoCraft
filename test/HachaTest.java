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
}