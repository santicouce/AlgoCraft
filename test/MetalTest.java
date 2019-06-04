<<<<<<< HEAD
import Objetos.Madera;
import Objetos.Metal;
import Objetos.Pico;
import Objetos.Metal;

=======
import Objetos.Metal;
>>>>>>> parent of b134772... Modifiqué Jugador y su test
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MetalTest {
    @Test
    public void test01UnaMetalDeberiaInicializarConDurabilidad50(){
        Metal metal = new Metal();
        assertEquals(50,metal.durabilidad());
    }
<<<<<<< HEAD

    @Test
    public void test02UnaMetalSeGolpeaConUnPicoDeMaderaYDurabilidadDeLaPiedraNoCambia(){
        Metal metal = new Metal();
        int durabilidadIncialDelmetal= metal.durabilidad();

        Pico pico = new Pico(new Madera());
        pico.golpear(metal);

        assertEquals(durabilidadIncialDelmetal,metal.durabilidad());

    }
=======
>>>>>>> parent of b134772... Modifiqué Jugador y su test
}