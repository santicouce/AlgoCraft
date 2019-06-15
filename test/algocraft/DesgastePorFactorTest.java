package algocraft;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DesgastePorFactorTest {
    @Test
    public void test01UnDesgasteConFactor1AlDesgastarUnaDurabilidadDe20ConFuerza5DeberiaDevolver15(){
        DesgastePorFactorFuerza desgastePorFactor = new DesgastePorFactorFuerza(1);
        double durabilidad = 20;
        int fuerza = 5;
        assertEquals(15,desgastePorFactor.desgastarDada(durabilidad, fuerza), 0.0001);
    }
    @Test
    public void test02UnDesgasteConFactorDeDesgaste0o5AlDesgastarUnaDurabilidadDe20ConFuerza5DeberiaDevolverLaDurabilidadMenosLaMitadDeLaFuerza(){
        DesgastePorFactorFuerza desgastePorFactor = new DesgastePorFactorFuerza(0.5);
        int durabilidad = 20;
        int fuerza = 5;
        double resultadoEsperado = durabilidad - (fuerza*0.5);
        assertEquals(resultadoEsperado,desgastePorFactor.desgastarDada(durabilidad, fuerza), 0.0001);
    }
    @Test
    public void test03UnDesgasteConFactorDe2o666667AlDesgastarUnaDurabilidadDe20ConFuerza5DeberiaDevolverLaDurabilidadMenosLaFuerzaPorSuFactor(){
        DesgastePorFactorFuerza desgastePorFactor = new DesgastePorFactorFuerza(2.666667);
        int durabilidad = 20;
        int fuerza = 5;
        double resultadoEsperado = durabilidad - (fuerza*2.666667);
        assertEquals(resultadoEsperado,desgastePorFactor.desgastarDada(durabilidad, fuerza), 0.0001);
    }
    @Test
    public void test04UnDesgasteConFactorDe0o1AlDesgastarUnaDurabildiadDe20ConFuerza5DeberiaDevolverLaDurabilidadMenosLaFuerzaPorSuFactor(){
        DesgastePorFactorFuerza desgastePorFactor = new DesgastePorFactorFuerza(0.1);
        int durabilidad = 20;
        int fuerza = 5;
        double resultadoEsperado = durabilidad - (fuerza*0.1);
        assertEquals(resultadoEsperado,desgastePorFactor.desgastarDada(durabilidad, fuerza), 0.0001);
    }
}
