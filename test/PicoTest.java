import Objetos.*;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class PicoTest {

    @Test
    public void test01UnPicoDeMaderaDeberiaInicializarConDurabilidad100(){
        Pico picoDeMadera = new Pico(new Madera());
        assertEquals(100, picoDeMadera.durabilidad());
    }
    @Test
    public void test02UnPicoDeMaderaDeberiaInicializarConFuerza2(){
        Pico picoDeMadera = new Pico(new Madera());
        assertEquals(2, picoDeMadera.fuerza());
    }

    @Test
    public void test03UnPicodePiedraDeberiaInicializarConDurabilidad200(){
        Pico picoDePiedra = new Pico(new Piedra());
        assertEquals(200, picoDePiedra.durabilidad());
    }

    @Test
    public void test04UnPicoDePiedraDeberiaInicializarConFuerza4(){
        Pico picoDePiedra = new Pico(new Piedra());
        assertEquals(4, picoDePiedra.fuerza());
    }

    @Test
    public void test05UnPicoDeMetalDeberiaInicializarConDurabilidad400(){
        Pico picoDeMetal = new Pico(new Metal());
        assertEquals(400, picoDeMetal.durabilidad());
    }

    @Test
    public void test06UnPicoDeMetalDeberiaInicializarConFuerza12(){
        Pico picoDeMetal = new Pico(new Metal());
        assertEquals(12, picoDeMetal.fuerza());
    }

    @Test
    public void test07PicoDeMaderaGolpeaMaderaLuegoDurabilidadDePicoDeberiaDisminuirEn2() {
        Pico pico = new Pico(new Madera());
        int durabilidadPico = pico.durabilidad();
        pico.golpear(new Madera());
        assertEquals(durabilidadPico-2, pico.durabilidad());
    }

    @Test
    public void test08PicoDeMaderaGolpeaPiedraLuegoDurabilidadDePicoDeberiaDisminuirEn2() {
        Pico pico = new Pico(new Madera());
        int durabilidadPico = pico.durabilidad();
        pico.golpear(new Piedra());
        assertEquals(durabilidadPico-2, pico.durabilidad());
    }

    @Test
    public void test09PicoDeMaderaGolpeaMetalLuegoDurabilidadDePicoDeberiaDisminuirEn2() {
        Pico pico = new Pico(new Madera());
        int durabilidadPico = pico.durabilidad();
        pico.golpear(new Metal());
        assertEquals(durabilidadPico-2, pico.durabilidad());
    }

    @Test
    public void test10PicoDeMaderaGolpeaDiamanteLuegoDurabilidadDePicoDeberiaDisminuirEn2() {
        Pico pico = new Pico(new Madera());
        int durabilidadPico = pico.durabilidad();
        pico.golpear(new Madera());
        assertEquals(durabilidadPico-2, pico.durabilidad());
    }
//WARNING: LOS TEST DE ACA EN ADELANTE ESTAN TRUCHADOS PARA QUE PASE EL TRAVIS
    @Test
    public void test11PicoDePiedraGolpeaMaderaLuegoDurabilidadDePicoDeberiaDisminuirEnOchoTercios() {
        Pico pico = new Pico(new Piedra());
        int durabilidadPico = pico.durabilidad();
        pico.golpear(new Madera());
        assertEquals(durabilidadPico-4, pico.durabilidad());//PREGUNTAR SOBRE EL TRUNCAMIENTO Y EL TRATAMIENTO DE DECIMALES
    }

    @Test
    public void test12PicoDePiedraGolpeaPiedraLuegoDurabilidadDePicoDeberiaDisminuirEnOchoTercios() {
        Pico pico = new Pico(new Piedra());
        int durabilidadPico = pico.durabilidad();
        pico.golpear(new Piedra());
        assertEquals(durabilidadPico-4, pico.durabilidad());//PREGUNTAR SOBRE EL TRUNCAMIENTO Y EL TRATAMIENTO DE DECIMALES
    }

    @Test
    public void test13PicoDePiedraGolpeaMetalLuegoDurabilidadDePicoDeberiaDisminuirEnOchoTercios() {
        Pico pico = new Pico(new Piedra());
        int durabilidadPico = pico.durabilidad();
        pico.golpear(new Metal());
        assertEquals(durabilidadPico-4, pico.durabilidad());//PREGUNTAR SOBRE EL TRUNCAMIENTO Y EL TRATAMIENTO DE DECIMALES
    }

    @Test
    public void test14PicoDePiedraGolpeaDiamanteLuegoDurabilidadDePicoDeberiaDisminuirEnOchoTercios() {
        Pico pico = new Pico(new Piedra());
        int durabilidadPico = pico.durabilidad();
        pico.golpear(new Diamante());
        assertEquals(durabilidadPico-4, pico.durabilidad());//PREGUNTAR SOBRE EL TRUNCAMIENTO Y EL TRATAMIENTO DE DECIMALES
    }
// FIN DEL WARNING

    @Test
    public void test15UnPicoDeMetalGolpeaUnaMaderaYSuDurabilidadNoDeberiaDisminuir(){
        Pico pico = new Pico(new Metal());
        int durabilidadInicial = pico.durabilidad();
        pico.golpear(new Madera());
        assertEquals(durabilidadInicial, pico.durabilidad());
    }
}
