package algocraft;

public class DesgastePorFactorFuerza extends Desgaste{
    private  double factor;
    public DesgastePorFactorFuerza(double unFactor){
        this.factor = unFactor;
    }
    @Override
    public double desgastarDada(double durabilidad, int fuerza)  {
        return (durabilidad - (fuerza*factor));
    }
}
