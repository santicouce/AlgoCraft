package algocraft;
import algocraft.errores.GolpeInvalidoError;
import algocraft.errores.ImposibleDesequiparNingunaHerramientaError;
import algocraft.herramientas.Hacha;
import algocraft.jugador.Jugador;
import algocraft.materiales.Piedra;
import org.junit.Test;

import static junit.framework.TestCase.fail;

public class EstrategiaDeGolpeSinHerramientaTest {

    private Jugador jugador = new Jugador();

    @Test(expected = GolpeInvalidoError.class)
    public void test01LaEstrategiaNoDeberiaGolpearUnaPiedraConHachaDePiedra() {
        Piedra piedra = new Piedra();

        jugador.desequiparHerramienta();
        jugador.golpear(piedra);
    }

    @Test(expected = ImposibleDesequiparNingunaHerramientaError.class)
    public void test02DesequiparUnaHerramientaNoEsPosible() {
        jugador.desequiparHerramienta();
        jugador.desequiparHerramienta();
    }

    @Test
    public void test03LuegoDeEquiparUnaHerramientaLaEstrategiaDeGolpeDeberiaCambiarAEstrategiaDeGolpeConHerramienta() {
        try {
            jugador.desequiparHerramienta();

            Hacha hacha = new Hacha(new Piedra());
            Piedra piedra = new Piedra();

            jugador.equiparHerramienta(hacha);
            jugador.golpear(piedra);
            jugador.golpear(piedra);
        } catch (Exception e){
            fail("Fallo la estrategia de golpe");
        }
    }

}

