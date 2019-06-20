package algocraft;

import algocraft.herramientas.Hacha;
import algocraft.herramientas.Pico;
import algocraft.herramientas.PicoFino;
import algocraft.materiales.Madera;
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
    public void test02UnMetalEsGolpeadoPorUnPicoDePiedraYSuDurabilidadDeberiaReducirseEn4(){
        Metal metal = new Metal();
        int durabilidadInicialMetal = metal.durabilidad();
        Pico picoDePiedra = new Pico(new Piedra());
        picoDePiedra.golpear(metal);
        assertEquals(durabilidadInicialMetal-4,metal.durabilidad());
    }
    @Test
    public void test03UnMetalEsGolpeadoPorUnPicoDeMaderaYSuDurabilidadDeberiaNoReducirse(){
        Metal metal = new Metal();
        int durabilidadInicialMetal = metal.durabilidad();
        Pico picoDeMadera = new Pico(new Madera());
        picoDeMadera.golpear(metal);
        assertEquals(durabilidadInicialMetal,metal.durabilidad());
    }
    @Test
    public void test04UnMetalEsGolpeadoPorUnPicoDeMetalYSuDurabilidadDeberiaNoReducirse(){
        Metal metal = new Metal();
        int durabilidadInicialMetal = metal.durabilidad();
        Pico picoDeMetal = new Pico(new Metal());
        picoDeMetal.golpear(metal);
        assertEquals(durabilidadInicialMetal,metal.durabilidad());
    }
    @Test
    public void test05UnMetalEsGolpeadoPorUnHachaDeMaderaYSuDurabilidadDeberiaNoReducirse(){
        Metal metal = new Metal();
        int durabilidadInicialMetal = metal.durabilidad();
        Hacha hachaDeMadera = new Hacha(new Madera());
        hachaDeMadera.golpear(metal);
        assertEquals(durabilidadInicialMetal,metal.durabilidad());
    }
    @Test
    public void test06UnMetalEsGolpeadoPorUnHachaDePiedraYSuDurabilidadDeberiaNoReducirse(){
        Metal metal = new Metal();
        int durabilidadInicialMetal = metal.durabilidad();
        Hacha hachaDePiedra = new Hacha(new Piedra());
        hachaDePiedra.golpear(metal);
        assertEquals(durabilidadInicialMetal,metal.durabilidad());
    }
    @Test
    public void test07UnMetalEsGolpeadoPorUnHachaDeMetalYSuDurabilidadDeberiaNoReducirse(){
        Metal metal = new Metal();
        int durabilidadInicialMetal = metal.durabilidad();
        Hacha hachaDeMetal = new Hacha(new Metal());
        hachaDeMetal.golpear(metal);
        assertEquals(durabilidadInicialMetal,metal.durabilidad());
    }
    @Test
    public void test08UnMetalEsGolpeadoPorUnPicoFinoYSuDurabilidadDeberiaNoReducirse(){
        Metal metal = new Metal();
        int durabilidadInicialMetal = metal.durabilidad();
        PicoFino picoFino = new PicoFino(new Metal(), new Piedra());
        picoFino.golpear(metal);
        assertEquals(durabilidadInicialMetal,metal.durabilidad());
    }
    @Test
    public void test09UnMetalSeInicializaConNumeroDeId2(){
        Metal metal = new Metal();
        assertEquals(metal.getId(), "3");
    }
}