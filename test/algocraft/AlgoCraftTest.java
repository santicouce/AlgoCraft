package algocraft;

import algocraft.errores.GolpeInvalidoError;
import algocraft.herramientas.Hacha;
import algocraft.herramientas.Pico;
import algocraft.jugador.Jugador;
import algocraft.materiales.Madera;
import algocraft.materiales.Metal;
import algocraft.materiales.Piedra;
import org.junit.Test;

public class AlgoCraftTest {


    @Test(expected = GolpeInvalidoError.class)
    public void test01SeCreaHachaDeMaderaConDurabilidadYFuerzaCorrespondiente() {

    Juego juego = new Juego();
    Jugador jugador = juego.darJugador();
    jugador.equiparHerramienta(new Hacha(new Madera()));

        for (int i=0;i<51;i++){
            jugador.golpear(new Piedra());
        }
    }

    @Test(expected = GolpeInvalidoError.class)
    public void test02PicoDeMaderaConDurabilidadYFuerzaCorrespondiente() {

        Juego juego = new Juego();
        Jugador jugador = juego.darJugador();
        jugador.equiparHerramienta(new Pico(new Madera()));

        for (int i=0;i<51;i++){
            jugador.golpear(new Piedra());
        }
    }

    @Test(expected = GolpeInvalidoError.class)
    public void test03SeCreaHachaDeMetalConDurabilidadYFuerzaCorrespondiente() {
        Juego juego = new Juego();
        Jugador jugador = juego.darJugador();
        jugador.equiparHerramienta(new Hacha(new Metal()));

        for (int i=0;i<81;i++){
            jugador.golpear(new Piedra());
        }
    }

    @Test(expected = GolpeInvalidoError.class)
    public void test04PicoDeMetalConDurabilidadYFuerzaCorrespondiente() {
        Juego juego = new Juego();
        Jugador jugador = juego.darJugador();
        jugador.equiparHerramienta(new Pico(new Metal()));

        for (int i=0;i<11;i++){
            jugador.golpear(new Madera());
        }
    }

/*
    @Test
    public void test05PicoFinoDeMetalConDurabilidadYFuerzaCorrespondiente() {
        Juego juego = new Juego();
        Jugador jugador = juego.darJugador();
        jugador.equiparHerramienta(new PicoFino(new Metal(),new Piedra()));

        for (int i=0;i<8001;i++){
            jugador.golpear(new Piedra());
        }
    }
*/
}