package algocraft.vidadeobjetos;

import algocraft.jugador.Jugador;
import algocraft.errores.GolpeInvalidoError;
import algocraft.errores.ImposibleDesequiparNingunaHerramientaError;
import algocraft.herramientas.Herramienta;
import algocraft.materiales.Material;

public class EstrategiaDeGolpeSinHerramienta extends EstrategiaDeGolpe {

    public EstrategiaDeGolpeSinHerramienta(){
        herramienta = "desequipado";
    }

    public void golpear(Material unMaterial){
        throw new GolpeInvalidoError();
    }

    public void desequiparHerramienta(Jugador jugador){
        throw new ImposibleDesequiparNingunaHerramientaError();
    }

    public void equiparHerramienta(Jugador jugador, Herramienta unaHerramienta){
        jugador.cambiarEstrategia(new EstrategiaDeGolpeConHerramienta(unaHerramienta));
    }

    @Override
    public String herramienta() {
        return herramienta;
    }

}
