import AlgoCraft.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AlgoCraftTest {

    Madera madera = new Madera();
    Hacha hachaDeMadera = new Hacha(madera);
    Pico picoDeMadera = new Pico(madera);
    Metal metal = new Metal();
    Hacha hachaDeMetal = new Hacha(metal);
    Pico picoDeMetal = new Pico(metal);
    PicoFino picoFinoDeMetal = new PicoFino(metal);
    Piedra piedra = new Piedra();
    PicoFino picoFinoDePiedra = new PicoFino(piedra);

    @Test
    public void test01SeCreaHachaDeMaderaConDurabilidadYFuerzaCorrespondiente() {
        int durabilidadHacha = 100;
        int fuerzaHacha = 2;

        assertEquals(durabilidadHacha, hachaDeMadera.durabilidad(), 0.0001);
        assertEquals(fuerzaHacha, hachaDeMadera.fuerza());
    }

    @Test
    public void test02PicoDeMaderaConDurabilidadYFuerzaCorrespondiente() {
        int durabilidadPico = 100;
        int fuerzaPico = 2;

        assertEquals(durabilidadPico, picoDeMadera.durabilidad(), 0.0001);
        assertEquals(fuerzaPico, picoDeMadera.fuerza());
    }

    @Test
    public void test03SeCreaHachaDeMetalConDurabilidadYFuerzaCorrespondiente() {
        int durabilidadHacha = 400;
        int fuerzaHacha = 10;

        assertEquals(durabilidadHacha, hachaDeMetal.durabilidad(), 0.0001);
        assertEquals(fuerzaHacha, hachaDeMetal.fuerza());
    }

    @Test
    public void test04PicoDeMetalConDurabilidadYFuerzaCorrespondiente() {
        int durabilidadPico = 400;
        int fuerzaPico = 12;

        assertEquals(durabilidadPico, picoDeMetal.durabilidad(), 0.0001);
        assertEquals(fuerzaPico, picoDeMetal.fuerza());
    }

    @Test
    public void test05PicoFinoDeMetalConDurabilidadYFuerzaCorrespondiente() {
        int durabilidadPico = 1000;
        int fuerzaPico = 20;

        assertEquals(durabilidadPico, picoFinoDeMetal.durabilidad(),0.0001);
        assertEquals(fuerzaPico, picoFinoDeMetal.fuerza());
    }

    @Test
    public void test06PicoFinoDePiedraConDurabilidadYFuerzaCorrespondiente() {
        int durabilidadPico = 1000;
        int fuerzaPico = 20;

        assertEquals(durabilidadPico, picoFinoDePiedra.durabilidad(),0.0001);
        assertEquals(fuerzaPico, picoFinoDePiedra.fuerza());
    }

    @Test
    public void test07HachaDeMaderaGolpeaMaderaLuegoDurabilidadDeHachaDisminuyeEn2YSuFuerzaSeMantiene() {
        int durabilidadHacha = 100;
        int fuerzaHacha = 2;
        hachaDeMadera.golpear(madera);

        assertEquals(durabilidadHacha-2, hachaDeMadera.durabilidad(),0.0001);
        assertEquals(fuerzaHacha, hachaDeMadera.fuerza());
    }
    @Test
    public void test08HachaDeMaderaGolpeaMadera2VecesLuegoDurabilidadDeHachaDisminuyeEn4YSuFuerzaSeMantiene() {
        int durabilidadHacha = 100;
        int fuerzaHacha = 2;

        hachaDeMadera.golpear(madera);
        hachaDeMadera.golpear(madera);

        assertEquals(durabilidadHacha-4, hachaDeMadera.durabilidad(),0.0001);
        assertEquals(fuerzaHacha, hachaDeMadera.fuerza());
    }
}