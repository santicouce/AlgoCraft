package algocraft;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EstrategiaDeGolpeConHerramientaTest {

    @Test
    public void test01LaEstrategiaDeberiaGolpearUnaPiedraConHachaDePiedra() {
        Jugador jugador = new Jugador();

        Hacha hacha = new Hacha(new Piedra());
        Piedra piedra = new Piedra();
        int durabilidadInicial = piedra.durabilidad();

        jugador.equiparHerramienta(hacha);
        jugador.golpear(piedra);

        assertEquals(durabilidadInicial-5, piedra.durabilidad());
    }

    @Test(expected = GolpeInvalidoError.class)
    public void test02LaEstrategiaActualDeberiaCambiarAEstrategiaSinHerramienta() {
        Jugador jugador = new Jugador();
        jugador.desequiparHerramienta();
        jugador.golpear(new Piedra());
    }

    @Test
    public void test03LuegoDeGolpearUnMaterialLaEstrategiaDeGolpeDelJugadorDeberiaContinuarSiendoLaMisma() {
        Jugador jugador = new Jugador();
        Hacha hacha = new Hacha(new Piedra());
        Piedra piedra = new Piedra();
        jugador.equiparHerramienta(hacha);
        jugador.golpear(piedra);
        jugador.golpear(piedra);
        jugador.golpear(piedra);
    }

}
