package algocraft.mapaDeJuego;

import algocraft.errores.CasilleroOcupadoError;

public class CasilleroOcupado implements EstadoCasillero {
    public void validarAgregacion(){
        throw new CasilleroOcupadoError();
    }
}
