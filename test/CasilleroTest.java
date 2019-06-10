import AlgoCraft.Casillero;
import AlgoCraft.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CasilleroTest {
    @Test (expected = CasilleroOcupadoError.class)
    public void test01UnCasilleroOcupadoNoDeberiaPoderSerOcupado(){
        Casillero casillero = new Casillero();
        casillero.aniadirElemento(new MaderaProxy());
        casillero.aniadirElemento(new MaderaProxy());
    }
}
