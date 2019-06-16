package algocraft;

import algocraft.herramientas.Hacha;
import algocraft.herramientas.Pico;
import algocraft.herramientas.PicoFino;
import algocraft.jugador.Inventario;
import algocraft.materiales.Diamante;
import algocraft.materiales.Madera;
import algocraft.materiales.Metal;
import algocraft.materiales.Piedra;
import org.junit.Test;

import static junit.framework.TestCase.fail;

public class InventarioTest {

    @Test
    public void test01InventarioPermiteAniadirHerramientas() {
        try {
            Inventario inventario = new Inventario();
            inventario.aniadirHerramienta(new Hacha(new Piedra()));
            inventario.aniadirHerramienta(new Hacha(new Madera()));
            inventario.aniadirHerramienta(new Pico(new Piedra()));
        }catch (Exception e){
            fail("No funciono aniadir herramientas al iventario");
        }

        }

    @Test
    public void test02InventarioPermiteAniadirMateriales() {
        try {
            Inventario inventario = new Inventario();
            inventario.aniadirMaterial(new Piedra());
            inventario.aniadirMaterial(new Madera());
            inventario.aniadirMaterial(new Diamante());
        }catch (Exception e){
            fail("No funciono aniadir materiales al iventario");
        }

    }

    @Test
    public void test03InventarioPermiteAniadirYEliminarHerramientas() {
        try {
            Inventario inventario = new Inventario();
            inventario.aniadirHerramienta(new Hacha(new Piedra()));
            inventario.extraerHerramienta();
            inventario.aniadirHerramienta(new Hacha((new Madera())));
            inventario.aniadirHerramienta(new PicoFino(new Metal(), new Piedra()));
            inventario.extraerHerramienta();
            inventario.extraerHerramienta();

        }catch (Exception e){
            fail("No funciono aniadir y eliminar herramientas al iventario");
        }

    }

    @Test
    public void test04InventarioPermiteAniadirYEliminarMateriales() {
        try {
            Inventario inventario = new Inventario();
            inventario.aniadirMaterial(new Piedra());
            inventario.extraerMaterial();
            inventario.aniadirMaterial(new Madera());
            inventario.aniadirMaterial(new Diamante());
            inventario.extraerMaterial();
        }catch (Exception e){
            fail("No funciono aniadir y eliminar materiales al iventario");
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void test05NoPiedoExtraerMasMaterialesDeLosQueTengo() {
        Inventario inventario = new Inventario();
        inventario.aniadirMaterial(new Piedra());
        inventario.extraerMaterial();
        inventario.extraerMaterial();
    }

    }
