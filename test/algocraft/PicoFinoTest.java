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

public class PicoFinoTest {
    @Test
    public void test01UnPicoFinoDeberiaComenzarConFuerza20(){
        Diamante diamante = new Diamante();
        PicoFino picoFino = new PicoFino(new Metal(), new Piedra());
        int durabilidadInicialDiamante = diamante.durabilidad();
        picoFino.golpear(diamante);
        assertEquals(durabilidadInicialDiamante - 20, diamante.durabilidad());
    }
/*
    @Test
    public void test02UnPicoFinoDeberiaComenzarConDurabilidad1000(){
        PicoFino picoFino = new PicoFino(new Metal(), new Piedra());
        assertEquals(1000, picoFino.durabilidad(), 0.00001);
    }
*/
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
    /*
    @Test
    public void test07UnPicoFinoGolpeaUnaMaderaYSuDurabilidadNoDeberiaReducirse(){
        PicoFino picoFino = new PicoFino(new Metal(), new Piedra());
        Madera madera = new Madera();
        double durabilidadInicialPicoFino = picoFino.durabilidad();
        picoFino.golpear(madera);
        assertEquals(durabilidadInicialPicoFino,picoFino.durabilidad(),0.00001);
    }
    @Test
    public void test08UnPicoFinoGolpeaUnaPiedraYSuDurabilidadNoDeberiaReducirse(){
        PicoFino picoFino = new PicoFino(new Metal(), new Piedra());
        Piedra piedra = new Piedra();
        double durabilidadInicialPicoFino = picoFino.durabilidad();
        picoFino.golpear(piedra);
        assertEquals(durabilidadInicialPicoFino,picoFino.durabilidad(),0.00001);
    }
    @Test
    public void test09UnPicoFinoGolpeaUnaMetalYSuDurabilidadNoDeberiaReducirse(){
        PicoFino picoFino = new PicoFino(new Metal(), new Piedra());
        Metal metal = new Metal();
        double durabilidadInicialPicoFino = picoFino.durabilidad();
        picoFino.golpear(metal);
        assertEquals(durabilidadInicialPicoFino,picoFino.durabilidad(),0.00001);
    }
    */
}
