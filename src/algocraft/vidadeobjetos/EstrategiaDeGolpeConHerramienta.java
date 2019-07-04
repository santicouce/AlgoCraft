package algocraft.vidadeobjetos;

import algocraft.jugador.Jugador;
import algocraft.herramientas.Herramienta;
import algocraft.materiales.Material;

public class EstrategiaDeGolpeConHerramienta extends EstrategiaDeGolpe {

    public EstrategiaDeGolpeConHerramienta(Herramienta unaHerramienta) {
        herramientaActual = unaHerramienta;
    }


    public void golpear(Material unMaterial){
        herramientaActual.golpear(unMaterial);
        herramientaActual.desequiparseAlRomperse(this);
    }

    public void desequiparHerramienta(Jugador jugador){
        jugador.agregarHerramientaAlInventario(herramientaActual.getNombre(), herramientaActual);
        herramientaActual = null;
        jugador.cambiarEstrategia(new EstrategiaDeGolpeSinHerramienta());
    }

    public void desequiparHerramientaRota() {
        herramientaActual = null;
    }
    public void equiparHerramienta(Jugador jugador, Herramienta unaHerramienta){
        herramientaActual= unaHerramienta;
    }

    @Override
    public String herramienta() {
        try{
            herramientaActual.getNombre();
        }catch (NullPointerException e){
            return "herramienta rota";
        }
        return herramientaActual.getNombre();
    }

}
