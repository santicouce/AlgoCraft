package algocraft.vidadeobjetos;

import algocraft.materiales.Madera;
import algocraft.materiales.Metal;
import algocraft.materiales.Piedra;

public class AguanteHacha extends AguanteHerramienta {
    public void inicializate(Madera unaMadera){
        durabilidad = 10;
        desgaste = new DesgastePorFactorFuerza(1);
    }
    public void inicializate(Piedra unaPiedra){
        durabilidad = 200;
        desgaste = new DesgastePorFactorFuerza(1);
    }
    public void inicializate(Metal unMetal){
        durabilidad = 400;
        desgaste = new DesgastePorFactorFuerza(0.5);
    }
}
