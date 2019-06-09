package AlgoCraft;

public class DesgasteMitadDeFuerza extends Desgaste {
    @Override
    public int desgastarDada(int durabilidad, int fuerza) {
        return (durabilidad - (fuerza/2));
    }
}
