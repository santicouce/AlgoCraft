package algocraft;

public class AguanteHacha extends AguanteHerramienta {
    public void inicializate(Madera unaMadera){
        durabilidad = 100;
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
