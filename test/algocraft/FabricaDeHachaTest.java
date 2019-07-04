package algocraft;
import algocraft.construcciondeherramientas.FabricaDeHacha;
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

public class FabricaDeHachaTest {
    @Test
    public void test01SePuedeCrearUnHachaDeMadera(){
        HashMap<String, List<Herramienta>> inventarioHerramientas = new HashMap<String, List<Herramienta>>();
        inventarioHerramientas.put("hacha de madera", new ArrayList<>());
        try {

            FabricaDeHacha fabrica = new FabricaDeHacha();
            fabrica.construir(new Madera(),"110110010",inventarioHerramientas);
        }catch(Exception e){
            fail("Falla en la fabrica.");
        }
    }
    @Test
    public void test02SePuedeCrearUnHachaDePiedra(){
        HashMap<String, List<Herramienta>> inventarioHerramientas = new HashMap<String, List<Herramienta>>();
        inventarioHerramientas.put("hacha de piedra", new ArrayList<>());
        try {

            FabricaDeHacha fabrica = new FabricaDeHacha();
            fabrica.construir(new Piedra(),"220210010",inventarioHerramientas);
        }catch(Exception e){
            fail("Falla en la fabrica.");
        }
    }
    @Test
    public void test03SePuedeCrearUnHachaDeMetal(){
        HashMap<String, List<Herramienta>> inventarioHerramientas = new HashMap<String, List<Herramienta>>();
        inventarioHerramientas.put("hacha de metal", new ArrayList<>());
        try {

            FabricaDeHacha fabrica = new FabricaDeHacha();
            fabrica.construir(new Metal(),"330310010",inventarioHerramientas);
        }catch(Exception e){
            fail("Falla en la fabrica.");
        }
    }
    @Test(expected = ImposibleCrearHerramientaError.class)
    public void test04NoSePuedeCrearUnHachaDeMaderaConUnaCombinacionIncorrectaDeMateriales(){
        HashMap<String, List<Herramienta>> inventarioHerramientas = new HashMap<String, List<Herramienta>>();
        inventarioHerramientas.put("hacha de madera", new ArrayList<>());

        FabricaDeHacha fabrica = new FabricaDeHacha();
        fabrica.construir(new Madera(),"110210010",inventarioHerramientas);

    }
    @Test(expected = ImposibleCrearHerramientaError.class)
    public void test05NoSePuedeCrearUnHachaDePiedraConUnaCombinacionIncorrectaDeMateriales(){
        HashMap<String, List<Herramienta>> inventarioHerramientas = new HashMap<String, List<Herramienta>>();
        inventarioHerramientas.put("hacha de piedra", new ArrayList<>());

        FabricaDeHacha fabrica = new FabricaDeHacha();
        fabrica.construir(new Piedra(),"220210110",inventarioHerramientas);

    }
    @Test(expected = ImposibleCrearHerramientaError.class)
    public void test06NoSePuedeCrearUnHachaDeMetalConUnaCombinacionIncorrectaDeMateriales(){
        HashMap<String, List<Herramienta>> inventarioHerramientas = new HashMap<String, List<Herramienta>>();
        inventarioHerramientas.put("hacha de metal", new ArrayList<>());

        FabricaDeHacha fabrica = new FabricaDeHacha();
        fabrica.construir(new Metal(),"310310010",inventarioHerramientas);

    }

}
