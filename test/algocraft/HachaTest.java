package algocraft;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HachaTest {
    @Test
    public void test01UnHachaDeMaderaDeberiaComenzarConFuerza2(){
        Madera madera = new Madera();
        Hacha hachaDeMadera = new Hacha(madera);
        int durabilidadInicialMadera = madera.durabilidad();
        hachaDeMadera.golpear(madera);
        assertEquals(durabilidadInicialMadera -2, madera.durabilidad());
    }

    @Test
    public void test02UnHachaDeMaderaDeberiaComenzarConDurabilidad100(){
        Madera madera = new Madera();
        Hacha hachaDeMadera = new Hacha(madera);
        assertEquals(100, hachaDeMadera.durabilidad(), 0.0001);
    }

    @Test
    public void test03UnHachaDePiedraDeberiaComenzarConFuerza5(){
        Madera madera = new Madera();
        Hacha hachaDePiedra = new Hacha(new Piedra());
        int durabilidadInicialMadera = madera.durabilidad();
        hachaDePiedra.golpear(madera);
        assertEquals(durabilidadInicialMadera -5, madera.durabilidad());
    }

    @Test
    public void test04UnHachaDePiedraDeberiaComenzarConDurabilidad200(){
        Piedra piedra = new Piedra();
        Hacha hachaDePiedra = new Hacha(piedra);
        assertEquals(200, hachaDePiedra.durabilidad(), 0.0001);
    }

    @Test
    public void test05UnHachaDeMetalDeberiaComenzarConFuerza10(){
        Madera madera = new Madera();
        Hacha hachaDePiedra = new Hacha(new Metal());
        int durabilidadInicialMadera = madera.durabilidad();
        hachaDePiedra.golpear(madera);
        assertEquals(durabilidadInicialMadera -10, madera.durabilidad());
    }

    @Test
    public void test06UnHachaDeMaderaGolpeaUnaMaderaYSuDurabilidadSeDeberiaReducirEnDos(){
        Madera madera = new Madera();
        Hacha hachaDeMadera = new Hacha(madera);
        double durabilidadInicialHachaDeMadera = hachaDeMadera.durabilidad();
        hachaDeMadera.golpear(madera);
        assertEquals(durabilidadInicialHachaDeMadera -2, hachaDeMadera.durabilidad(), 0.0001);
    }

    @Test
    public void test07UnHachaDeMaderaGolpeaUnaPiedraYSuDurabilidadDeberiaReducirseEnDos(){
        Piedra piedra = new Piedra();
        Hacha hachaDeMadera = new Hacha(new Madera());
        double durabilidadInicialHachaDeMadera = hachaDeMadera.durabilidad();
        hachaDeMadera.golpear(piedra);
        assertEquals(durabilidadInicialHachaDeMadera -2, hachaDeMadera.durabilidad(), 0.0001);
    }

    @Test
    public void test08UnHachaDeMaderaGolpeaUnMetalYSuDurabilidadDeberiaReducirseEnDos(){
        Metal metal = new Metal();
        Hacha hachaDeMadera = new Hacha(new Madera());
        double durabilidadInicialHachaDeMadera = hachaDeMadera.durabilidad();
        hachaDeMadera.golpear(metal);
        assertEquals(durabilidadInicialHachaDeMadera -2, hachaDeMadera.durabilidad(), 0.0001);
    }

    @Test
    public void test09UnHachaDeMaderaGolpeaUnDiamanteYSuDurabilidadDeberiaReducirseEnDos(){
        Diamante diamante = new Diamante();
        Hacha hachaDeMadera = new Hacha(new Madera());
        double durabilidadInicialHachaDeMadera = hachaDeMadera.durabilidad();
        hachaDeMadera.golpear(diamante);
        assertEquals(durabilidadInicialHachaDeMadera -2, hachaDeMadera.durabilidad(), 0.0001);
    }

    @Test
    public void test10UnHachaDePiedraGolpeaUnaMaderaYSuDurabilidadDeberiaReducirseEn5(){
        Madera madera = new Madera();
        Hacha hachaDePiedra = new Hacha(new Piedra());
        double durabilidadInicialHachaDePiedra = hachaDePiedra.durabilidad();
        hachaDePiedra.golpear(madera);
        assertEquals(durabilidadInicialHachaDePiedra -5, hachaDePiedra.durabilidad(), 0.0001);
    }

    @Test
    public void test11UnHachaDePiedraGolpeaUnaPiedraYSuDurabilidadDeberiaReducirseEn5(){
        Piedra piedra = new Piedra();
        Hacha hachaDePiedra = new Hacha(new Piedra());
        double durabilidadInicialHachaDePiedra = hachaDePiedra.durabilidad();
        hachaDePiedra.golpear(piedra);
        assertEquals(durabilidadInicialHachaDePiedra -5, hachaDePiedra.durabilidad(), 0.0001);
    }

    @Test
    public void test12UnHachaDePiedraGolpeaUnMetalYSuDurabilidadDeberiaReducirseEn5(){
        Metal metal = new Metal();
        Hacha hachaDePiedra = new Hacha(new Piedra());
        double durabilidadInicialHachaDePiedra = hachaDePiedra.durabilidad();
        hachaDePiedra.golpear(metal);
        assertEquals(durabilidadInicialHachaDePiedra -5, hachaDePiedra.durabilidad(), 0.0001);
    }

    @Test
    public void test13UnHachaDePiedraGolpeaUnDiamanteYSuDurabilidadDeberiaReducirseEn5(){
        Diamante diamante = new Diamante();
        Hacha hachaDePiedra = new Hacha(new Piedra());
        double durabilidadInicialHachaDePiedra = hachaDePiedra.durabilidad();
        hachaDePiedra.golpear(diamante);
        assertEquals(durabilidadInicialHachaDePiedra -5, hachaDePiedra.durabilidad(), 0.0001);
    }

    @Test
    public void test14UnHachaDeMetalGolpeaUnaMaderaYSuDurabilidadDeberiaReducirseEn5(){
        Madera madera = new Madera();
        Hacha hachaDeMetal = new Hacha(new Metal());
        double durabilidadInicialHachaDeMetal = hachaDeMetal.durabilidad();
        hachaDeMetal.golpear(madera);
        assertEquals(durabilidadInicialHachaDeMetal -5, hachaDeMetal.durabilidad(), 0.0001);
    }

    @Test
    public void test15UnHachaDeMetalGolpeaUnaPiedraYSuDurabilidadDeberiaReducirseEn5(){
        Piedra piedra = new Piedra();
        Hacha hachaDeMetal = new Hacha(new Metal());
        double durabilidadInicialHachaDeMetal = hachaDeMetal.durabilidad();
        hachaDeMetal.golpear(piedra);
        assertEquals(durabilidadInicialHachaDeMetal -5, hachaDeMetal.durabilidad(), 0.0001);
    }

    @Test
    public void test16UnHachaDeMetalGolpeaUnMetalYSuDurabilidadDeberiaReducirseEn5(){
        Metal metal = new Metal();
        Hacha hachaDeMetal = new Hacha(new Metal());
        double durabilidadInicialHachaDeMetal = hachaDeMetal.durabilidad();
        hachaDeMetal.golpear(metal);
        assertEquals(durabilidadInicialHachaDeMetal -5, hachaDeMetal.durabilidad(), 0.0001);
    }

    @Test
    public void test17UnHachaDeMetalGolpeaUnDiamanteYSuDurabilidaDeberiaReducirseEn5(){
        Diamante diamante = new Diamante();
        Hacha hachaDeMetal = new Hacha(new Metal());
        double durabilidadInicialHachaDeMetal = hachaDeMetal.durabilidad();
        hachaDeMetal.golpear(diamante);
        assertEquals(durabilidadInicialHachaDeMetal -5, hachaDeMetal.durabilidad(), 0.0001);
    }
}