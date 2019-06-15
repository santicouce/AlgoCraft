package algocraft;

import algocraft.construcciondeherramientas.MesaDeConstruccion;
import algocraft.materiales.Piedra;
import org.junit.Test;

public class MesaDeConstruccionTest {
    @Test
    public void test01MesaDeConstruccionTieneTamanio3x3(){
        MesaDeConstruccion mesaDeConstruccion = new MesaDeConstruccion();
        mesaDeConstruccion.validarPosicion(0,0);
        mesaDeConstruccion.validarPosicion(0,1);
        mesaDeConstruccion.validarPosicion(0,2);
        mesaDeConstruccion.validarPosicion(1,0);
        mesaDeConstruccion.validarPosicion(1,1);
        mesaDeConstruccion.validarPosicion(1,2);
        mesaDeConstruccion.validarPosicion(2,0);
        mesaDeConstruccion.validarPosicion(2,1);
        mesaDeConstruccion.validarPosicion(2,2);
    }

    @Test
    public void test02PuedoAniadirUnMaterialEnUnaPosicionValida(){
        MesaDeConstruccion mesaDeConstruccion = new MesaDeConstruccion();
        Piedra piedra1 = new Piedra();
        Piedra piedra2 = new Piedra();
        mesaDeConstruccion.aniadirElementoEnPosicion(piedra1,1,2);
        mesaDeConstruccion.aniadirElementoEnPosicion(piedra2,1,1);
        //para chequear que realmente se agrego podria ver que el inventario tengo un material menos
        }

}
