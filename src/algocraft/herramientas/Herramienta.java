package algocraft.herramientas;

import algocraft.vidadeobjetos.AguanteHerramienta;
import algocraft.vidadeobjetos.EstrategiaDeGolpeConHerramienta;
import algocraft.vidadeobjetos.FortalezaHerramienta;
import algocraft.materiales.*;

public  class Herramienta {

    protected FortalezaHerramienta fortaleza;
    protected AguanteHerramienta aguante;
    protected String nombre;
    protected Material material;

    public void golpear (Material unMaterial){
        try {
            unMaterial.golpeadoCon(fortaleza);
        }catch (NullPointerException nullpointer){
            //No hay objeto a golpear en esa posicion.
        }
        this.desgastate();
    }
    public void desgastate(){
        aguante.desgastate(fortaleza);
    }

    public String getNombre(){
        return (nombre + material.darNombre());
    }

    public  void desequiparseAlRomperse(EstrategiaDeGolpeConHerramienta estrategiaDeGolpeConHerramienta){
        if (aguante.durabilidad() <= 0) {
            estrategiaDeGolpeConHerramienta.desequiparHerramientaRota();
        }
    }
}
