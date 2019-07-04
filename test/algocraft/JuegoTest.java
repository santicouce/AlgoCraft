package algocraft;

import algocraft.jugador.Jugador;
import algocraft.materiales.Madera;
import algocraft.movimientodeljugador.DireccionDerecha;
import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;

public class JuegoTest {
    private Juego juego = new Juego();

    @Test
    public void test01CantidadFilasDelTableroEsInicialmente10() {
        assertEquals(10, juego.cantidadFilasDelTablero());
    }

    @Test
    public void test02CantidadColumnasDelTableroEsInicialmente10(){
        assertEquals(10, juego.cantidadColumnasDelTablero());
    }

    @Test
    public void test03AccedeCorrectamenteAElementoATablero(){
        assertEquals("metal",juego.darNombre(4,1));
    }

    @Test
    public void test04UnJugadorGolpeaUnMaterialMirandoALaDerecha(){
        try {
            Juego juego = new Juego();

            juego.moverJugadorIzquierda();
            juego.moverJugadorArriba();
            juego.moverJugadorArriba();
            juego.moverJugadorDerecha();

            for (int i = 0; i < 5; i++) {
                juego.golpear();
            }
        }catch(Exception e){
            fail("No pudo realizarse el golpe.");
        }
    }
    @Test
    public void test05UnJugadorGolpeaUnMaterialMirandoALaIzquierda(){
        try {
            Juego juego = new Juego();

            juego.moverJugadorDerecha();
            juego.moverJugadorArriba();
            juego.moverJugadorArriba();
            juego.moverJugadorIzquierda();

            for (int i = 0; i < 5; i++) {
                juego.golpear();
            }
        }catch(Exception e){
            fail("No pudo realizarse el golpe.");
        }
    }
    @Test
    public void test06JuegoMueveUnJugadorHaciaAbajo(){
        try {
            Juego juego = new Juego();

            juego.moverJugadorAbajo();

        }catch(Exception e){
            fail("No pudo realizarse el golpe.");
        }
    }
}
