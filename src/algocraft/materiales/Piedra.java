package algocraft.materiales;

import algocraft.construcciondeherramientas.FabricaDeHacha;
import algocraft.construcciondeherramientas.FabricaDePico;
import algocraft.herramientas.Herramienta;
import algocraft.vidadeobjetos.AguanteHerramienta;
import algocraft.vidadeobjetos.FortalezaHerramienta;
import algocraft.herramientas.PicoFino;
import algocraft.vidadeobjetos.FortalezaPico;

import java.util.HashMap;
import java.util.List;

public class Piedra extends MaterialDeConstruccion{

    public Piedra () {
        this.durabilidad = 30;
        this.id = "2";
        this.nombre = "piedra";
    }
    @Override
    public void golpeadoCon(FortalezaHerramienta fortalezaHerramienta) {
        fortalezaHerramienta.golpear(this);
    }

    @Override
    public void impactadoCon(PicoFino picoFino) {
        //UN PICO FINO NO SE DESGASTA AL IMPACTAR CON PIEDRA
    }

    @Override
    public void inicializar(FortalezaHerramienta fuerzaHerramienta){
        fuerzaHerramienta.inicializate(this);
    }
    @Override
    public void inicializar(AguanteHerramienta durabilidadHerramienta){durabilidadHerramienta. inicializate(this);}

    @Override
    public void daniarCon(Metal unMetal, FortalezaPico fortalezaPico) {
        unMetal.daniadoCon(fortalezaPico);
    }
    @Override
    public void construirHacha(String identificadorDelTablero, HashMap<String, List<Herramienta>> inventarioDelJugador) {
        FabricaDeHacha fabricaDeHacha = new FabricaDeHacha();
        fabricaDeHacha.construir(this, identificadorDelTablero, inventarioDelJugador);
    }
    @Override
    public void construirPico(String identificadorDelTablero, HashMap<String, List<Herramienta>> inventarioDelJugador) {
        FabricaDePico fabricaDePico = new FabricaDePico();
        fabricaDePico.construir(this, identificadorDelTablero, inventarioDelJugador);
    }
}
