package algocraft.construcciondeherramientas;
import algocraft.errores.ImposibleCrearHerramientaError;
import algocraft.errores.PosicionInvalidaError;
import algocraft.herramientas.Herramienta;
import algocraft.mapadejuego.Casillero;
import algocraft.materiales.*;

import java.util.HashMap;
import java.util.List;

public class MesaDeConstruccion {

    private int CANTIDAD_DE_COLUMNAS=3;
    private int CANTIDAD_DE_FILAS = 3;
    private Casillero tablero[][];
    HashMap<String, Integer> contruccionesSegunIdentificador = new HashMap<String, Integer>();

    public MesaDeConstruccion() {
        this.tablero = new Casillero[CANTIDAD_DE_COLUMNAS][CANTIDAD_DE_FILAS];
        this.inicializarTablero();
        contruccionesSegunIdentificador.put("110110010",1);
        contruccionesSegunIdentificador.put("220210010",2);
        contruccionesSegunIdentificador.put("330310010",3);
        contruccionesSegunIdentificador.put("111010010",4);
        contruccionesSegunIdentificador.put("222010010",5);
        contruccionesSegunIdentificador.put("333010010",6);
        contruccionesSegunIdentificador.put("333210010",7);
    }

    private void inicializarTablero() {
        for (int i = 0; i < CANTIDAD_DE_FILAS; i++) {
            for (int j = 0; j < CANTIDAD_DE_COLUMNAS; j++) {
                tablero[j][i] = new Casillero();
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
    private void construirPicoFino(String identificadorDelTablero, HashMap<String, List<Herramienta>> InventarioHerramientas) {
        FabricaDePicoFino fabricaDePicoFino = new FabricaDePicoFino();
        fabricaDePicoFino.construir(identificadorDelTablero, InventarioHerramientas);
    }
    public void construir(HashMap<String, List<Herramienta>> InventarioHerramientas,HashMap<String, List<Material>> InventarioMateriales){
        String identificadorDelTablero = identificadorDelTablero();
        int itemAConstruir;
        try {
            itemAConstruir = contruccionesSegunIdentificador.get(identificadorDelTablero);
        }catch(Exception e){
            devolverMaterialesAlInventario(identificadorDelTablero,InventarioMateriales);
            throw new ImposibleCrearHerramientaError();
        }
        switch(itemAConstruir){
            case 1:
                crearUnHacha(new Madera(),InventarioHerramientas);
                for (int i=1; i==5;i++){ InventarioMateriales.get("madera").remove(0); }
                break;
            case 2:
                crearUnHacha(new Piedra(),InventarioHerramientas);
                for (int i=1; i==3;i++){ InventarioMateriales.get("piedra").remove(0); }
                for (int i=1; i==2;i++){ InventarioMateriales.get("madera").remove(0); }
                break;
            case 3:
                crearUnHacha(new Metal(),InventarioHerramientas);
                for (int i=1; i==3;i++){ InventarioMateriales.get("metal").remove(0); }
                for (int i=1; i==2;i++){ InventarioMateriales.get("madera").remove(0); }
                break;
            case 4:
                crearUnPico(new Madera(),InventarioHerramientas);
                for (int i=1; i==5;i++){ InventarioMateriales.get("madera").remove(0); }
                break;
            case 5:
                crearUnPico(new Piedra(),InventarioHerramientas);
                for (int i=1; i==3;i++){ InventarioMateriales.get("piedra").remove(0); }
                for (int i=1; i==2;i++){ InventarioMateriales.get("madera").remove(0); }
                break;
            case 6:
                crearUnPico(new Metal(),InventarioHerramientas);
                for (int i=1; i==3;i++){ InventarioMateriales.get("metal").remove(0); }
                for (int i=1; i==2;i++){ InventarioMateriales.get("madera").remove(0); }
                break;
            case 7:
                crearUnPicoFino(InventarioHerramientas);
                for (int i=1; i==3;i++){ InventarioMateriales.get("metal").remove(0); }
                for (int i=1; i==2;i++){ InventarioMateriales.get("madera").remove(0); }
                InventarioMateriales.get("piedra").remove(0);
                break;
        }
        }

    private void devolverMaterialesAlInventario(String identificadorDelTablero, HashMap<String, List<Material>> inventarioMateriales) {
        for (int i=0;i<identificadorDelTablero.length();i++){
            String identificador = String.valueOf(identificadorDelTablero.charAt(i));
            devolverAlInventario(identificador,inventarioMateriales);
        }
    }

    private void devolverAlInventario(String identificador, HashMap<String, List<Material>> inventarioMateriales) {
        switch (identificador){
            case "1":
                inventarioMateriales.get("madera").add(new Madera());
                break;
            case "2":
                inventarioMateriales.get("piedra").add(new Piedra());
                break;
            case "3":
                inventarioMateriales.get("metal").add(new Metal());
                break;
        }
    }

    public void limpiarMesa(){
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                Casillero casillero=tablero[i][j];
                casillero.eliminarElemento();

            }
        }
    }
}
