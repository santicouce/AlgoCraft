package algocraft;

import algocraft.errores.GolpeInvalidoError;
import algocraft.herramientas.Hacha;
import algocraft.jugador.Jugador;
import algocraft.materiales.Diamante;
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

    @Test
    public void test02UnHachaDeMaderaDeberiaComenzarConDurabilidad100HastaElUso50Funciona(){
        Juego juego = new Juego();
        Jugador jugador = juego.darJugador();
        jugador.equiparHerramienta(new Hacha(new Madera()));

        for (int i=0;i<50;i++){
            jugador.golpear(new Piedra());
        }
    }

    @Test (expected = GolpeInvalidoError.class)
    public void test03UnHachaDeMaderaDeberiaComenzarConDurabilidad100EnElUso51SeRompe(){
        Juego juego = new Juego();
        Jugador jugador = juego.darJugador();
        jugador.equiparHerramienta(new Hacha(new Madera()));

        for (int i=0;i<51;i++){
            jugador.golpear(new Piedra());
        }
    }

    @Test(expected = GolpeInvalidoError.class)
    public void test04UnHachaDePiedraDeberiaComenzarDurabilidad200HastaElUso50Funciona(){
        Juego juego = new Juego();
        Jugador jugador = juego.darJugador();
        jugador.equiparHerramienta(new Hacha(new Piedra()));

        for (int i=0;i<41;i++){
            jugador.golpear(new Madera());
        }
    }

    @Test
    public void test05UnHachaDePiedraDeberiaComenzarConDurabilidad200EnElUso51SeRompe(){
        Juego juego = new Juego();
        Jugador jugador = juego.darJugador();
        jugador.equiparHerramienta(new Hacha(new Piedra()));

        for (int i=0;i<40;i++){
            jugador.golpear(new Madera());
        }
    }

    @Test
    public void test06UnHachaDeMetalDeberiaComenzarConFuerza10(){
        Madera madera = new Madera();
        Hacha hachaDePiedra = new Hacha(new Metal());
        int durabilidadInicialMadera = madera.durabilidad();
        hachaDePiedra.golpear(madera);
        assertEquals(durabilidadInicialMadera -10, madera.durabilidad());
    }

    @Test
    public void test07UnHachaDeMaderaGolpeaUnaMaderaYSuDurabilidadSeDeberiaReducirDeADosYHastaLaVez50SePuedeUsar(){
        Jugador jugador = new Jugador();
        jugador.equiparHerramienta(new Hacha(new Madera()));

        for (int i=0;i<50;i++){
            jugador.golpear(new Madera());
        }
    }

    @Test (expected = GolpeInvalidoError.class)
    public void test08UnHachaDeMaderaGolpeaUnaMaderaYSuDurabilidadSeDeberiaReducirDeADosYALaVez51LanzaExcepcion(){
        Jugador jugador = new Jugador();

        for (int i=0;i<51;i++){
            jugador.golpear(new Madera());
        }
    }

    @Test
    public void test09UnHachaDeMaderaGolpeaUnMetalYSuDurabilidadSeDeberiaReducirDeADosYHastaLaVez50SePuedeUsar(){
        Jugador jugador = new Jugador();
        jugador.equiparHerramienta(new Hacha(new Madera()));

        for (int i=0;i<50;i++){
            jugador.golpear(new Metal());
        }
    }

    @Test (expected = GolpeInvalidoError.class)
    public void test10UnHachaDeMaderaGolpeaUnMetalYSuDurabilidadSeDeberiaReducirDeADosYALaVez51LanzaExcepcion(){
        Jugador jugador = new Jugador();

        for (int i=0;i<51;i++){
            jugador.golpear(new Metal());
        }
    }

    @Test
    public void test11UnHachaDeMaderaGolpeaUnDiamanteYSuDurabilidadSeDeberiaReducirDeADosYHastaLaVez50SePuedeUsar(){
        Jugador jugador = new Jugador();
        jugador.equiparHerramienta(new Hacha(new Madera()));

        for (int i=0;i<50;i++){
            jugador.golpear(new Diamante());
        }
    }

    @Test (expected = GolpeInvalidoError.class)
    public void test12UnHachaDeMaderaGolpeaUnDiamanteYSuDurabilidadSeDeberiaReducirDeADosYALaVez51LanzaExcepcion(){
        Jugador jugador = new Jugador();

        for (int i=0;i<51;i++){
            jugador.golpear(new Diamante());
        }
    }

    @Test
    public void test13UnHachaDePiedraGolpeaUnaPiedraYSuDurabilidadSeDeberiaReducirDeADosYHastaLaVez50SePuedeUsar(){
        Jugador jugador = new Jugador();
        jugador.equiparHerramienta(new Hacha(new Madera()));

        for (int i=0;i<50;i++){
            jugador.golpear(new Piedra());
        }
    }

    @Test (expected = GolpeInvalidoError.class)
    public void test14UnHachaDePiedraGolpeaUnaPiedraYSuDurabilidadSeDeberiaReducirDeADosYALaVez51LanzaExcepcion(){
        Jugador jugador = new Jugador();

        for (int i=0;i<51;i++){
            jugador.golpear(new Piedra());
        }
    }

    @Test
    public void test15UnHachaDeMetalGolpeaUnMaderaYSuDurabilidadSeDeberiaReducirDeADosYHastaLaVez50SePuedeUsar(){
        Jugador jugador = new Jugador();
        jugador.equiparHerramienta(new Hacha(new Metal()));

        for (int i=0;i<50;i++){
            jugador.golpear(new Madera());
        }
    }

    @Test (expected = GolpeInvalidoError.class)
    public void test16UnHachaDeMetalGolpeaUnaMaderaYSuDurabilidadSeDeberiaReducirDeADosYALaVez51LanzaExcepcion(){
        Jugador jugador = new Jugador();

        for (int i=0;i<51;i++){
            jugador.golpear(new Madera());
        }
    }

    @Test
    public void test17UnHachaDeMetalGolpeaUnMetalYSuDurabilidadSeDeberiaReducirDeADosYHastaLaVez50SePuedeUsar(){
        Jugador jugador = new Jugador();
        jugador.equiparHerramienta(new Hacha(new Metal()));

        for (int i=0;i<50;i++){
            jugador.golpear(new Metal());
        }
    }

    @Test (expected = GolpeInvalidoError.class)
    public void test18UnHachaDeMetalGolpeaUnMetalYSuDurabilidadSeDeberiaReducirDeADosYALaVez51LanzaExcepcion(){
        Jugador jugador = new Jugador();

        for (int i=0;i<51;i++){
            jugador.golpear(new Metal());
        }
    }

    @Test
    public void test19UnHachaDeMetalGolpeaUnaPiedraYSuDurabilidadSeDeberiaReducirDeADosYHastaLaVez50SePuedeUsar(){
        Jugador jugador = new Jugador();
        jugador.equiparHerramienta(new Hacha(new Metal()));

        for (int i=0;i<50;i++){
            jugador.golpear(new Piedra());
        }
    }

    @Test (expected = GolpeInvalidoError.class)
    public void test20UnHachaDeMetalGolpeaUnaPiedraYSuDurabilidadSeDeberiaReducirDeADosYALaVez51LanzaExcepcion(){
        Jugador jugador = new Jugador();

        for (int i=0;i<51;i++){
            jugador.golpear(new Piedra());
        }
    }

    @Test
    public void test21UnHachaDePiedraGolpeaUnaMaderaYSuDurabilidadSeDeberiaReducirDeADosYHastaLaVez50SePuedeUsar(){
        Jugador jugador = new Jugador();
        jugador.equiparHerramienta(new Hacha(new Metal()));

        for (int i=0;i<50;i++){
            jugador.golpear(new Piedra());
        }
    }

    @Test (expected = GolpeInvalidoError.class)
    public void test22UnHachaDePiedraGolpeaUnaMaderaYSuDurabilidadSeDeberiaReducirDeADosYALaVez51LanzaExcepcion(){
        Jugador jugador = new Jugador();

        for (int i=0;i<51;i++){
            jugador.golpear(new Piedra());
        }
    }

    @Test
    public void test23UnHachaDePiedraGolpeaUnMetalYSuDurabilidadSeDeberiaReducirDeADosYHastaLaVez50SePuedeUsar(){
        Jugador jugador = new Jugador();
        jugador.equiparHerramienta(new Hacha(new Metal()));

        for (int i=0;i<50;i++){
            jugador.golpear(new Metal());
        }
    }

    @Test (expected = GolpeInvalidoError.class)
    public void test24UnHachaDePiedraGolpeaUnMetalYSuDurabilidadSeDeberiaReducirDeADosYALaVez51LanzaExcepcion(){
        Jugador jugador = new Jugador();

        for (int i=0;i<51;i++){
            jugador.golpear(new Metal());
        }
    }

    @Test
    public void test25UnHachaDePiedraGolpeaUnDiamanteYSuDurabilidadSeDeberiaReducirDeADosYHastaLaVez50SePuedeUsar(){
        Jugador jugador = new Jugador();
        jugador.equiparHerramienta(new Hacha(new Metal()));

        for (int i=0;i<50;i++){
            jugador.golpear(new Diamante());
        }
    }

    @Test (expected = GolpeInvalidoError.class)
    public void test26UnHachaDePiedraGolpeaUnDiamanteYSuDurabilidadSeDeberiaReducirDeADosYALaVez51LanzaExcepcion(){
        Jugador jugador = new Jugador();

        for (int i=0;i<51;i++){
            jugador.golpear(new Diamante());
        }
    }

}
