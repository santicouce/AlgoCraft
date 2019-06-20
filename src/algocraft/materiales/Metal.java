package algocraft.materiales;

import algocraft.construcciondeherramientas.FabricaDeHacha;
import algocraft.construcciondeherramientas.FabricaDePico;
import algocraft.jugador.Inventario;
import algocraft.vidadeobjetos.AguanteHerramienta;
import algocraft.vidadeobjetos.FortalezaHerramienta;
import algocraft.herramientas.PicoFino;
import algocraft.vidadeobjetos.FortalezaPico;

public class Metal extends MaterialDeConstruccion{
    public Metal ()
    {
        this.durabilidad =50;
        this.id ="3";
        this.nombre = "metal";
    }

    @Override
    public void golpeadoCon(FortalezaHerramienta fortalezaHerramienta) {
        fortalezaHerramienta.golpear(this);
    }

    @Override
    public void impactadoCon(PicoFino picoFino) {
        //UN PICO FINO NO SE DESGASTA AL IMPAZTAR CON METAL
    }

    @Override
    public void inicializar(FortalezaHerramienta fuerzaHerramienta){
        fuerzaHerramienta.inicializate(this);
    }
    @Override
    public void inicializar(AguanteHerramienta durabilidadHerramienta){
        durabilidadHerramienta.inicializate(this);
    }

    @Override
    public void daniarCon(Metal unMetal, FortalezaPico fortalezaPico) {
        //UN PICO DE METAL NO PUEDE DANIAR METAL
    }
    @Override
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
