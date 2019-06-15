package algocraft.vidaDeObjetos;

import algocraft.jugador.Jugador;
import algocraft.herramientas.Herramienta;
import algocraft.materiales.Material;

public class EstrategiaDeGolpeConHerramienta extends EstrategiaDeGolpe {

    public EstrategiaDeGolpeConHerramienta(Herramienta unaHerramienta) {
        herramientaActual = unaHerramienta;
    }


    public void golpear(Material unMaterial){
        herramientaActual.golpear(unMaterial);
    }

    public void desequiparHerramienta(Jugador jugador){
        jugador.agregarHerramientaAlInventario(herramientaActual);
        herramientaActual = null;
        jugador.cambiarEstrategia(new EstrategiaDeGolpeSinHerramienta());
    }

    public void equiparHerramienta(Jugador jugador, Herramienta unaHerramienta){
        herramientaActual= unaHerramienta;
    }

}
