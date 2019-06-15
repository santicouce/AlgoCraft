package Algocraft;

public class DesgastePorFactor extends Desgaste{
    private  double factor;
    public DesgastePorFactor(double unFactor){
        this.factor = unFactor;
    }
    @Override
    public double desgastarDada(double durabilidad, int fuerza)  {
        return (durabilidad - (fuerza*factor));
    }
}
