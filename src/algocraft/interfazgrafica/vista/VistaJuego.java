package algocraft.interfazgrafica.vista;

public class VistaJuego {
    ContenedorJuego contenedorJuego;
    public VistaJuego (ContenedorJuego contenedorJuego){
        this.contenedorJuego = contenedorJuego;
    }
    public void actualizar(){
        contenedorJuego.inicializarBotonera();
        contenedorJuego.inicializarCentro();
    }
}
