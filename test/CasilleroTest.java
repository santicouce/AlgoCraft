import AlgoCraft.Casillero;
import AlgoCraft.CasilleroOcupadoError;
import AlgoCraft.MaderaProxy;
import org.junit.Test;

public class CasilleroTest {
    @Test (expected = CasilleroOcupadoError.class)
    public void test01UnCasilleroOcupadoNoDeberiaPoderSerOcupado(){
        Casillero casillero = new Casillero();
        casillero.aniadirElemento(new MaderaProxy());
        casillero.aniadirElemento(new MaderaProxy());
    }
}
