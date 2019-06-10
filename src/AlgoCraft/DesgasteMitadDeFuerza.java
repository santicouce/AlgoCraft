package AlgoCraft;

public class DesgasteMitadDeFuerza extends Desgaste {
    @Override
    public double desgastarDada(double durabilidad, int fuerza)  {
        return (durabilidad - (fuerza/2));
    }
}
