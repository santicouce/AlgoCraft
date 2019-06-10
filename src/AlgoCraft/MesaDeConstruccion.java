package AlgoCraft;

public class MesaDeConstruccion {
    private Casillero tablero[][];

    public MesaDeConstruccion() {
        //Creo tablero de 3x3
        this.tablero = new Casillero[3][3];
        this.inicializarTablero();
    }
    private void inicializarTablero(){
        for(int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                tablero[i][j]= new Casillero();
            }
        }
    }

    public void aniadirElementoEnPosicion(Colocable colocable, int columna, int fila){
        tablero[columna][fila].aniadirElemento(colocable);
    }
}
