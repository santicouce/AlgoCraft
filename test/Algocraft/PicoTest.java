package Algocraft;

import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class PicoTest {
    @Test
    public void test01UnPicoDeMaderaDeberiaInicializarConDurabilidad100(){
        Pico picoDeMadera = new Pico(new Madera());
        assertEquals(100.00, picoDeMadera.durabilidad(),0.0001);
    }

    @Test
    public void test02UnPicoDeMaderaDeberiaInicializarConFuerza2(){
        Pico picoDeMadera = new Pico(new Madera());
        assertEquals(2, picoDeMadera.fuerza());
    }

    @Test
    public void test03UnPicodePiedraDeberiaInicializarConDurabilidad200(){
        Pico picoDePiedra = new Pico(new Piedra());
        assertEquals(200, picoDePiedra.durabilidad(),0.0001);
    }

    @Test
    public void test04UnPicoDePiedraDeberiaInicializarConFuerza4(){
        Pico picoDePiedra = new Pico(new Piedra());
        assertEquals(4, picoDePiedra.fuerza());
    }

    @Test
    public void test05UnPicoDeMetalDeberiaInicializarConDurabilidad400(){
        Pico picoDeMetal = new Pico(new Metal());
        double durabilidadEsperada = 400;
        assertEquals(durabilidadEsperada, picoDeMetal.durabilidad(),0.0001);
    }

    @Test
    public void test06UnPicoDeMetalDeberiaInicializarConFuerza12(){
        Pico picoDeMetal = new Pico(new Metal());
        assertEquals(12, picoDeMetal.fuerza());
    }

    @Test
    public void test07PicoDeMaderaGolpeaMaderaLuegoDurabilidadDePicoDeberiaDisminuirEn2() {
        Pico pico = new Pico(new Madera());
        double durabilidadPico = pico.durabilidad();
        pico.golpear(new Madera());
        assertEquals(durabilidadPico-2, pico.durabilidad(),0.0001);
    }

    @Test
    public void test08PicoDeMaderaGolpeaPiedraLuegoDurabilidadDePicoDeberiaDisminuirEn2() {
        Pico pico = new Pico(new Madera());
        double durabilidadPico = pico.durabilidad();
        pico.golpear(new Piedra());
        assertEquals(durabilidadPico-2, pico.durabilidad(),0.0001);
    }

    @Test
    public void test09PicoDeMaderaGolpeaMetalLuegoDurabilidadDePicoDeberiaDisminuirEn2() {
        Pico pico = new Pico(new Madera());
        double durabilidadPico = pico.durabilidad();
        pico.golpear(new Metal());
        assertEquals(durabilidadPico-2, pico.durabilidad(),0.0001);
    }

    @Test
    public void test10PicoDeMaderaGolpeaDiamanteLuegoDurabilidadDePicoDeberiaDisminuirEn2() {
        Pico pico = new Pico(new Madera());
        double durabilidadPico = pico.durabilidad();
        pico.golpear(new Madera());
        assertEquals(durabilidadPico-2, pico.durabilidad(),0.0001);
    }

    @Test
    public void test11PicoDePiedraGolpeaMaderaLuegoDurabilidadDePicoDeberiaDisminuirEnOchoTercios() {
        Pico pico = new Pico(new Piedra());
        double durabilidadPico = pico.durabilidad();
        pico.golpear(new Madera());
        assertEquals(durabilidadPico-(4*2.666667), pico.durabilidad(),0.0001);
    }

    @Test
    public void test12PicoDePiedraGolpeaPiedraLuegoDurabilidadDePicoDeberiaDisminuirEnOchoTercios() {
        Pico pico = new Pico(new Piedra());
        double durabilidadPico = pico.durabilidad();
        pico.golpear(new Piedra());
        assertEquals(durabilidadPico-(4*2.666667), pico.durabilidad(),0.0001);
    }

    @Test
    public void test13PicoDePiedraGolpeaMetalLuegoDurabilidadDePicoDeberiaDisminuirEnOchoTercios() {
        Pico pico = new Pico(new Piedra());
        double durabilidadPico = pico.durabilidad();
        pico.golpear(new Metal());
        assertEquals(durabilidadPico-(4*2.666667), pico.durabilidad(),0.0001);
    }

    @Test
    public void test14PicoDePiedraGolpeaDiamanteLuegoDurabilidadDePicoDeberiaDisminuirEnOchoTercios() {
        Pico pico = new Pico(new Piedra());
        double durabilidadPico = pico.durabilidad();
        pico.golpear(new Diamante());
        assertEquals(durabilidadPico-(4*2.666667), pico.durabilidad(),0.0001);
    }

    @Test
    public void test15UnPicoDeMetalGolpeaUnaMaderaYSuDurabilidadNoDeberiaDisminuir(){
        Pico pico = new Pico(new Metal());
        double durabilidadInicial = pico.durabilidad();
        pico.golpear(new Madera());
        assertEquals(durabilidadInicial, pico.durabilidad(),0.0001);
    }

    @Test
    public void test16UnPicoDeMetalGolpeaUnaPiedraYSuDurabilidadNoDeberiaDisminuir(){
        Pico pico = new Pico(new Metal());
        double durabilidadInicial = pico.durabilidad();
        pico.golpear(new Piedra());
        assertEquals(durabilidadInicial, pico.durabilidad(),0.0001);
    }

    @Test
    public void test17UnPicoDeMetalGolpeaUnMetalYSuDurabilidadNoDeberiaDisminuir(){
        Pico pico = new Pico(new Metal());
        double durabilidadInicial = pico.durabilidad();
        pico.golpear(new Madera());
        assertEquals(durabilidadInicial, pico.durabilidad(),0.0001);
    }

    @Test
    public void test18UnPicoDeMetalGolpeaUnDiamanteYSuDurabilidadNoDeberiaDisminuir(){
        Pico pico = new Pico(new Metal());
        double durabilidadInicial = pico.durabilidad();
        pico.golpear(new Diamante());
        assertEquals(durabilidadInicial, pico.durabilidad(),0.0001);
    }
}
