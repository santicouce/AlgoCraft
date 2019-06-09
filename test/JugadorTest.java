import Objetos.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JugadorTest {
    @Test
    public void test01JugadorRecienCreadoCuentaSoloConUnHachaDeMadera(){
        Jugador jugador = new Jugador();
        Madera madera = new Madera();
        int durabilidadInicialMadera = madera.durabilidad();
        jugador.golpear(madera);
        assertEquals(durabilidadInicialMadera - 2, madera.durabilidad());
    }
}