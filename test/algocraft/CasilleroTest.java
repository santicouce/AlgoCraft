package algocraft;
import algocraft.errores.CasilleroOcupadoError;
import algocraft.mapadejuego.Casillero;
import algocraft.materiales.Madera;
import org.junit.Test;

public class CasilleroTest {
    @Test (expected = CasilleroOcupadoError.class)
    public void test01UnCasilleroOcupadoNoDeberiaPoderSerOcupado(){
        Casillero casillero = new Casillero();
        casillero.aniadirElemento(new Madera());
        casillero.aniadirElemento(new Madera());
    }
}
