import Objetos.*;
import org.junit.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class PicoTest {

    @Test
    public void test01UnPicoDeMaderaDeberiaInicializarConDurabilidad100(){
        Pico picoDeMadera = new Pico(new Madera());
        assertEquals(100, picoDeMadera.durabilidad());
    }
    @Test
    public void test02UnPicoDeMaderaDeberiaInicializarConFuerza2(){
        Pico picoDeMadera = new Pico(new Madera());
        assertEquals(2, picoDeMadera.fuerza());
    }

    @Test
    public void test03UnPicodePiedraDeberiaInicializarConDurabilidad200(){
        Pico picoDePiedra = new Pico(new Piedra());
        assertEquals(200, picoDePiedra.durabilidad());
    }

    @Test
    public void test04UnPicoDePiedraDeberiaInicializarConFuerza5(){
        Pico picoDePiedra = new Pico(new Piedra());
        assertEquals(5, picoDePiedra.fuerza());
    }

    @Test
    public void test05UnPicoDeMetalDeberiaInicializarConDurabilidad400(){
        Pico picoDeMetal = new Pico(new Metal());
        assertEquals(400, picoDeMetal.durabilidad());
    }

    @Test
    public void test06UnPicoDeMetalDeberiaInicializarConFuerza10(){
        Pico picoDeMetal = new Pico(new Metal());
        assertEquals(10, picoDeMetal.fuerza());
    }
}
