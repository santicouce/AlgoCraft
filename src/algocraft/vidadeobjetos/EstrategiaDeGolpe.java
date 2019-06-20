package algocraft.vidadeobjetos;

import algocraft.jugador.Jugador;
import algocraft.herramientas.Herramienta;
import algocraft.materiales.Material;

public abstract class EstrategiaDeGolpe {

    protected Herramienta herramientaActual;
    protected Jugador jugador;
    protected String herramienta;

    public abstract void  golpear(Material unMaterial);
    public abstract void  desequiparHerramienta(Jugador jugador);
    public abstract void  equiparHerramienta(Jugador jugador, Herramienta unaHerramienta);
    public abstract String herramienta();
    }
