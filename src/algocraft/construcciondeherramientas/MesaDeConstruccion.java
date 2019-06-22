package algocraft.construcciondeherramientas;
import algocraft.errores.PosicionInvalidaError;
import algocraft.herramientas.Herramienta;
import algocraft.mapadejuego.Casillero;
import algocraft.materiales.Material;
import algocraft.materiales.MaterialDeConstruccion;

import java.util.HashMap;
import java.util.List;

public class MesaDeConstruccion {

    private int CANTIDAD_DE_COLUMNAS=3;
    private int CANTIDAD_DE_FILAS = 3;
    private Casillero tablero[][];

    public MesaDeConstruccion() {
        this.tablero = new Casillero[CANTIDAD_DE_COLUMNAS][CANTIDAD_DE_FILAS];
        this.inicializarTablero();
    }

    private void inicializarTablero() {
        for (int i = 0; i < CANTIDAD_DE_COLUMNAS; i++) {
            for (int j = 0; j < CANTIDAD_DE_FILAS; j++) {
                tablero[i][j] = new Casillero();
            }
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

    public void aniadirElementoEnPosicion(int columna, int fila, Material material) {
        validarPosicion(columna, fila);
        tablero[columna][fila].aniadirElemento(material);
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
        if (fila < 0 || fila > (CANTIDAD_DE_FILAS - 1)) {
            throw new PosicionInvalidaError();
        }

    }
    public void crearUnHacha(MaterialDeConstruccion unMaterial, HashMap<String, List<Herramienta>> InventarioHerramientas) {
        String identificadorDelTablero =  identificadorDelTablero();
        unMaterial.construirHacha(identificadorDelTablero,InventarioHerramientas);
    }
    public void crearUnPico(MaterialDeConstruccion unMaterial, HashMap<String, List<Herramienta>> InventarioHerramientas) {
        String identificadorDelTablero = identificadorDelTablero();
        unMaterial.construirPico(identificadorDelTablero,InventarioHerramientas);
    }

    public void crearUnPicoFino(HashMap<String, List<Herramienta>> InventarioHerramientas) {
        String identificadorDelTablero = identificadorDelTablero();
        construirPicoFino(identificadorDelTablero, InventarioHerramientas);
    }
    private void construirPicoFino(String identificadorDelTablero, HashMap<String, List<Herramienta>> InventarioHerramientas){
        FabricaDePicoFino fabricaDePicoFino = new FabricaDePicoFino();
        fabricaDePicoFino.construir(identificadorDelTablero, InventarioHerramientas);
    }
}
