package algocraft;

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
            inventario.aniadirMaterial(new Piedra());
            inventario.aniadirMaterial(new Madera());
            inventario.aniadirMaterial(new Diamante());
        }catch (Exception e){
            fail("No funciono aniadir y eliminar materiales al iventario");
        }

    }

    }
