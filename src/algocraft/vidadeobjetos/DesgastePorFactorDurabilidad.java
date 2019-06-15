package algocraft.vidadeobjetos;

public class DesgastePorFactorDurabilidad extends Desgaste {
    private  double factor;
    public DesgastePorFactorDurabilidad(double unFactor){
        this.factor = unFactor;
    }
    @Override
    public double desgastarDada(double durabilidad, int fuerza)  {
        return (durabilidad - (durabilidad *factor));
    }
}
