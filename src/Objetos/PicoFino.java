package Objetos;

public class PicoFino extends Herramienta{

    private Material material;

    public PicoFino(MaterialDeConstruccion unMaterial){
        this.material = unMaterial;
        this.durabilidad = unMaterial.durabilidadDeConstruccion(this);
        this.fuerza = unMaterial.fuerzaDeConstruccion(this);
        this.desgaste = unMaterial.desgasteDeConstruccion(this);
    }

    @Override
    public void golpear(Material material) {

    }

}
