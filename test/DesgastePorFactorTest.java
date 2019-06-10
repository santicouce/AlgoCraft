import AlgoCraft.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DesgastePorFactorTest {
    @Test
    public void test01UnDesgasteConFactor1AlDesgastarUnaDurabilidadDe20ConFuerza5DeberiaDevolver15(){
        DesgastePorFactor desgastePorFactor = new DesgastePorFactor(1);
        double durabilidad = 20;
        int fuerza = 5;
        assertEquals(15,desgastePorFactor.desgastarDada(durabilidad, fuerza), 0.0001);
    }
    @Test
    public void test02UnDesgasteConFactorDeDesgaste0_5AlDesgastarUnaDurabilidadDe20ConFuerza5DeberiaDevolverLaDurabilidadMenosLaMitadDeLaFuerza(){
        DesgastePorFactor desgastePorFactor = new DesgastePorFactor(0.5);
        int durabilidad = 20;
        int fuerza = 5;
        double resultadoEsperado = durabilidad - (fuerza*0.5);
        assertEquals(resultadoEsperado,desgastePorFactor.desgastarDada(durabilidad, fuerza), 0.0001);
    }
}
