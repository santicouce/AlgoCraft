package algocraft.construcciondeherramientas;
import algocraft.errores.PosicionInvalidaError;
import algocraft.jugador.Inventario;
import algocraft.mapadejuego.Casillero;
import algocraft.materiales.Material;
import algocraft.materiales.MaterialDeConstruccion;

public class MesaDeConstruccion {

    private static final int CANTIDAD_DE_COLUMNAS = 3;
    private static final int CANTIDAD_DE_FILAS = 3;
    private Casillero tablero[][];
    private Inventario inventarioDelJugador;

    public MesaDeConstruccion(Inventario inventario) {
        this.inventarioDelJugador = inventario;
        this.tablero = new Casillero[CANTIDAD_DE_COLUMNAS][CANTIDAD_DE_FILAS];
        this.inicializarTablero();
    }

    private void inicializarTablero() {
        for (int i = 0; i < CANTIDAD_DE_FILAS; i++) {
            for (int j = 0; j < CANTIDAD_DE_COLUMNAS; j++) {
                tablero[i][j] = new Casillero();
            }
        }
    }
    public void aniadirPiedraEnPosicion(int columna, int fila){
        validarPosicion(columna,fila);
        inventarioDelJugador.validarStockDePiedra();
        Casillero casilleroEnCuestion = tablero[columna][fila];
        Material material = inventarioDelJugador.extraerPiedra();
        casilleroEnCuestion.aniadirElemento(material);
    }
    public void aniadirMaderaEnPosicion(int columna, int fila){
        validarPosicion(columna,fila);
        inventarioDelJugador.validarStockDeMadera();
        Casillero casilleroEnCuestion = tablero[columna][fila];
        Material material = inventarioDelJugador.extraerMadera();
        casilleroEnCuestion.aniadirElemento(material);
    }
    public void aniadirMetalEnPosicion(int columna, int fila){
        validarPosicion(columna,fila);
        inventarioDelJugador.validarStockDeMetal();
        Casillero casilleroEnCuestion = tablero[columna][fila];
        Material material = inventarioDelJugador.extraerMetal();
        casilleroEnCuestion.aniadirElemento(material);
    }
    public void validarPosicion(int columna, int fila) {
        this.validarColumna(columna);
        this.validarFila(fila);
    }

    private void validarColumna(int columna) {
        if (columna < 0 || columna > (CANTIDAD_DE_COLUMNAS - 1)) {
            throw new PosicionInvalidaError();
        }
    }

    private void validarFila(int fila) {
        if (fila < 0 || fila > (CANTIDAD_DE_COLUMNAS - 1)) {
            throw new PosicionInvalidaError();
        }

    }

    public String identificadorDelTablero() {
        String identificador = new String();
        String identificadorCasilleroActual = new String();

        for (int i = 0; i < CANTIDAD_DE_FILAS; i++) {
            for (int j = 0; j < CANTIDAD_DE_COLUMNAS; j++) {
                Casillero casillero = tablero[j][i];
                try{
                    identificadorCasilleroActual = casillero.getId();
                }catch(Exception NullPointerException){
                    identificadorCasilleroActual = "0";
                }
                identificador = identificador.concat(identificadorCasilleroActual);
            }
        }
        return identificador;
    }
    public boolean crearUnHacha(MaterialDeConstruccion unMaterial) {
        String identificadorDelTablero = identificadorDelTablero();
        unMaterial.construirHacha(identificadorDelTablero,inventarioDelJugador);
        return true;
    }
    public boolean crearUnPico(MaterialDeConstruccion unMaterial) {
        String identificadorDelTablero = identificadorDelTablero();
        unMaterial.construirPico(identificadorDelTablero,inventarioDelJugador);
        return true;
    }

    public boolean crearUnPicoFino() {
        String identificadorDelTablero = identificadorDelTablero();
        construirPicoFino(identificadorDelTablero);
        return true;
    }
    private boolean construirPicoFino(String identificadorDelTablero){
        FabricaDePicoFino fabricaDePicoFino = new FabricaDePicoFino();
        fabricaDePicoFino.construir(identificadorDelTablero, inventarioDelJugador);
        return true;
    }
}
