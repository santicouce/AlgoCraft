package algocraft.vidadeobjetos;

import algocraft.errores.GolpeInvalidoError;
import algocraft.herramientas.HerramientaRota;
import algocraft.jugador.Jugador;
import algocraft.herramientas.Herramienta;
import algocraft.materiales.Material;

public class EstrategiaDeGolpeConHerramienta extends EstrategiaDeGolpe {

    public EstrategiaDeGolpeConHerramienta(Herramienta unaHerramienta) {
        herramientaActual = unaHerramienta;
    }


    public void golpear(Material unMaterial){
        try {
            herramientaActual.golpear(unMaterial);
        }
        catch (GolpeInvalidoError RuntimeException){
            throw new GolpeInvalidoError();
        }
    }

    public void desequiparHerramienta(Jugador jugador){
        jugador.agregarHerramientaAlInventario(herramientaActual.getNombre(), herramientaActual);
        herramientaActual = null;
        jugador.cambiarEstrategia(new EstrategiaDeGolpeSinHerramienta());
    }

    public void desequiparHerramientaRota(){
        herramientaActual = new HerramientaRota();
    }

    public void equiparHerramienta(Jugador jugador, Herramienta unaHerramienta){
        herramientaActual= unaHerramienta;
    }

    @Override
    public String herramienta() {
        return herramientaActual.getNombre();
    }

}
