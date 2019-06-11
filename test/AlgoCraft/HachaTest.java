package AlgoCraft;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HachaTest {

    @Test
    public void test01UnHachaDeMaderaDeberiaInicializarConDurabilidad100(){
        Hacha hachaDeMadera = new Hacha(new Madera());
        assertEquals(100, hachaDeMadera.durabilidad(),0.0001);
    }

    @Test
    public void test02UnHachaDeMaderaDeberiaInicializarConFuerza2(){
        Hacha hachaDeMadera = new Hacha(new Madera());
        assertEquals(2, hachaDeMadera.fuerza());
    }

    @Test
    public void test03UnHachaDePiedraDeberiaInicializarConDurabilidad200(){
        Hacha hachaDePiedra = new Hacha(new Piedra());
        assertEquals(200, hachaDePiedra.durabilidad(),0.0001);
    }

    @Test
    public void test04UnHachaDePiedraDeberiaInicializarConFuerza5(){
        Hacha hachaDePiedra = new Hacha(new Piedra());
        assertEquals(5, hachaDePiedra.fuerza());
    }

    @Test
    public void test05UnHachaDeMetalDeberiaInicializarConDurabilidad400(){
        Hacha hachaDeMetal = new Hacha(new Metal());
        assertEquals(400, hachaDeMetal.durabilidad(),0.0001);
    }

    @Test
    public void test06UnHachaDeMetalDeberiaInicializarConFuerza10(){
        Hacha hachaDeMetal = new Hacha(new Metal());
        assertEquals(10, hachaDeMetal.fuerza());
    }

    @Test
    public void test07HachaDeMaderaGolpeaMaderaLuegoDurabilidadDeHachaDeberiaDisminuirEn2() {
        Hacha hacha = new Hacha(new Madera());
        double durabilidadHacha = hacha.durabilidad();
        hacha.golpear(new Madera());
        assertEquals(durabilidadHacha-2, hacha.durabilidad(),0.0001);
    }

    @Test
    public void test08HachaDeMaderaGolpeaPiedraLuegoDurabilidadDeHachaDeberiaDisminuirEn2() {
        Hacha hacha = new Hacha(new Madera());
        double durabilidadHacha = hacha.durabilidad();
        hacha.golpear(new Piedra());
        assertEquals(durabilidadHacha-2, hacha.durabilidad(),0.0001);
    }

    @Test
    public void test09HachaDeMaderaGolpeaMetalLuegoDurabilidadDeHachaDeberiaDisminuirEn2() {
        Hacha hacha = new Hacha(new Madera());
        double durabilidadHacha = hacha.durabilidad();
        hacha.golpear(new Metal());
        assertEquals(durabilidadHacha-2, hacha.durabilidad(),0.0001);
    }

    @Test
    public void test10HachaDeMaderaGolpeaDiamanteLuegoDurabilidadDeHachaDeberiaDisminuirEn2() {
        Hacha hacha = new Hacha(new Madera());
        double durabilidadHacha = hacha.durabilidad();
        hacha.golpear(new Diamante());
        assertEquals(durabilidadHacha-2, hacha.durabilidad(),0.0001);
    }

    @Test
    public void test11HachaDePiedraGolpeaMaderaLuegoDurabilidadDeHachaDeberiaDisminuirEn5() {
        Hacha hacha = new Hacha(new Piedra());
        double durabilidadHacha = hacha.durabilidad();
        hacha.golpear(new Madera());
        assertEquals(durabilidadHacha-5, hacha.durabilidad(),0.0001);
    }

    @Test
    public void test12HachaDePiedraGolpeaPiedraLuegoDurabilidadDeHachaDeberiaDisminuirEn5() {
        Hacha hacha = new Hacha(new Piedra());
        double durabilidadHacha = hacha.durabilidad();
        hacha.golpear(new Piedra());
        assertEquals(durabilidadHacha-5, hacha.durabilidad(),0.0001);
    }

    @Test
    public void test13HachaDePiedraGolpeaMetalLuegoDurabilidadDeHachaDeberiaDisminuirEn5() {
        Hacha hacha = new Hacha(new Piedra());
        double durabilidadHacha = hacha.durabilidad();
        hacha.golpear(new Metal());
        assertEquals(durabilidadHacha-5, hacha.durabilidad(),0.0001);
    }

    @Test
    public void test14HachaDePiedraGolpeaDiamanteLuegoDurabilidadDeHachaDeberiaDisminuirEn5() {
        Hacha hacha = new Hacha(new Piedra());
        double durabilidadHacha = hacha.durabilidad();
        hacha.golpear(new Diamante());
        assertEquals(durabilidadHacha-5, hacha.durabilidad(),0.0001);
    }

    @Test
    public void test15HachaDeMetalGolpeaMaderaLuegoDurabilidadDeHachaDeberiaDisminuirEn5() {
        Hacha hacha = new Hacha(new Metal());
        double durabilidadHacha = hacha.durabilidad();
        hacha.golpear(new Madera());
        assertEquals(durabilidadHacha-5, hacha.durabilidad(),0.0001);
    }

    @Test
    public void test16HachaDeMetalGolpeaPiedraLuegoDurabilidadDeHachaDeberiaDisminuirEn5() {
        Hacha hacha = new Hacha(new Metal());
        double durabilidadHacha = hacha.durabilidad();
        hacha.golpear(new Piedra());
        assertEquals(durabilidadHacha-5, hacha.durabilidad(),0.0001);
    }

    @Test
    public void test17HachaDeMetalGolpeaMetalLuegoDurabilidadDeHachaDeberiaDisminuirEn5() {
        Hacha hacha = new Hacha(new Metal());
        double durabilidadHacha = hacha.durabilidad();
        hacha.golpear(new Metal());
        assertEquals(durabilidadHacha-5, hacha.durabilidad(),0.0001);
    }

    @Test
    public void test18HachaDeMetalGolpeaDiamanteLuegoDurabilidadDeHachaDeberiaDisminuirEn5() {
        Hacha hacha = new Hacha(new Metal());
        double durabilidadHacha = hacha.durabilidad();
        hacha.golpear(new Diamante());
        assertEquals(durabilidadHacha-5, hacha.durabilidad(),0.0001);
    }
}