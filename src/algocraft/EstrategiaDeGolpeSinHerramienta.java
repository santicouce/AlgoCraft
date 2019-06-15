package algocraft;

public class EstrategiaDeGolpeSinHerramienta extends EstrategiaDeGolpe {

    public void golpear(Material unMaterial){
        throw new GolpeInvalidoError();
    }

    public void desequiparHerramienta(Jugador jugador){
        throw new ImposibleDesequiparNingunaHerramientaError();
    }

    public void equiparHerramienta(Jugador jugador, Herramienta unaHerramienta){
        jugador.cambiarEstrategia(new EstrategiaDeGolpeConHerramienta(unaHerramienta));
    }

}
