package Objetos;

public class Duracion {
    private int cantidadDeUsos;
    private int cantidadMaximaDeUsos;
    public void Duracion(int cantidadMaximaDeUsos){
        cantidadDeUsos = 0;
        this.cantidadMaximaDeUsos = cantidadMaximaDeUsos;
    }
    private void aumentarCantidadDeUsos(){
        cantidadDeUsos += 1;
    }
    public void usaronA(Herramienta unaHerramienta){
        this.aumentarCantidadDeUsos();
        if(cantidadDeUsos >= cantidadMaximaDeUsos){
            unaHerramienta.rompete();
        }
    }
}
