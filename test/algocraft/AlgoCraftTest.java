package algocraft;

import algocraft.errores.GolpeInvalidoError;
import algocraft.errores.HerramientaRotaError;
import algocraft.herramientas.Hacha;
import algocraft.herramientas.Pico;
import algocraft.herramientas.PicoFino;
import algocraft.jugador.Jugador;
import algocraft.mapadejuego.Mapa;
import algocraft.materiales.Madera;
import algocraft.materiales.Metal;
import algocraft.materiales.Piedra;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AlgoCraftTest {

    private Madera madera = new Madera();
    private Hacha hachaDeMadera = new Hacha(madera);
    private Pico picoDeMadera = new Pico(madera);
    private Metal metal = new Metal();
    private Hacha hachaDeMetal = new Hacha(metal);
    private Pico picoDeMetal = new Pico(metal);
    private Piedra piedra = new Piedra();
    private PicoFino picoFino = new PicoFino(metal, piedra);

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

/*    @Test
    public void test04PicoDeMetalConDurabilidadYFuerzaCorrespondiente() {
        Juego juego = new Juego();
        Jugador jugador = juego.darJugador();
        jugador.equiparHerramienta(new Pico(new Metal()));

        for (int i=0;i<8000;i++){
            jugador.golpear(new Madera());
        }
    }


    @Test
    public void test05PicoFinoDeMetalConDurabilidadYFuerzaCorrespondiente() {
        Juego juego = new Juego();
        Jugador jugador = juego.darJugador();
        jugador.equiparHerramienta(new PicoFino(new Metal(),new Piedra()));

        for (int i=0;i<8001;i++){
            jugador.golpear(new Piedra());
        }
    }


    @Test
    public void test06HachaDeMaderaGolpeaMaderaLuegoDurabilidadDeHachaDisminuyeEn2YSuFuerzaSeMantiene() {
        int durabilidadHacha = 100;
        int fuerzaHacha = 2;
        hachaDeMadera.golpear(madera);
        assertEquals(durabilidadHacha-2, hachaDeMadera.durabilidad(),0.0001);
        assertEquals(fuerzaHacha, hachaDeMadera.fuerza());
    }

    @Test
    public void test08HachaDeMaderaGolpeaMadera2VecesLuegoDurabilidadDeHachaDisminuyeEn4YSuFuerzaSeMantiene() {
        int durabilidadHacha = 100;
        int fuerzaHacha = 2;

        hachaDeMadera.golpear(madera);
        hachaDeMadera.golpear(madera);

        assertEquals(durabilidadHacha-4, hachaDeMadera.durabilidad(),0.0001);
        assertEquals(fuerzaHacha, hachaDeMadera.fuerza());
    }
    */
}