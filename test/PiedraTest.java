import Objetos.*;
import Objetos.Piedra;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PiedraTest {
    @Test
    public void test01UnaPiedraDeberiaInicializarConDurabilidad30(){
        Piedra piedra = new Piedra();
        assertEquals(30,piedra.durabilidad());
    }

    @Test
    public void test02UnaPiedraEsGolpeadaPorUnPicoDeMaderaYSuDurabilidadSeDeberiaReducirEn2(){
        Piedra piedra = new Piedra();
        Pico pico = new Pico(new Madera());
        int durabilidadInicialDePiedra = piedra.durabilidad();
        piedra.serGolpeadaPor(pico);
        assertEquals(durabilidadInicialDePiedra-2, piedra.durabilidad());
    }
    @Test
    public void test03UnaPiedraEsGolpeadaPorUnPicoDePiedraYSuDurabilidadSeDeberiaReducirEn4(){
        Piedra piedra = new Piedra();
        Pico pico = new Pico(new Piedra());
        int durabilidadInicialDePiedra = piedra.durabilidad();
        piedra.serGolpeadaPor(pico);
        assertEquals(durabilidadInicialDePiedra-4, piedra.durabilidad());
    }
    @Test
    public void test04UnaPiedraEsGolpeadaPorUnPicoDeMetalYSuDurabilidadSeDeberiaReducirEn12(){
        Piedra piedra = new Piedra();
        Pico pico = new Pico(new Metal());
        int durabilidadInicialDePiedra = piedra.durabilidad();
        piedra.serGolpeadaPor(pico);
        assertEquals(durabilidadInicialDePiedra-12, piedra.durabilidad());
    }
}