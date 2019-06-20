package algocraft.interfazgrafica.vista;

import javafx.scene.image.ImageView;

public class JugadorVista {
    ContenedorJuego contenedor;
    ImageView imagenJugador;
    public JugadorVista(ContenedorJuego contenedor, ImageView imagen){
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
}
