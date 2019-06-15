package algocraft;

import algocraft.herramientas.PicoFino;
import algocraft.materiales.Diamante;
import algocraft.materiales.Metal;
import algocraft.materiales.Piedra;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PicoFinoTest {
    @Test
    public void test01UnPicoFinoDeberiaComenzarConFuerza20(){
        Diamante diamante = new Diamante();
        PicoFino picoFino = new PicoFino(new Metal(), new Piedra());
        int durabilidadInicialDiamante = diamante.durabilidad();
        picoFino.golpear(diamante);
        assertEquals(durabilidadInicialDiamante - 20, diamante.durabilidad());
    }
}
