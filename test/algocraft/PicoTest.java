package algocraft;


import algocraft.herramientas.Pico;
import algocraft.jugador.Jugador;
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

    @Test
    public void test02UnPicoDeMetalSeRompeAlDecimoUSo(){
        Juego juego = new Juego();
        Jugador jugador = juego.darJugador();
        jugador.equiparHerramienta(new Pico(new Metal()));

        for (int i=0;i<11;i++){
            jugador.golpear(new Metal());
        }
    }

/*
    @Test
    public void test03UnPicoDePiedraDeberiaComenzarConFuerza4(){
        Piedra piedra = new Piedra();
        Pico picoDePiedra = new Pico(new Piedra());
        int durabilidadInicialPiedra = piedra.durabilidad();
        picoDePiedra.golpear(piedra);
        assertEquals(durabilidadInicialPiedra -4, piedra.durabilidad());
    public void test02UnPicoDeMaderaGolpeaUnaMaderaYSuDurabilidadSeDeberiaReducirDeADosYHastaLaVez50SePuedeUsar(){
        Jugador jugador = new Jugador();
        jugador.desequiparHerramienta();
        jugador.equiparHerramienta(new Pico(new Madera()));

        for (int i=0;i<50;i++){
            jugador.golpear(new Madera());
        }
    }

    @Test (expected = GolpeInvalidoError.class)
    public void test03UnPicoDeMaderaGolpeaUnaMaderaYSuDurabilidadSeDeberiaReducirDeADosYALaVez51LanzaExcepcion(){
        Jugador jugador = new Jugador();
        jugador.desequiparHerramienta();
        jugador.equiparHerramienta(new Pico(new Madera()));

        for (int i=0;i<51;i++){
            jugador.golpear(new Madera());
        }
    }

    @Test
    public void test04UnPicoDePiedraComienzaConDurabilidad200YDesgastaConFuerza4Dividido1Coma5HastaLaVez75EsUsable(){
        Jugador jugador = new Jugador();
        jugador.desequiparHerramienta();
        jugador.equiparHerramienta(new Pico(new Piedra()));

        for (int i=0;i<75;i++){
            jugador.golpear(new Piedra());
        }
    }

    @Test (expected = GolpeInvalidoError.class)
    public void test05UnPicoDePiedraComienzaConDurabilidad200YDesgastaConFuerza4Dividido1Coma5ALaVez76SeRompe(){
        Jugador jugador = new Jugador();
        jugador.desequiparHerramienta();
        jugador.equiparHerramienta(new Pico(new Piedra()));

        for (int i=0;i<76;i++){
            jugador.golpear(new Piedra());
        }
    }

    @Test
    public void test06UnPicoDeMaderaGolpeaUnMetalYSuDurabilidadSeDeberiaReducirDeADosYHastaLaVez50SePuedeUsar(){
        Jugador jugador = new Jugador();
        jugador.desequiparHerramienta();
        jugador.equiparHerramienta(new Pico(new Madera()));

        for (int i=0;i<50;i++){
            jugador.golpear(new Metal());
        }
    }

    @Test (expected = GolpeInvalidoError.class)
    public void test07UnPicoDeMaderaGolpeaUnMetalYSuDurabilidadSeDeberiaReducirDeADosYALaVez51LanzaExcepcion(){
        Jugador jugador = new Jugador();
        jugador.desequiparHerramienta();
        jugador.equiparHerramienta(new Pico(new Madera()));

        for (int i=0;i<51;i++){
            jugador.golpear(new Metal());
        }
    }

    @Test
    public void test08UnPicoDeMaderaGolpeaUnaPiedraYSuDurabilidadSeDeberiaReducirDeADosYHastaLaVez50SePuedeUsar(){
        Jugador jugador = new Jugador();
        jugador.desequiparHerramienta();
        jugador.equiparHerramienta(new Pico(new Madera()));

        for (int i=0;i<50;i++){
            jugador.golpear(new Madera());
        }
    }

    @Test (expected = GolpeInvalidoError.class)
    public void test09UnPicoDeMaderaGolpeaUnaPiedraYSuDurabilidadSeDeberiaReducirDeADosYALaVez51LanzaExcepcion(){
        Jugador jugador = new Jugador();
        jugador.desequiparHerramienta();
        jugador.equiparHerramienta(new Pico(new Madera()));

        for (int i=0;i<51;i++){
            jugador.golpear(new Madera());
        }
    }

    @Test
    public void test10UnPicoDeMaderaGolpeaUnDiamanteYSuDurabilidadSeDeberiaReducirDeADosYHastaLaVez50SePuedeUsar(){
        Jugador jugador = new Jugador();
        jugador.desequiparHerramienta();
        jugador.equiparHerramienta(new Pico(new Madera()));

        for (int i=0;i<50;i++){
            jugador.golpear(new Diamante());
        }
    }

    @Test (expected = GolpeInvalidoError.class)
    public void test11UnPicoDeMaderaGolpeaUnDiamanteYSuDurabilidadSeDeberiaReducirDeADosYALaVez51LanzaExcepcion(){
        Jugador jugador = new Jugador();
        jugador.desequiparHerramienta();
        jugador.equiparHerramienta(new Pico(new Madera()));

        for (int i=0;i<51;i++){
            jugador.golpear(new Diamante());
        }
    }

    @Test
    public void test12UnPicoDePiedraGolpeaUnDiamanteYSuDurabilidadSeDeberiaReducirDeADosYHastaLaVez75SePuedeUsar(){
        Jugador jugador = new Jugador();
        Diamante diamante = new Diamante();
        jugador.desequiparHerramienta();
        jugador.equiparHerramienta(new Pico(new Piedra()));

        for (int i=0;i<75;i++){
            jugador.golpear(diamante);
        }
    }

    @Test (expected = GolpeInvalidoError.class)
    public void test13UnPicoDePiedraGolpeaUnDiamanteYSuDurabilidadSeDeberiaReducirDeADosYALaVez76SeRompe() {
        Jugador jugador = new Jugador();
        Diamante diamante = new Diamante();
        jugador.desequiparHerramienta();
        jugador.equiparHerramienta(new Pico(new Piedra()));

        for (int i = 0; i < 76; i++) {
            jugador.golpear(diamante);
        }
    }

    @Test
    public void test14UnPicoDePiedraGolpeaUnaPiedraYSuDurabilidadSeDeberiaReducirDeADosYHastaLaVez75SePuedeUsar(){
        Jugador jugador = new Jugador();
        jugador.desequiparHerramienta();
        jugador.equiparHerramienta(new Pico(new Piedra()));

        for (int i=0;i<75;i++){
            jugador.golpear(new Piedra());
        }
    }

    @Test (expected = GolpeInvalidoError.class)
    public void test15UnPicoDePiedraGolpeaUnaPiedraYSuDurabilidadSeDeberiaReducirDeADosYALaVez76SeRompe() {
        Jugador jugador = new Jugador();
        jugador.desequiparHerramienta();
        jugador.equiparHerramienta(new Pico(new Piedra()));

        for (int i = 0; i < 76; i++) {
            jugador.golpear(new Piedra());
        }
    }

    @Test
    public void test16UnPicoDePiedraGolpeaUnaMaderaYSuDurabilidadSeDeberiaReducirDeADosYHastaLaVez75SePuedeUsar(){
        Jugador jugador = new Jugador();
        jugador.desequiparHerramienta();
        jugador.equiparHerramienta(new Pico(new Piedra()));

        for (int i=0;i<75;i++){
            jugador.golpear(new Madera());
        }
    }

    @Test (expected = GolpeInvalidoError.class)
    public void test17UnPicoDePiedraGolpeaUnaMaderaYSuDurabilidadSeDeberiaReducirDeADosYALaVez76SeRompe() {
        Jugador jugador = new Jugador();
        jugador.desequiparHerramienta();
        jugador.equiparHerramienta(new Pico(new Piedra()));

        for (int i = 0; i < 76; i++) {
            jugador.golpear(new Madera());
        }
    }

    @Test
    public void test18UnPicoDePiedraGolpeaUnMetalYSuDurabilidadSeDeberiaReducirDeADosYHastaLaVez75SePuedeUsar(){
        Jugador jugador = new Jugador();
        jugador.desequiparHerramienta();
        jugador.equiparHerramienta(new Pico(new Piedra()));

        for (int i=0;i<75;i++){
            jugador.golpear(new Metal());
        }
    }

    @Test (expected = GolpeInvalidoError.class)
    public void test19UnPicoDePiedraGolpeaUnMetalYSuDurabilidadSeDeberiaReducirDeADosYALaVez76SeRompe() {
        Jugador jugador = new Jugador();
        jugador.desequiparHerramienta();
        jugador.equiparHerramienta(new Pico(new Piedra()));

        for (int i = 0; i < 76; i++) {
            jugador.golpear(new Metal());
        }
    }
*/
}
