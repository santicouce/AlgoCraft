package algocraft;

import algocraft.errores.ImposibleCrearHerramientaError;
import algocraft.jugador.Jugador;
import algocraft.materiales.Madera;
import algocraft.materiales.Metal;
import algocraft.materiales.Piedra;
import org.junit.Test;
import static junit.framework.TestCase.fail;

public class MesaDeConstruccionTest {


    @Test
    public void test01ConstruyoUnHachaDeMaderaSafiscatoriamente(){

        try{
            Jugador jugador = new Jugador();
            jugador.agregarMaterialAlInventario("madera", new Madera());
            jugador.agregarMaterialAlInventario("madera", new Madera());
            jugador.agregarMaterialAlInventario("madera", new Madera());
            jugador.agregarMaterialAlInventario("madera", new Madera());
            jugador.agregarMaterialAlInventario("madera", new Madera());

            jugador.aniadirMaterialEnPosicion(0,0, "madera");
            jugador.aniadirMaterialEnPosicion(0,1, "madera");
            jugador.aniadirMaterialEnPosicion(1,0, "madera");
            jugador.aniadirMaterialEnPosicion(1,1, "madera");
            jugador.aniadirMaterialEnPosicion(1,2, "madera");

            jugador.fabricarUnaHerramienta();

        }catch(Exception e){
            fail("No pudo construirse la herramienta solicitada.");
        }
    }

    @Test
    public void test02ConstruyoUnHachaDePiedraSafiscatoriamente(){
        try {

            Jugador jugador = new Jugador();

            jugador.agregarMaterialAlInventario("piedra", new Piedra());
            jugador.agregarMaterialAlInventario("piedra", new Piedra());
            jugador.agregarMaterialAlInventario("piedra", new Piedra());
            jugador.agregarMaterialAlInventario("madera", new Madera());
            jugador.agregarMaterialAlInventario("madera", new Madera());

            jugador.aniadirMaterialEnPosicion(0,0, "piedra");
            jugador.aniadirMaterialEnPosicion(0,1,"piedra");
            jugador.aniadirMaterialEnPosicion(1,0, "piedra");
            jugador.aniadirMaterialEnPosicion(1,1, "madera");
            jugador.aniadirMaterialEnPosicion(1,2, "madera");

            jugador.fabricarUnaHerramienta();

        }catch(Exception e){
            fail("No pudo construirse la herramienta solicitada.");
        }
    }



    @Test
    public void test03ConstruyoUnHachaDeMetalSafiscatoriamente(){
        try {

            Jugador jugador = new Jugador();

            jugador.agregarMaterialAlInventario("metal", new Metal());
            jugador.agregarMaterialAlInventario("metal", new Metal());
            jugador.agregarMaterialAlInventario("metal", new Metal());
            jugador.agregarMaterialAlInventario("madera", new Madera());
            jugador.agregarMaterialAlInventario("madera", new Madera());

            jugador.aniadirMaterialEnPosicion(0,0, "metal");
            jugador.aniadirMaterialEnPosicion(0,1, "metal");
            jugador.aniadirMaterialEnPosicion(1,0, "metal");
            jugador.aniadirMaterialEnPosicion(1,1, "madera");
            jugador.aniadirMaterialEnPosicion(1,2, "madera");

            jugador.fabricarUnaHerramienta();

        }catch(Exception e){
            fail("No pudo construirse la herramienta solicitada.");
        }
    }

