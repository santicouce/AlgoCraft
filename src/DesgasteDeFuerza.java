package Objetos;

public class DesgasteDeFuerza extends Desgaste{
    @Override
    public int desgastarDada(int durabilidad, int fuerza) {
        return (durabilidad - fuerza);
    }
}
