package algocraft.vidadeobjetos;

import algocraft.errores.HerramientaRotaError;

public class DesgasteUsos extends Desgaste {
    private int cantidadUsos=0;
    @Override
    public double desgastarDada(double durabilidad, int fuerza) {
        cantidadUsos++;
        if (cantidadUsos>=10){
            return 0;
        }
        return durabilidad;
    }
}
