package Objetos;


public class DesgasteEspecial extends Desgaste {
    @Override
    public int desgastarDada(int durabilidad, int fuerza) {
        return (int) (durabilidad - fuerza/1.5);
    }
}
