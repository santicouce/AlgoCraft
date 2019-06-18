package algocraft.mapadejuego;

import algocraft.Observable;
import algocraft.errores.CasilleroOcupadoError;

public class CasilleroOcupado implements EstadoCasillero {
    public void validarAgregacion(){
        throw new CasilleroOcupadoError();
    }
    public String darNombreDe(Observable observable){
        return observable.darNombre();
    }
}