    @Test
    public void test04ConstruyoUnPicoDeMaderaSafiscatoriamente(){
        try {

            Jugador jugador = new Jugador();

            jugador.agregarMaterialAlInventario("madera", new Madera());
            jugador.agregarMaterialAlInventario("madera", new Madera());
            jugador.agregarMaterialAlInventario("madera", new Madera());
            jugador.agregarMaterialAlInventario("madera", new Madera());
            jugador.agregarMaterialAlInventario("madera", new Madera());

            jugador.aniadirMaterialEnPosicion(0,0, "madera");
            jugador.aniadirMaterialEnPosicion(1,0, "madera");
            jugador.aniadirMaterialEnPosicion(2,0, "madera");
            jugador.aniadirMaterialEnPosicion(1,1, "madera");
            jugador.aniadirMaterialEnPosicion(1,2, "madera");

            jugador.fabricarUnaHerramienta();

        }catch(Exception e){
            fail("No pudo construirse la herramienta solicitada.");
        }
    }

    @Test
    public void test05ConstruyoUnPicoDePiedraSafiscatoriamente(){
        try {

            Jugador jugador = new Jugador();

            jugador.agregarMaterialAlInventario("piedra", new Piedra());
            jugador.agregarMaterialAlInventario("piedra", new Piedra());
            jugador.agregarMaterialAlInventario("piedra", new Piedra());
            jugador.agregarMaterialAlInventario("madera", new Madera());
            jugador.agregarMaterialAlInventario("madera", new Madera());


            jugador.aniadirMaterialEnPosicion(0,0, "piedra");
            jugador.aniadirMaterialEnPosicion(1,0, "piedra");
            jugador.aniadirMaterialEnPosicion(2,0, "piedra");
            jugador.aniadirMaterialEnPosicion(1,1, "madera");
            jugador.aniadirMaterialEnPosicion(1,2, "madera");

            jugador.fabricarUnaHerramienta();

        }catch(Exception e){
            fail("No pudo construirse la herramienta solicitada.");
        }
    }

    @Test
    public void test06ConstruyoUnPicoDeMetalSafiscatoriamente(){
        try {

            Jugador jugador = new Jugador();

            jugador.agregarMaterialAlInventario("metal", new Metal());
            jugador.agregarMaterialAlInventario("metal", new Metal());
            jugador.agregarMaterialAlInventario("metal", new Metal());
            jugador.agregarMaterialAlInventario("madera", new Madera());
            jugador.agregarMaterialAlInventario("madera", new Madera());

            jugador.aniadirMaterialEnPosicion(0,0, "metal");
            jugador.aniadirMaterialEnPosicion(1,0, "metal");
            jugador.aniadirMaterialEnPosicion(2,0, "metal");
            jugador.aniadirMaterialEnPosicion(1,1, "madera");
            jugador.aniadirMaterialEnPosicion(1,2, "madera");

            jugador.fabricarUnaHerramienta();

        }catch(Exception e){
            fail("No pudo construirse la herramienta solicitada.");
        }
    }

    @Test
    public void test07ConstruyoUnPicoFinoSafiscatoriamente(){
        try {

            Jugador jugador = new Jugador();

            jugador.agregarMaterialAlInventario("metal", new Metal());
            jugador.agregarMaterialAlInventario("metal", new Metal());
            jugador.agregarMaterialAlInventario("metal", new Metal());
            jugador.agregarMaterialAlInventario("piedra", new Piedra());
            jugador.agregarMaterialAlInventario("madera", new Madera());
            jugador.agregarMaterialAlInventario("madera", new Madera());

            jugador.aniadirMaterialEnPosicion(0,0, "metal");
            jugador.aniadirMaterialEnPosicion(1,0, "metal");
            jugador.aniadirMaterialEnPosicion(2,0, "metal");
            jugador.aniadirMaterialEnPosicion(0,1, "piedra");
            jugador.aniadirMaterialEnPosicion(1,1, "madera");
            jugador.aniadirMaterialEnPosicion(1,2, "madera");

            jugador.fabricarUnaHerramienta();

        }catch(Exception e){
           fail("No pudo construirse la herramienta solicitada.");
        }
    }

