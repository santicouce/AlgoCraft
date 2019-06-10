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
    @Test
    public void test03UnDesgasteConFactorDe2_666667AlDesgastarUnaDurabilidadDe20ConFuerza5DeberiaDevolverLaDurabilidadMenosLaFuerzaPorSuFactor(){
        DesgastePorFactor desgastePorFactor = new DesgastePorFactor(2.666667);
        int durabilidad = 20;
        int fuerza = 5;
        double resultadoEsperado = durabilidad - (fuerza*2.666667);
        assertEquals(resultadoEsperado,desgastePorFactor.desgastarDada(durabilidad, fuerza), 0.0001);
    }
    @Test
    public void test04UnDesgasteConFactorDe0_1AlDesgastarUnaDurabildiadDe20ConFuerza5DeberiaDevolverLaDurabilidadMenosLaFuerzaPorSuFactor(){
        DesgastePorFactor desgastePorFactor = new DesgastePorFactor(0.1);
        int durabilidad = 20;
        int fuerza = 5;
        double resultadoEsperado = durabilidad - (fuerza*0.1);
        assertEquals(resultadoEsperado,desgastePorFactor.desgastarDada(durabilidad, fuerza), 0.0001);
    }
}
