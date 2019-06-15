package algocraft;

public class AguantePico extends AguanteHerramienta{
    public void inicializate(Madera unaMadera){
        durabilidad = 100;
        desgaste = new DesgastePorFactorFuerza(1);
    }
    public void inicializate(Piedra unaPiedra){
        durabilidad = 200;
        desgaste = new DesgastePorFactorFuerza(0.666667);
    }
    public void inicializate(Metal unaMetal){
        durabilidad = 400;
        desgaste = new DesgasteUsos();
    }
}