    @Test(expected = ImposibleCrearHerramientaError.class)
    public void test08NoPuedoConstruirUnHachaDeMaderaSinLosMaterialesNecesarios(){
        Jugador jugador = new Jugador();

        jugador.agregarMaterialAlInventario("metal", new Metal());
        jugador.agregarMaterialAlInventario("piedra", new Piedra());
        jugador.agregarMaterialAlInventario("metal", new Metal());
        jugador.agregarMaterialAlInventario("madera", new Madera());
        jugador.agregarMaterialAlInventario("madera", new Madera());


        jugador.aniadirMaterialEnPosicion(0,0, "metal");
        jugador.aniadirMaterialEnPosicion(1,0, "piedra");
        jugador.aniadirMaterialEnPosicion(2,0, "metal");
        jugador.aniadirMaterialEnPosicion(1,1, "madera");
        jugador.aniadirMaterialEnPosicion(1,2, "madera");

        jugador.fabricarUnaHerramienta();


    }

    @Test(expected = ImposibleCrearHerramientaError.class)
    public void test09NoPuedoConstruirUnHachaDePiedraSinLosMaterialesNecesarios(){
        Jugador jugador = new Jugador();

        jugador.agregarMaterialAlInventario("metal", new Metal());
        jugador.agregarMaterialAlInventario("metal", new Metal());


        jugador.aniadirMaterialEnPosicion(0,0, "metal");
        jugador.aniadirMaterialEnPosicion(1,0, "metal");

        jugador.fabricarUnaHerramienta();
    }

    @Test(expected = ImposibleCrearHerramientaError.class)
    public void test10NoPuedoConstruirUnHachaDeMetalSinLosMaterialesNecesarios(){

        Jugador jugador = new Jugador();
        jugador.fabricarUnaHerramienta();
    }

    @Test(expected = ImposibleCrearHerramientaError.class)
    public void test11NoPuedoConstruirUnPicoDeMaderaSinLosMaterialesNecesarios(){
        Jugador jugador = new Jugador();

        jugador.agregarMaterialAlInventario("madera", new Madera());
        jugador.agregarMaterialAlInventario("madera", new Madera());

        jugador.aniadirMaterialEnPosicion(1,1, "madera");
        jugador.aniadirMaterialEnPosicion(1,2, "madera");

        jugador.fabricarUnaHerramienta();
    }

    @Test(expected = ImposibleCrearHerramientaError.class)
    public void test12NoPuedoConstruirUnPicoDePiedraSinLosMaterialesNecesarios(){
        Jugador jugador = new Jugador();

        jugador.agregarMaterialAlInventario("metal", new Metal());
        jugador.agregarMaterialAlInventario("piedra", new Piedra());
        jugador.agregarMaterialAlInventario("metal", new Metal());
        jugador.agregarMaterialAlInventario("madera", new Madera());
        jugador.agregarMaterialAlInventario("piedra", new Piedra());


        jugador.aniadirMaterialEnPosicion(0,0, "metal");
        jugador.aniadirMaterialEnPosicion(1,0, "piedra");
        jugador.aniadirMaterialEnPosicion(2,0, "metal");
        jugador.aniadirMaterialEnPosicion(1,1, "madera");
        jugador.aniadirMaterialEnPosicion(1,2, "piedra");

        jugador.fabricarUnaHerramienta();
    }

    @Test(expected = ImposibleCrearHerramientaError.class)
    public void test13NoPuedoConstruirUnPicoDeMetalSinLosMaterialesNecesarios(){
        Jugador jugador = new Jugador();

        jugador.agregarMaterialAlInventario("metal", new Metal());
        jugador.agregarMaterialAlInventario("madera", new Madera());

        jugador.aniadirMaterialEnPosicion(0,0, "metal");
        jugador.aniadirMaterialEnPosicion(1,2, "madera");

        jugador.fabricarUnaHerramienta();
    }

    @Test(expected = ImposibleCrearHerramientaError.class)
    public void test14NoPuedoConstruirUnPicoFinoSinLosMaterialesNecesarios(){
        Jugador jugador = new Jugador();
        jugador.fabricarUnaHerramienta();
    }
}
