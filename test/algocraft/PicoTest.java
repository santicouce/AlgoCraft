package algocraft;

import algocraft.herramientas.Pico;
import algocraft.materiales.Diamante;
import algocraft.materiales.Madera;
import algocraft.materiales.Metal;
import algocraft.materiales.Piedra;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class PicoTest {
    @Test
    public void test01UnPicoDeMaderaDeberiaComenzarConFuerza2(){
        Piedra piedra = new Piedra();
        Pico picoDeMadera = new Pico(new Madera());
        int durabilidadInicialPiedra = piedra.durabilidad();
        picoDeMadera.golpear(piedra);
        assertEquals(durabilidadInicialPiedra -2, piedra.durabilidad());
    }
/*
    @Test
    public void test02UnPicoDeMaderaDeberiaComenzarConDurabilidad100(){
        Pico picoDeMadera = new Pico(new Madera());
        assertEquals(100, picoDeMadera.durabilidad(),0.0001);
    }

    @Test
    public void test03UnPicoDePiedraDeberiaComenzarConFuerza4(){
        Piedra piedra = new Piedra();
        Pico picoDePiedra = new Pico(new Piedra());
        int durabilidadInicialPiedra = piedra.durabilidad();
        picoDePiedra.golpear(piedra);
        assertEquals(durabilidadInicialPiedra -4, piedra.durabilidad());
    }

    @Test
    public void test04UnPicoDePiedraDeberiaComenzarConDurabilidad200(){
        Pico picoDePiedra = new Pico(new Piedra());
        assertEquals(200, picoDePiedra.durabilidad(),0.0001);
    }

    @Test
    public void test05UnPicoDeMetalDeberiaComenzarConFuerza12(){
        Piedra piedra = new Piedra();
        Pico picoDeMetal = new Pico(new Metal());
        int durabilidadInicialPiedra = piedra.durabilidad();
        picoDeMetal.golpear(piedra);
        assertEquals(durabilidadInicialPiedra -12, piedra.durabilidad());
    }

    @Test
    public void test06UnPicoDeMaderaGolpeaUnaMaderaYSuDurabilidadDeberiaReducirseEn2(){
        Madera madera = new Madera();
        Pico picoDeMadera = new Pico(new Madera());
        double durabilidadInicialPicoDeMadera = picoDeMadera.durabilidad();
        picoDeMadera.golpear(madera);
        assertEquals(durabilidadInicialPicoDeMadera -2, picoDeMadera.durabilidad(), 0.0001);
    }

    @Test
    public void test07UnPicoDeMaderaGolpeaUnaPiedraYSuDurabilidadDeberiaReducirseEn2(){
        Piedra piedra = new Piedra();
        Pico picoDeMadera = new Pico(new Madera());
        double durabilidadInicialPicoDeMadera = picoDeMadera.durabilidad();
        picoDeMadera.golpear(piedra);
        assertEquals(durabilidadInicialPicoDeMadera -2, picoDeMadera.durabilidad(), 0.0001);
    }

    @Test
    public void test08UnPicoDeMaderaGolpeaUnMetalYSuDurabilidadDeberiaReducirseEn2(){
        Metal metal = new Metal();
        Pico picoDeMadera = new Pico(new Madera());
        double durabilidadInicialPicoDeMadera = picoDeMadera.durabilidad();
        picoDeMadera.golpear(metal);
        assertEquals(durabilidadInicialPicoDeMadera -2, picoDeMadera.durabilidad(), 0.0001);
    }

    @Test
    public void test09UnPicoDeMaderaGolpeaUnDiamanteYSuDurabilidadDeberiaReducirseEn2(){
        Diamante diamante = new Diamante();
        Pico picoDeMadera = new Pico(new Madera());
        double durabilidadInicialPicoDeMadera = picoDeMadera.durabilidad();
        picoDeMadera.golpear(diamante);
        assertEquals(durabilidadInicialPicoDeMadera -2, picoDeMadera.durabilidad(), 0.0001);
    }
    @Test
    public void test10UnPicoDePiedraGolpeaUnaPiedraYSuDurabilidadDeberiaReducirseEn2Punto6(){
        Madera madera = new Madera();
        Pico picoDePiedra = new Pico(new Piedra());
        double durabilidadInicialPicoDePiedra = picoDePiedra.durabilidad();
        picoDePiedra.golpear(madera);
        assertEquals(durabilidadInicialPicoDePiedra- 2.6667, picoDePiedra.durabilidad(), 0.0001);
    }

    @Test
    public void test11UnPicoDePiedraGolpeaUnaPiedraYSuDurabilidadDeberiaReducirseEn2Punto6(){
        Piedra piedra = new Piedra();
        Pico picoDePiedra = new Pico(new Piedra());
        double durabilidadInicialPicoDePiedra = picoDePiedra.durabilidad();
        picoDePiedra.golpear(piedra);
        assertEquals(durabilidadInicialPicoDePiedra -2.6667, picoDePiedra.durabilidad(), 0.0001);
    }

    @Test
    public void test12UnPicoDePiedraGolpeaUnMetalYSuDurabilidadDeberiaReducirseEn2Punto6(){
        Metal metal = new Metal();
        Pico picoDePiedra = new Pico(new Piedra());
        double durabilidadInicialPicoDePiedra = picoDePiedra.durabilidad();
        picoDePiedra.golpear(metal);
        assertEquals(durabilidadInicialPicoDePiedra -2.6667, picoDePiedra.durabilidad(), 0.0001);
    }

    @Test
    public void test13UnPicoDePiedraGolpeaUnDiamanteYSuDurabilidadDeberiaReducirseEn2Punto6(){
        Diamante diamante = new Diamante();
        Pico picoDePiedra = new Pico(new Piedra());
        double durabilidadInicialPicoDePiedra = picoDePiedra.durabilidad();
        picoDePiedra.golpear(diamante);
        assertEquals(durabilidadInicialPicoDePiedra -2.6667, picoDePiedra.durabilidad(), 0.0001);
    }

    @Test
    public void test14UnPicoDeMetalGolpeaUnaMetalYSuDurabilidadNoDeberiaCambiar(){
        Madera madera = new Madera();
        Pico picoDeMetal = new Pico(new Metal());
        double durabilidadInicialPicoDeMetal = picoDeMetal.durabilidad();
        picoDeMetal.golpear(madera);
        assertEquals(durabilidadInicialPicoDeMetal, picoDeMetal.durabilidad(), 0.0001);
    }

    @Test
    public void test15UnPicoDePiedraGolpeaUnaMetalYSuDurabilidadNoDeberiaReducirse(){
        Piedra piedra = new Piedra();
        Pico picoDeMetal = new Pico(new Metal());
        double durabilidadInicialPicoDeMetal = picoDeMetal.durabilidad();
        picoDeMetal.golpear(piedra);
        assertEquals(durabilidadInicialPicoDeMetal, picoDeMetal.durabilidad(), 0.0001);
    }

    @Test
    public void test16UnPicoDeMetalGolpeaUnMetalYSuDurabilidadNoDeberiaReducirse(){
        Metal metal = new Metal();
        Pico picoDeMetal = new Pico(new Metal());
        double durabilidadInicialPicoDeMetal = picoDeMetal.durabilidad();
        picoDeMetal.golpear(metal);
        assertEquals(durabilidadInicialPicoDeMetal, picoDeMetal.durabilidad(), 0.0001);
    }

    @Test
    public void test17UnPicoDeMetalGolpeaUnDiamanteYSuDurabilidadNoDeberiaReducirse(){
        Diamante diamante = new Diamante();
        Pico picoDeMetal = new Pico(new Metal());
        double durabilidadInicialPicoDeMetal = picoDeMetal.durabilidad();
        picoDeMetal.golpear(diamante);
        assertEquals(durabilidadInicialPicoDeMetal, picoDeMetal.durabilidad(), 0.0001);
    }
*/
}
