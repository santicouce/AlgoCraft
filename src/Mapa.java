public class Mapa {

    private Casillero tablero[][];

    public Mapa() {

        //Creo tablero de 10x10
        this.tablero = new Casillero[10][10];
    }


    public boolean esUnMapa() {
        return true;
    }

    public Casillero iterarTodoElMapa{
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++) {
                return this.tablero[i][j];
            }
        }
    }

}
