package algocraft.construcciondeherramientas;

import algocraft.materiales.Madera;
import algocraft.materiales.Metal;
import algocraft.materiales.Piedra;

public class IdHacha extends Id{
    public IdHacha(Madera unaMadera){
        this.setNumeroDeId(110110010);
    }
    public IdHacha(Metal unMetal){
        this.setNumeroDeId(220210010);
    }
    public IdHacha(Piedra unaPiedra){
        this.setNumeroDeId(330310010);
    }

}
