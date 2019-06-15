package Algocraft;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class ManoVaciaTest {
    @Test
    public void test01(){
        Madera madera = new Madera();
        ManoVacia mockedManoVacia = mock(ManoVacia.class);
        doThrow(new RuntimeException()).when(mockedManoVacia).golpear(madera);
        mockedManoVacia.golpear(madera);
    }
}
