package algocraft.construcciondeherramientas;
import algocraft.errores.PosicionInvalidaError;
import algocraft.jugador.Inventario;
import algocraft.mapadejuego.Casillero;
import algocraft.mapadejuego.Mapa;
import algocraft.materiales.Material;
import algocraft.materiales.MaterialDeConstruccion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MesaDeConstruccion {

    private static final int CANTIDAD_DE_COLUMNAS = 3;
    private static final int CANTIDAD_DE_FILAS = 3;
    private  Tablero tablero;
    private Inventario inventarioDelJugador;

    public MesaDeConstruccion(Inventario inventario) {
        this.inventarioDelJugador = inventario;
        tablero= new Tablero();
        tablero.inicializarTablero(CANTIDAD_DE_FILAS,CANTIDAD_DE_COLUMNAS);
    }

    public void aniadirMaterialEnPosicion(int columna, int fila, String madera){
        tablero.validarPosicion(columna,fila);
        inventarioDelJugador.validarStockDe();
        Casillero casilleroEnCuestion = tablero[columna][fila];
        Material material = inventarioDelJugador.extraerPiedra();
        casilleroEnCuestion.aniadirElemento(material);
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
