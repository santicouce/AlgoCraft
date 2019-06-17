package algocraft;

import algocraft.herramientas.Hacha;
import algocraft.herramientas.Pico;
import algocraft.herramientas.PicoFino;
import algocraft.materiales.Diamante;
import algocraft.materiales.Madera;
import algocraft.materiales.Metal;
import algocraft.materiales.Piedra;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiamanteTest {

    private Diamante diamante = new Diamante();

    @Test
    public void test01UnDiamanteDeberiaInicializarConDurabilidad100(){
        assertEquals(100,diamante.durabilidad());
    }

    @Test
    public void test02UnDiamanteEsGolpeadoConUnPicoFinoYSuDurabilidadDeberiaReducirseEn20(){
        PicoFino picoFino = new PicoFino(new Metal(), new Piedra());
        int durabilidadInicialDiamante = diamante.durabilidad();
        picoFino.golpear(diamante);
        assertEquals(durabilidadInicialDiamante-20, diamante.durabilidad());
    }
    @Test
    public void test03UnDimanteEsGolpeadoConUnHachaDeMaderaYSuDurabilidadNoDeberiaReducirse(){
        Hacha hachaDeMadera = new Hacha(new Madera());
        int durabilidadInicialDiamante = diamante.durabilidad();
        hachaDeMadera.golpear(diamante);
        assertEquals(durabilidadInicialDiamante, diamante.durabilidad());
    }
    @Test
    public void test04UnDimanteEsGolpeadoConUnHachaDePiedraYSuDurabilidadNoDeberiaReducirse(){
        Hacha hachaDePiedra = new Hacha(new Piedra());
        int durabilidadInicialDiamante = diamante.durabilidad();
        hachaDePiedra.golpear(diamante);
        assertEquals(durabilidadInicialDiamante, diamante.durabilidad());
    }
    @Test
    public void test05UnDimanteEsGolpeadoConUnHachaDeMetalYSuDurabilidadNoDeberiaReducirse(){
        Hacha hachaDeMetal = new Hacha(new Metal());
        int durabilidadInicialDiamante = diamante.durabilidad();
        hachaDeMetal.golpear(diamante);
        assertEquals(durabilidadInicialDiamante, diamante.durabilidad());
    }
    @Test
    public void test06UnDimanteEsGolpeadoConUnPicoDeMaderaYSuDurabilidadNoDeberiaReducirse(){
        Pico picoDeMadera = new Pico(new Madera());
        int durabilidadInicialDiamante = diamante.durabilidad();
        picoDeMadera.golpear(diamante);
        assertEquals(durabilidadInicialDiamante, diamante.durabilidad());
    }
    @Test
    public void test07UnDimanteEsGolpeadoConUnPicoDePiedraYSuDurabilidadNoDeberiaReducirse(){
        Pico picoDePiedra = new Pico(new Piedra());
        int durabilidadInicialDiamante = diamante.durabilidad();
        picoDePiedra.golpear(diamante);
        assertEquals(durabilidadInicialDiamante, diamante.durabilidad());
    }
    @Test
    public void test06UnDimanteEsGolpeadoConUnPicoDeMetalYSuDurabilidadNoDeberiaReducirse(){
        Pico picoDeMetal = new Pico(new Metal());
        int durabilidadInicialDiamante = diamante.durabilidad();
        picoDeMetal.golpear(diamante);
        assertEquals(durabilidadInicialDiamante, diamante.durabilidad());
    }
    @Test
    public void test07UnDiamanteSeInicializaConId4(){
        assertEquals(4, diamante.id());
    }
}