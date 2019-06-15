package algocraft.vidaDeObjetos;

import algocraft.jugador.Jugador;
import algocraft.herramientas.Herramienta;
import algocraft.materiales.Material;

public abstract class EstrategiaDeGolpe {

    protected Herramienta herramientaActual;
    protected Jugador jugador;

    public abstract void  golpear(Material unMaterial);
    public abstract void  desequiparHerramienta(Jugador jugador);
    public abstract void  equiparHerramienta(Jugador jugador, Herramienta unaHerramienta);
    }
