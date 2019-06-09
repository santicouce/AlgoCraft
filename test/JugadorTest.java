import AlgoCraft.Jugador;
import AlgoCraft.Madera;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JugadorTest {

    private Jugador jugador = new Jugador();

    @Test
    public void test01JugadorRecienCreadoCuentaSoloConUnHachaDeMadera(){
        Madera madera = new Madera();
        int durabilidadInicialMadera = madera.durabilidad();
        jugador.golpear(madera);
        assertEquals(durabilidadInicialMadera - 2, madera.durabilidad());
    }
}