package algocraft;

import algocraft.jugador.Jugador;
import algocraft.materiales.Madera;
import algocraft.materiales.Metal;
import algocraft.materiales.Piedra;
import org.junit.Test;
import static junit.framework.TestCase.fail;

public class MesaDeConstruccionTest {


    @Test
    public void test01ConstruyoUnHachaDeMaderaSafiscatoriamente(){
        try {

            Jugador jugador = new Jugador();

            jugador.agregarMaderaAlInventario(new Madera());
            jugador.agregarMaderaAlInventario(new Madera());
            jugador.agregarMaderaAlInventario(new Madera());
            jugador.agregarMaderaAlInventario(new Madera());
            jugador.agregarMaderaAlInventario(new Madera());

            jugador.aniadirMaderaEnPosicion(0,0);
            jugador.aniadirMaderaEnPosicion(0,1);
            jugador.aniadirMaderaEnPosicion(1,0);
            jugador.aniadirMaderaEnPosicion(1,1);
            jugador.aniadirMaderaEnPosicion(1,2);

            jugador.fabricarHacha(new Madera());

        }catch(Exception e){
            fail("No pudo construirse la herramienta solicitada.");
        }
    }

    @Test
    public void test02ConstruyoUnHachaDePiedraSafiscatoriamente(){
        try {

            Jugador jugador = new Jugador();

            jugador.agregarPiedraAlInventario(new Piedra());
            jugador.agregarPiedraAlInventario(new Piedra());
            jugador.agregarPiedraAlInventario(new Piedra());
            jugador.agregarMaderaAlInventario(new Madera());
            jugador.agregarMaderaAlInventario(new Madera());

            jugador.aniadirPiedraEnPosicion(0,0);
            jugador.aniadirPiedraEnPosicion(0,1);
            jugador.aniadirPiedraEnPosicion(1,0);
            jugador.aniadirMaderaEnPosicion(1,1);
            jugador.aniadirMaderaEnPosicion(1,2);

            jugador.fabricarHacha(new Piedra());

        }catch(Exception e){
            fail("No pudo construirse la herramienta solicitada.");
        }
    }



    @Test
    public void test03ConstruyoUnHachaDeMetalSafiscatoriamente(){
        try {

            Jugador jugador = new Jugador();

            jugador.agregarMetalAlInventario(new Metal());
            jugador.agregarMetalAlInventario(new Metal());
            jugador.agregarMetalAlInventario(new Metal());
            jugador.agregarMaderaAlInventario(new Madera());
            jugador.agregarMaderaAlInventario(new Madera());

            jugador.aniadirMetalEnPosicion(0,0);
            jugador.aniadirMetalEnPosicion(0,1);
            jugador.aniadirMetalEnPosicion(1,0);
            jugador.aniadirMaderaEnPosicion(1,1);
            jugador.aniadirMaderaEnPosicion(1,2);

            jugador.fabricarHacha(new Metal());

        }catch(Exception e){
            fail("No pudo construirse la herramienta solicitada.");
        }
    }
/*
    @Test
    public void test04ConstruyoUnPicoDeMaderaSafiscatoriamente(){

    }

    @Test
    public void test05ConstruyoUnPicoDePiedraSafiscatoriamente(){

    }

    @Test
    public void test06ConstruyoUnPicoDeMetalSafiscatoriamente(){

    }

    @Test
    public void test07ConstruyoUnPicoFinoSafiscatoriamente(){

    }

    @Test
    public void test08NoPuedoConstruirUnHachaDeMaderaSinLosMaterialesNecesarios(){

    }

    @Test
    public void test09NoPuedoConstruirUnHachaDePiedraSinLosMaterialesNecesarios(){

    }

    @Test
    public void test10NoPuedoConstruirUnHachaDeMetalSinLosMaterialesNecesarios(){

    }

    @Test
    public void test11NoPuedoConstruirUnPicoDeMaderaSinLosMaterialesNecesarios(){

    }

    @Test
    public void test12NoPuedoConstruirUnPicoDePiedraSinLosMaterialesNecesarios(){

    }

    @Test
    public void test13NoPuedoConstruirUnPicoDeMetalSinLosMaterialesNecesarios(){

    }

    @Test
    public void test14NoPuedoConstruirUnPicoFinoSinLosMaterialesNecesarios(){

    }*/
}
