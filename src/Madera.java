package Objetos;

public class Madera extends Material{
    public Madera (){
        this.durabilidad =10;
    }

    @Override
    public void serGolpeadaPor(Hacha hacha) {
        this.durabilidad = this.durabilidad - hacha.fuerza();
    }
}