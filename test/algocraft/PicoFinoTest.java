package algocraft;

import algocraft.errores.ConstruccionInvalidaError;
import algocraft.errores.GolpeInvalidoError;
import algocraft.herramientas.PicoFino;
import algocraft.jugador.Jugador;
import algocraft.materiales.Diamante;
import algocraft.materiales.Madera;
import algocraft.materiales.Metal;
import algocraft.materiales.Piedra;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class PicoFinoTest {
    @Test
    public void test01UnPicoFinoDeberiaComenzarConFuerza20(){
        Diamante diamante = new Diamante();
        PicoFino picoFino = new PicoFino(new Metal(), new Piedra());
        int durabilidadInicialDiamante = diamante.durabilidad();
        picoFino.golpear(diamante);
        assertEquals(durabilidadInicialDiamante - 20, diamante.durabilidad());
    }

    @Test(expected = GolpeInvalidoError.class)
    public void test02UnPicoFinoDeberiaComenzarConDurabilidad1000(){
        Jugador jugador = new Jugador();
        jugador.desequiparHerramienta();
        jugador.equiparHerramienta(new PicoFino(new Metal(), new Piedra()));
        for (int i = 0; i < 67; i++) {
            jugador.golpear(new Diamante());
        }
    }

    @Test(expected = ConstruccionInvalidaError.class)
    public void test03UnPicoFinoNoDeberiaPoderConstruirseConUnaMadera(){
        PicoFino picoFino = new PicoFino(new Madera(), new Metal());
    }

    @Test(expected = ConstruccionInvalidaError.class)
    public void test04UnPicoFinoNoDeberiaPoderConstruirseConUnaMadera(){
        PicoFino picoFino = new PicoFino(new Piedra(), new Madera());
    }

    @Test(expected = ConstruccionInvalidaError.class)
    public void test05UnPicoFinoNoDeberiaPoderConstruirseConUnaMadera(){
        PicoFino picoFino = new PicoFino(new Madera(), new Madera());
    }

    @Test(expected = GolpeInvalidoError.class)
    public void test06UnPicoFinoGolpeaUnDiamanteYSuDurabilidadDeberiaReducirseEn100() {


        Jugador jugador = new Jugador();
        jugador.desequiparHerramienta();
        jugador.equiparHerramienta(new PicoFino(new Metal(), new Piedra()));
        for (int i = 0; i < 67; i++) {
            jugador.golpear(new Diamante());
        }
    }

    @Test
    public void test07UnPicoFinoGolpeaUnaMaderaYSuDurabilidadNoDeberiaReducirse(){
        try {
            Jugador jugador = new Jugador();
            jugador.desequiparHerramienta();
            jugador.equiparHerramienta(new PicoFino(new Metal(), new Piedra()));
            for (int i = 0; i < 100; i++) {
                jugador.golpear(new Madera());
            }
        }catch(Error e){
            fail("Algo salio mal.");
        }
    }

    @Test
    public void test08UnPicoFinoGolpeaUnaPiedraYSuDurabilidadNoDeberiaReducirse(){
        try {
            Jugador jugador = new Jugador();
            jugador.desequiparHerramienta();
            jugador.equiparHerramienta(new PicoFino(new Metal(), new Piedra()));
            for (int i = 0; i < 100; i++) {
                jugador.golpear(new Piedra());
            }
        }catch(Error e){
            fail("Algo salio mal.");
        }
    }
    @Test
    public void test09UnPicoFinoGolpeaUnaMetalYSuDurabilidadNoDeberiaReducirse(){
        try {
            Jugador jugador = new Jugador();
            jugador.desequiparHerramienta();
            jugador.equiparHerramienta(new PicoFino(new Metal(), new Piedra()));
            for (int i = 0; i < 100; i++) {
                jugador.golpear(new Metal());
            }
        }catch(Error e){
            fail("Algo salio mal.");
        }
    }

}
