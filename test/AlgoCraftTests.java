import Objetos.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AlgoCraftTests {

    @Test
    public void test01SeCreaHachaDeMaderaConDurabilidadYFuerzaCorrespondiente() {
        Hacha hacha = new Hacha(new Madera());
        int durabilidadHacha = 100;
        int fuerzaHacha = 2;

        assertEquals(durabilidadHacha, hacha.durabilidad());
        assertEquals(fuerzaHacha, hacha.fuerza());

    }

    @Test
    public void test02PicoDeMaderaConDurabilidadYFuerzaCorrespondiente() {
        Pico pico = new Pico(new Madera());
        int durabilidadPico = 100;
        int fuerzaPico = 2;

        assertEquals(durabilidadPico, pico.durabilidad());
        assertEquals(fuerzaPico, pico.fuerza());

    }

    @Test
    public void test03SeCreaHachaDeMetalConDurabilidadYFuerzaCorrespondiente() {
        Hacha hacha = new Hacha(new Metal());
        int durabilidadHacha = 400;
        int fuerzaHacha = 10;

        assertEquals(durabilidadHacha, hacha.durabilidad());
        assertEquals(fuerzaHacha, hacha.fuerza());

    }

    @Test
    public void test04PicoDeMetalConDurabilidadYFuerzaCorrespondiente() {
        Pico pico = new Pico(new Metal());
        int durabilidadPico = 400;
        int fuerzaPico = 12;

        assertEquals(durabilidadPico, pico.durabilidad());
        assertEquals(fuerzaPico, pico.fuerza());

    }

    @Test
    public void test05PicoFinoConDurabilidadYFuerzaCorrespondiente() {
        PicoFino picoFino = new PicoFino();
        int durabilidadPico = 1000;
        int fuerzaPico = 20;

        assertEquals(durabilidadPico, picoFino.durabilidad());
        assertEquals(fuerzaPico, picoFino.fuerza());

    }

}