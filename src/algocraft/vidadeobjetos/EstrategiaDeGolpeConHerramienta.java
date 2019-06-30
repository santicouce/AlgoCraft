package algocraft.vidadeobjetos;

import algocraft.herramientas.HerramientaRota;
import algocraft.jugador.Jugador;
import algocraft.herramientas.Herramienta;
import algocraft.materiales.Material;

public class EstrategiaDeGolpeConHerramienta extends EstrategiaDeGolpe {

    public EstrategiaDeGolpeConHerramienta(Herramienta unaHerramienta) {
        herramientaActual = unaHerramienta;
    }


    public void golpear(Material unMaterial){
        herramientaActual.golpear(unMaterial);
        if (herramientaActual.seRompio()){this.desequiparHerramientaRota();}
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
