package algocraft;

import algocraft.errores.GolpeInvalidoError;
import algocraft.herramientas.Hacha;
import algocraft.jugador.Jugador;
import algocraft.materiales.Madera;
import algocraft.materiales.Piedra;
import org.junit.Test;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;

public class EstrategiaDeGolpeConHerramientaTest {

    @Test
    public void test01LaEstrategiaDeberiaGolpearUnaPiedraConHachaDePiedra() {
        Jugador jugador = new Jugador();

        Madera madera = new Madera();
        int durabilidadInicial = madera.durabilidad();

        jugador.golpear(madera);

        assertEquals(durabilidadInicial-2, madera.durabilidad());
    }

    @Test(expected = GolpeInvalidoError.class)
    public void test02LuegoDeDesequiparUnaHerramientaLaEstrategiaActualDeberiaCambiarAEstrategiaSinHerramienta() {
        Jugador jugador = new Jugador();
        jugador.desequiparHerramienta();
        jugador.golpear(new Piedra());
    }

    @Test
    public void test03LuegoDeEquiparUnaHerramientaYGolpearUnMaterialLaEstrategiaDeGolpeDeberiaContinuarSiendoLaMisma() {
        try {
            Jugador jugador = new Jugador();
            Hacha hacha = new Hacha(new Piedra());
            Piedra piedra = new Piedra();
            jugador.equiparHerramienta(hacha);
            jugador.golpear(piedra);
            jugador.golpear(piedra);
            jugador.golpear(piedra);
        } catch (Exception GolpeInvalidoError){
            fail("Falla en test03 para equipar herramienta y golpear material");
        }
    }
    @Test
    public void test04EquipoyDesequipoUnaHerramientaLaEstrategiaDeGolpeDeberiaContinuarSiendoLaMisma() {
        try {
        Jugador jugador = new Jugador();
        Hacha hacha = new Hacha(new Piedra());
        Piedra piedra = new Piedra();
        jugador.equiparHerramienta(hacha);
        jugador.desequiparHerramienta();
        jugador.equiparHerramienta(hacha);
        jugador.golpear(piedra);
        jugador.golpear(piedra);
        jugador.golpear(piedra);
        } catch (Exception e){
            fail("Fallo la estrategia de golpe");
        }
    }

}
