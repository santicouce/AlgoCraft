package algocraft;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EstrategiaDeGolpeSinHerramientaTest {

    @Test(expected = GolpeInvalidoError.class)
    public void test01LaEstrategiaNoDeberiaGolpearUnaPiedraConHachaDePiedra() {
        Jugador jugador = new Jugador();
        Piedra piedra = new Piedra();

        jugador.desequiparHerramienta();
        jugador.golpear(piedra);
    }

    @Test(expected = ImposibleDesequiparNingunaHerramientaError.class)
    public void test02DesequiparUnaHerramientaNoEsPosible() {
        Jugador jugador = new Jugador();
        jugador.desequiparHerramienta();
        jugador.desequiparHerramienta();
    }

    @Test
    public void test03LuegoDeEquiparUnaHerramientaLaEstrategiaDeGolpeDeberiaCambiarAEstrategiaDeGolpeConHerramienta() {
        Jugador jugador = new Jugador();
        jugador.desequiparHerramienta();

        Hacha hacha = new Hacha(new Piedra());
        Piedra piedra = new Piedra();

        jugador.equiparHerramienta(hacha);
        jugador.golpear(piedra);
        jugador.golpear(piedra);
    }

}

