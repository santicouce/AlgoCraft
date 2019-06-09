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
    public void test05PicoFinoDeMetalConDurabilidadYFuerzaCorrespondiente() {
        PicoFino picoFino = new PicoFino(new Metal());
        int durabilidadPico = 1000;
        int fuerzaPico = 20;

        assertEquals(durabilidadPico, picoFino.durabilidad());
        assertEquals(fuerzaPico, picoFino.fuerza());

    }
    @Test
    public void test06PicoFinoDePiedraConDurabilidadYFuerzaCorrespondiente() {
        PicoFino picoFino = new PicoFino(new Piedra());
        int durabilidadPico = 1000;
        int fuerzaPico = 20;

        assertEquals(durabilidadPico, picoFino.durabilidad());
        assertEquals(fuerzaPico, picoFino.fuerza());

    }

    @Test
    public void test07HachaDeMaderaGolpeaMaderaLuegoDurabilidadDeHachaDisminuyeEn2YSuFuerzaSeMantiene() {
        Hacha hacha = new Hacha(new Madera());
        int durabilidadHacha = 100;
        int fuerzaHacha = 2;
        hacha.golpear(new Madera());

        assertEquals(durabilidadHacha-2, hacha.durabilidad());
        assertEquals(fuerzaHacha, hacha.fuerza());

    }
    @Test
    public void test08HachaDeMaderaGolpeaMadera2VecesLuegoDurabilidadDeHachaDisminuyeEn4YSuFuerzaSeMantiene() {
        Hacha hacha = new Hacha(new Madera());
        int durabilidadHacha = 100;
        int fuerzaHacha = 2;

        Madera madera = new Madera();
        hacha.golpear(madera);
        hacha.golpear(madera);

        assertEquals(durabilidadHacha-4, hacha.durabilidad());
        assertEquals(fuerzaHacha, hacha.fuerza());

    }

}