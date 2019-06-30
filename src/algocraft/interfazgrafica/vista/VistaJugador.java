package algocraft.interfazgrafica.vista;

import javafx.scene.image.ImageView;

public class VistaJugador {
    ContenedorJuego contenedor;
    ImageView imagenJugador;
    public VistaJugador(ContenedorJuego contenedor, ImageView imagen){
        this.contenedor = contenedor;
        imagenJugador = imagen;
    }
    public void actualizate(){
        this.dibujar();
    }
    private void dibujar(){
        contenedor.eliminarImager();
        contenedor.actualizarImgagen();
    }

    public void actualizateDespuesDeGolpear() {
        contenedor.eliminarImager();
        contenedor.actualizarImgagen();
        contenedor.actualizarBotonera();
    }
}
