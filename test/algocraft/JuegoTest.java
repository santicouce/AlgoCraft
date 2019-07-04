package algocraft;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

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

}
