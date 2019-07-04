package algocraft;

import algocraft.errores.GolpeInvalidoError;
import algocraft.errores.MovimientoInvalidoError;
import algocraft.errores.PosicionInvalidaError;
import algocraft.jugador.Jugador;
import algocraft.materiales.Piedra;
import algocraft.movimientodeljugador.*;
import algocraft.materiales.Madera;
import algocraft.mapadejuego.Mapa;
import org.junit.Test;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;

public class JugadorTest {

    private Jugador jugador = new Jugador();
    Mapa mapa = new Mapa(20,20);

    @Test
    public void test01JugadorRecienCreadoDeberiaCuentaSoloConUnHachaDeMadera(){
        Madera madera = new Madera();
        int durabilidadInicialMadera = madera.durabilidad();
        jugador.golpear(madera);
        assertEquals(durabilidadInicialMadera - 2, madera.durabilidad());
    }
    @Test (expected = MovimientoInvalidoError.class)
    public void test02UnJugadorSeIntentaMoverALaIzquieraAUnCasilleroOcupadoPorUnMaterialYSeDeberiaLanzarMovimientoInvalidoError(){
        mapa.aniadirElementoEnPosicion(new Madera(),4,5);
        jugador.moverA(new DireccionIzquierda(mapa));
    }

    @Test
    public void test03UnJugadorIntentaMoverseALaIzquierdaAUnCasilleroVacioYSuPosicionDeberiaCambiar(){
        mapa.aniadirElementoEnPosicion(jugador,5,5);
        jugador.moverA(new DireccionIzquierda(mapa));
    }

    @Test(expected = PosicionInvalidaError.class)
    public void test04UnJugadorIntentaMoverseALaIzquierdaEstandoEnElBordeIzquierdoDelMapaYSeDeberiaLanzarMovimientoInvalidoError(){
        mapa.aniadirElementoEnPosicion(jugador,5,5);
        for (int i=0;i<6;i++){
            jugador.moverA(new DireccionIzquierda(mapa));
        }
    }
    @Test(expected = MovimientoInvalidoError.class)
    public void test05UnJugadorIntentaMoverseALaDerechaAUnCasilleroOcupadoPorUnMaterialYSeDeberiaLanzarMovimientoInvalidoError(){
        mapa.aniadirElementoEnPosicion(new Madera(),6,5);
        jugador.moverA(new DireccionDerecha(mapa));
    }
    @Test
    public void test06UnJugadorIntentaMoverseALaDerechaEstandoEnElBordeDerechoDelMapaYSeDeberiaAgrandarElMapa(){
        try {
            mapa.aniadirJugadorAlMapa(jugador, 5, 5);
            jugador.moverA(new DireccionDerecha(mapa));
        } catch (Exception e){
            fail ("No pudo moverse el jugador.");
        }
    }
    @Test
    public void test07UnJugadoIntentaMoverseALaDerechaHaciaUnCasilleroVacioYSuPosicionDeberiaCambiar(){
        mapa.aniadirJugadorAlMapa(jugador,5,5);
        jugador.moverA(new DireccionDerecha(mapa));
    }
    @Test(expected = MovimientoInvalidoError.class)
    public void test08UnJugadorIntentaMoverseArribaAUnCasillerOcupadoYSeDeberiaLanzarMovimientoInvalidoError(){
        mapa.aniadirElementoEnPosicion(new Madera(),5 ,4);
        jugador.moverA(new DireccionArriba(mapa));
    }
    @Test(expected = PosicionInvalidaError.class)
    public void test09UnJugadorIntentaMoverseArribaEstandoEnElBordeSuperiorDelMapaYSeDeberiaLanzarMovimientoInvalidoError(){
        for (int i=0;i<6;i++) {
            jugador.moverA(new DireccionArriba(mapa));
        }
    }
    @Test
    public void test10UnJugadorIntentaMoverseArribaAUnCasilleroLibreYSuPosicionDeberiaCambiar(){
        mapa.aniadirJugadorAlMapa(jugador,5,5);
        jugador.moverA(new DireccionArriba(mapa));
    }
    @Test(expected = MovimientoInvalidoError.class)
    public void test11UnJugadorIntentaMoverseAbajoAUnCasilleroOcupadoYSeDeberiaLanzarMovimientoInvalidoError(){
        mapa.aniadirElementoEnPosicion(new Madera(),5 ,6);
        jugador.moverA(new DireccionAbajo(mapa));
    }
    @Test
    public void test12UnJugadorIntentaMoverseAbajoEnElBordeInferiorDelMapaYDeberiaPoderse(){
        try {
            mapa.aniadirJugadorAlMapa(jugador, 5, 5);
            jugador.moverA(new DireccionAbajo(mapa));
        }catch (Exception e){
            fail ("No pude moverse satisfactoriamente.");
        }
    }
    @Test
    public void test13UnJugadorIntentaMoverseAbajoAUnCasilleroVacioYSuPosicionDeberiaCambiar(){
        mapa.aniadirJugadorAlMapa(jugador, 5,5);
        jugador.moverA(new DireccionAbajo(mapa));
    }

    @Test
    public void test14UnJugadorIntentaGuardarseUnaMaderaYLaCantidadDeMaderasEnSuInventarioDeberiaSerCuatro(){
        jugador.agregarMaterialAlInventario("madera", new Madera());
        assertEquals(4, jugador.cantidadDeMaterial("madera"));
    }

    @Test
    public void test15UnJugadorGolpeaUnaMaderaYAlRomperseLaAgregaAlInventario(){
        Madera unaMadera = new Madera();
        for (int i=0; i<3; i++){ jugador.extraerMaterialDelInventario("madera");}
        for (int i=0; i<5; i++){ jugador.golpear(unaMadera);}
        assertEquals(unaMadera,jugador.extraerMaterialDelInventario(unaMadera.darNombre()));
    }

    @Test
    public void test16UnJugadorUsaUnHacha50VecesSeRompeYDesaparece(){
        Jugador jugador = new Jugador();

        for (int i=0; i<50; i++){
            jugador.golpear(new Madera());
        }

        assertEquals(0, jugador.cantidadDeHerramienta("hacha de madera"));
    }

    @Test(expected = GolpeInvalidoError.class)
    public void test17UnJugadorUsaUnHacha50VecesSeRompeYLaEstrategiaActualDeberiaCambiarAEstrategiaSinHerramienta() {
        Jugador jugador = new Jugador();
        Madera unaMadera = new Madera();

        for (int i=0; i<50; i++){
            jugador.golpear(unaMadera);
        }
        jugador.golpear(new Piedra());
    }

    }
