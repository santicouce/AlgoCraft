package algocraft.materiales;

import algocraft.construcciondeherramientas.FabricaDeHacha;
import algocraft.construcciondeherramientas.FabricaDePico;
import algocraft.herramientas.Hacha;
import algocraft.jugador.Inventario;
import algocraft.vidadeobjetos.AguanteHerramienta;
import algocraft.vidadeobjetos.FortalezaHerramienta;
import algocraft.herramientas.PicoFino;
import algocraft.vidadeobjetos.FortalezaPico;

public class Madera extends MaterialDeConstruccion{

    public Madera(){

        this.durabilidad = 10;
        id = "1";
    }

    @Override
    public void golpeadoCon(FortalezaHerramienta fortalezaHerramienta) {
        fortalezaHerramienta.golpear(this);
    }

    @Override
    public void impactadoCon(PicoFino picoFino) {
        //UN PICO FINO NO SE DESGASTA AL IMPACTAR CON MADERA
    }
    @Override
    public void inicializar(FortalezaHerramienta fuerzaHerramienta){
        fuerzaHerramienta.inicializate(this);
    }
    @Override
    public void inicializar(AguanteHerramienta durabilidadHerramienta){durabilidadHerramienta.inicializate(this);}

    @Override
    public void daniarCon(Metal unMetal, FortalezaPico fortalezaPico) {
        //UN PICO DE MADERA NO PUEDE DANIAR METAL
    }
    public void construirHacha(String identificadorDelTablero, Inventario inventarioDelJugador) {
        FabricaDeHacha fabricaDeHacha = new FabricaDeHacha();
        fabricaDeHacha.construir(this, identificadorDelTablero, inventarioDelJugador);
    }
    @Override
    public void construirPico(String identificadorDelTablero, Inventario inventarioDelJugador) {
        FabricaDePico fabricaDePico = new FabricaDePico();
        fabricaDePico.construir(this, identificadorDelTablero, inventarioDelJugador);
    }
}