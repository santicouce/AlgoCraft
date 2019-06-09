package Objetos;

public class DesgasteUsos extends Desgaste {
    @Override
    public int desgastarDada(int durabilidad, int fuerza) {
        return durabilidad;
    }
}
