package algocraft;

import algocraft.herramientas.Pico;
import algocraft.materiales.Metal;
import algocraft.materiales.Piedra;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MetalTest {
    @Test
    public void test01UnMetalDeberiaInicializarConDurabilidad50(){
        Metal metal = new Metal();
        assertEquals(50,metal.durabilidad());
    }
    @Test
    public void test02UnMetalEsGolpeadoPorUnPicoDePiedraYSuDurabilidadDeberiaReducirseEn5(){
        Metal metal = new Metal();
        int durabilidadInicialMetal = metal.durabilidad();
        Pico picoDePiedra = new Pico(new Piedra());
        picoDePiedra.golpear(metal);
        assertEquals(durabilidadInicialMetal-5,metal.durabilidad());
    }
}