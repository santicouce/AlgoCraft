package AlgoCraft;

public class DesgasteDeFuerza extends Desgaste{
    @Override
    public double desgastarDada(double durabilidad, int fuerza)  {
        return (durabilidad - fuerza);
    }
}
