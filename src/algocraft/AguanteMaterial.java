package algocraft;

import algocraft.vidadeobjetos.DesgastePorFactorFuerza;

public abstract class AguanteMaterial {
    double durabilidad;
    DesgastePorFactorFuerza desgaste = new DesgastePorFactorFuerza(1);
}
