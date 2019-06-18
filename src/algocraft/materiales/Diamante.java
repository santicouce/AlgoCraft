package algocraft.materiales;

import algocraft.herramientas.PicoFino;
import algocraft.vidadeobjetos.FortalezaHerramienta;

public class Diamante extends Material {

    public Diamante(){

        this.durabilidad=100;
        id = "4";
    }

    @Override
    public void golpeadoCon(FortalezaHerramienta fortalezaHerramienta) {
        fortalezaHerramienta.golpear(this);
    }

    @Override
    public void impactadoCon(PicoFino picoFino) {
        picoFino.desgastate();
    }
}
