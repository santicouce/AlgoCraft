package algocraft.vidaDeObjetos;

import algocraft.materiales.Madera;
import algocraft.materiales.Metal;
import algocraft.materiales.Piedra;

public abstract class AguanteHerramienta {
    double durabilidad;
    Desgaste desgaste;

    public abstract void inicializate(Madera unaMadera);
    public abstract void inicializate(Piedra unaPiedra);
    public abstract void inicializate(Metal unMetal);

    public void desgastate(FortalezaHerramienta fortalezaHerramienta){
        durabilidad = desgaste.desgastarDada(durabilidad, fortalezaHerramienta.fuerza());
    }
    public double durabilidad(){return durabilidad;}
}
