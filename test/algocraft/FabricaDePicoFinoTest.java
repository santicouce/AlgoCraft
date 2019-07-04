package algocraft;

import algocraft.construcciondeherramientas.FabricaDePico;
import algocraft.construcciondeherramientas.FabricaDePicoFino;
import algocraft.errores.ImposibleCrearHerramientaError;
import algocraft.herramientas.Herramienta;
import algocraft.materiales.Madera;
import algocraft.materiales.Metal;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.fail;

public class FabricaDePicoFinoTest {
    @Test
    public void test01SePuedeCrearUnPicoFino(){
        HashMap<String, List<Herramienta>> inventarioHerramientas = new HashMap<String, List<Herramienta>>();
        inventarioHerramientas.put("pico fino", new ArrayList<>());
        try {

            FabricaDePicoFino fabrica = new FabricaDePicoFino();
            fabrica.construir("333210010",inventarioHerramientas);
        }catch(Exception e){
            fail("Falla en la fabrica.");
        }
    }
    @Test(expected = ImposibleCrearHerramientaError.class)
    public void test02NoSePuedeCrearUnPicoFinoSiLaCombinacionDeMaterialesEsIncorrecta(){
        HashMap<String, List<Herramienta>> inventarioHerramientas = new HashMap<String, List<Herramienta>>();
        inventarioHerramientas.put("pico fino", new ArrayList<>());

        FabricaDePicoFino fabrica = new FabricaDePicoFino();
        fabrica.construir("333211110",inventarioHerramientas);

    }
}
