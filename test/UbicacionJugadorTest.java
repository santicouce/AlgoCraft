import AlgoCraft.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class UbicacionJugadorTest {
    Mapa mapa = new Mapa();
    @Test (expected = MovimientoInvalidoError.class)
    public void test01IntentarMoverALaIzquierdaUbicacionJugadorEstandoEnLaPrimeraColumnaDelMapaDeberiaLanzarUnPosicionInvalidaError(){
        UbicacionJugador ubicacionJugador = new UbicacionJugador(mapa,0,0);
        ubicacionJugador.moverALaIzquierda(new Jugador());
    }
    @Test(expected = MovimientoInvalidoError.class)
    public void test02IntentarMoverALaIzquierdaUbicacionJugadorAUnCasilleroOcupadoDeberiaLanzarCasilleroOcupadoError(){
        MaderaProxy maderaProxy = new MaderaProxy();
        mapa.aniadirElementoEnPosicion(maderaProxy,0,1);
        UbicacionJugador ubicacionJugador = new UbicacionJugador(mapa,1,1);
        ubicacionJugador.moverALaIzquierda(new Jugador());
    }
}
