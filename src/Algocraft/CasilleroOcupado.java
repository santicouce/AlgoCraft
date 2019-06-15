package Algocraft;

public class CasilleroOcupado implements EstadoCasillero{
    public void validarAgregacion(){
        throw new CasilleroOcupadoError();
    }
}
