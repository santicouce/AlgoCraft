package AlgoCraft;

public abstract class Herramienta {

    protected Material material;
    protected double durabilidad;
    protected int fuerza;
    protected Desgaste desgaste;
    protected Duracion duracion;

    public double durabilidad() {
        return this.durabilidad;
    }
    public int fuerza(){
        return this.fuerza;
    }
    public abstract void golpear(Material material);
    public void rompete(){durabilidad = 0;}
    public int reducir(int durabilidadDeObjetoGolpeado){ return (durabilidadDeObjetoGolpeado - fuerza);}

    public abstract void daniar(Madera madera);
    public abstract void daniar(Diamante diamante);
    public abstract void daniar(Piedra piedra);
    public abstract void daniar(Metal metal);
}
