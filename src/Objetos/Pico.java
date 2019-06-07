package Objetos;

public class Pico extends Herramienta {

    public Pico(MaterialDeConstruccion unMaterial){
        this.material = unMaterial;
        this.durabilidad = unMaterial.durabilidadDeConstruccion(this);
        this.fuerza = unMaterial.fuerzaDeConstruccion(this);
        this.desgaste = unMaterial.desgasteDeConstruccion(this);
    }

    @Override
    public void golpear(Material material) {

        durabilidad = desgaste.desgastarDada(durabilidad, fuerza);
    }
}
