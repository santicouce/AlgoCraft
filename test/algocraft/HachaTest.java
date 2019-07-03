package algocraft;

import algocraft.errores.GolpeInvalidoError;
import algocraft.herramientas.Hacha;
import algocraft.jugador.Jugador;
import algocraft.materiales.Madera;
import algocraft.materiales.Metal;
import algocraft.materiales.Piedra;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class HachaTest {
    @Test
    public void test01UnHachaDeMaderaDeberiaComenzarConDurabilidad100(){
        try {
            Juego juego = new Juego();
            Jugador jugador = juego.darJugador();
            jugador.equiparHerramienta(new Hacha(new Madera()));

            for (int i = 0; i < 50; i++) {
                jugador.golpear(new Piedra());
            }
        }catch(Exception e){
            fail("Fallo la prueba.");
        }
    }

    @Test(expected = GolpeInvalidoError.class)
    public void test02UnHachaDeMaderaDeberiaComenzarConDurabilidad100(){
        Juego juego = new Juego();
        Jugador jugador = juego.darJugador();
        jugador.equiparHerramienta(new Hacha(new Madera()));

        for (int i=0;i<51;i++){
            jugador.golpear(new Piedra());
        }
    }

    @Test(expected = GolpeInvalidoError.class)
    public void test03UnHachaDePiedraDeberiaComenzarDurabilidad200(){
        Juego juego = new Juego();
        Jugador jugador = juego.darJugador();
        jugador.equiparHerramienta(new Hacha(new Piedra()));

        for (int i=0;i<41;i++){
            jugador.golpear(new Madera());
        }
    }

    @Test
    public void test04UnHachaDePiedraDeberiaComenzarConDurabilidad200(){
        Juego juego = new Juego();
        Jugador jugador = juego.darJugador();
        jugador.equiparHerramienta(new Hacha(new Piedra()));

        for (int i=0;i<40;i++){
            jugador.golpear(new Madera());
        }
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
        Juego juego = new Juego();
        Jugador jugador = juego.darJugador();
        jugador.equiparHerramienta(new Hacha(new Madera()));

        for (int i=0;i<40;i++){
            jugador.golpear(new Madera());
        }
    }
/*
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

    @Test
    public void test18UnHachaSeRompeAlUsarla50Veces(){
        Hacha hachaDeMadera = new Hacha(new Madera());
        for (int i=0; i<50; i++){
            hachaDeMadera.golpear(new Madera());
        }
        assertEquals(true,hachaDeMadera.seRompio());
    }
*/
}
