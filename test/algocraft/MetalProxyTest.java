package algocraft;
import algocraft.herramientas.Hacha;
import algocraft.herramientas.Pico;
import algocraft.herramientas.PicoFino;
import algocraft.materiales.Madera;
import algocraft.materiales.Metal;
import algocraft.materiales.MetalProxy;
import algocraft.materiales.Piedra;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class MetalProxyTest {
    MetalProxy metalProxy = new MetalProxy();
    int durabilidadInicialMetal = metalProxy.durabilidad();
    @Test
    public void test02UnMetalEsGolpeadoPorUnPicoDeMaderaYSuDurabilidadNoDeberiaCambiar(){
        Pico picoDeMadera = new Pico(new Madera());
        metalProxy.serGolpeadaPor(picoDeMadera);
        assertEquals(durabilidadInicialMetal, metalProxy.durabilidad(), 0.00001);
    }

    @Test
    public void test01UnMetalEsGolpeadoPorUnPicoDePiedraYSuDurabilidadDeberiaReducirseEn4(){
        Pico picoDePiedra = new Pico(new Piedra());
        metalProxy.serGolpeadaPor(picoDePiedra);
        assertEquals(durabilidadInicialMetal-4, metalProxy.durabilidad(), 0.00001);
    }

    @Test
    public void test03UnMetalEsGolpeadoPorUnPicoDeMetalYSuDurabilidadNoDeberiaCambiar(){
        Pico picoDeMetal = new Pico(new Madera());
        metalProxy.serGolpeadaPor(picoDeMetal);
        assertEquals(durabilidadInicialMetal, metalProxy.durabilidad(), 0.00001);
    }

    @Test
    public void test04UnMetalEsGolpeadoPorUnHachaDeMaderaYSuDurabilidadNoDeberiaCambiar(){
        Hacha hachaDeMadera = new Hacha(new Madera());
        metalProxy.serGolpeadaPor(hachaDeMadera);
        assertEquals(durabilidadInicialMetal, metalProxy.durabilidad(), 0.00001);
    }

    @Test
    public void test05UnMetalEsGolpeadoPorUnHachaDePiedraYSuDurabilidadNoDeberiaCambiar(){
        Hacha hachaDePiedra = new Hacha(new Piedra());
        metalProxy.serGolpeadaPor(hachaDePiedra);
        assertEquals(durabilidadInicialMetal, metalProxy.durabilidad(), 0.00001);
    }
    @Test
    public void test06UnMetalEsGolpeadoPorUnHachaDeMetalYSuDurabilidadNoDeberiaCambiar(){
        Hacha hachaDeMetal = new Hacha(new Metal());
        metalProxy.serGolpeadaPor(hachaDeMetal);
        assertEquals(durabilidadInicialMetal, metalProxy.durabilidad(), 0.00001);
    }
    @Test
    public void test07UnMetalEsGolpeadoPorUnPicoFinoYSuDurabilidadNoDeberiaCambiar(){
        PicoFino picoFino = new PicoFino(new Metal(), new Piedra());
        metalProxy.serGolpeadaPor(picoFino);
        assertEquals(durabilidadInicialMetal, metalProxy.durabilidad(), 0.00001);
    }
}
