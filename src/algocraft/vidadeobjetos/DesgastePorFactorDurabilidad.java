package algocraft.vidadeobjetos;

public class DesgastePorFactorDurabilidad extends Desgaste {
    private  double factor;
    public DesgastePorFactorDurabilidad(double unFactor){
        this.factor = unFactor;
    }
    @Override
    public double desgastarDada(double durabilidad, int fuerza)  {
        if ((durabilidad - (durabilidad *factor))<1){
            return 0;
        }
        return (durabilidad - (durabilidad *factor));
    }
}
