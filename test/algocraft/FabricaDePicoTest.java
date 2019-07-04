package algocraft;
import algocraft.construcciondeherramientas.FabricaDePico;
import algocraft.errores.ImposibleCrearHerramientaError;
import algocraft.herramientas.Herramienta;
import algocraft.materiales.Madera;

import algocraft.materiales.Metal;
import algocraft.materiales.Piedra;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.fail;

public class FabricaDePicoTest {
    @Test
    public void test01SePuedeCrearUnPicoDeMadera(){
        HashMap<String, List<Herramienta>> inventarioHerramientas = new HashMap<String, List<Herramienta>>();
        inventarioHerramientas.put("pico de madera", new ArrayList<>());
        try {

            FabricaDePico fabrica = new FabricaDePico();
            fabrica.construir(new Madera(),"111010010",inventarioHerramientas);
        }catch(Exception e){
            fail("Falla en la fabrica.");
        }
    }
    @Test
    public void test02SePuedeCrearUnPicoDePiedra(){
        HashMap<String, List<Herramienta>> inventarioHerramientas = new HashMap<String, List<Herramienta>>();
        inventarioHerramientas.put("pico de piedra", new ArrayList<>());
        try {

            FabricaDePico fabrica = new FabricaDePico();
            fabrica.construir(new Piedra(),"222010010",inventarioHerramientas);
        }catch(Exception e){
            fail("Falla en la fabrica.");
        }
    }
    @Test
    public void test03SePuedeCrearUnPicoDeMetal(){
        HashMap<String, List<Herramienta>> inventarioHerramientas = new HashMap<String, List<Herramienta>>();
        inventarioHerramientas.put("pico de metal", new ArrayList<>());
        try {

            FabricaDePico fabrica = new FabricaDePico();
            fabrica.construir(new Metal(),"333010010",inventarioHerramientas);
        }catch(Exception e){
            fail("Falla en la fabrica.");
        }
    }
    @Test(expected = ImposibleCrearHerramientaError.class)
    public void test04NoSePuedeCrearUnPicoDeMaderaConUnaCombinacionIncorrectaDeMateriales(){
        HashMap<String, List<Herramienta>> inventarioHerramientas = new HashMap<String, List<Herramienta>>();
        inventarioHerramientas.put("pico de madera", new ArrayList<>());

        FabricaDePico fabrica = new FabricaDePico();
        fabrica.construir(new Madera(),"110210010",inventarioHerramientas);

    }
    @Test(expected = ImposibleCrearHerramientaError.class)
    public void test05NoSePuedeCrearUnPicoDePiedraConUnaCombinacionIncorrectaDeMateriales(){
        HashMap<String, List<Herramienta>> inventarioHerramientas = new HashMap<String, List<Herramienta>>();
        inventarioHerramientas.put("pico de piedra", new ArrayList<>());

        FabricaDePico fabrica = new FabricaDePico();
        fabrica.construir(new Piedra(),"220210110",inventarioHerramientas);

    }
    @Test(expected = ImposibleCrearHerramientaError.class)
    public void test06NoSePuedeCrearUnPicoDeMetalConUnaCombinacionIncorrectaDeMateriales(){
        HashMap<String, List<Herramienta>> inventarioHerramientas = new HashMap<String, List<Herramienta>>();
        inventarioHerramientas.put("pico de metal", new ArrayList<>());

        FabricaDePico fabrica = new FabricaDePico();
        fabrica.construir(new Metal(),"310310010",inventarioHerramientas);

    }

}