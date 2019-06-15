package algocraft;

public abstract class EstrategiaDeConstruccion {
    public  abstract double durabilidadDeConstruccion(Hacha unHacha);
    public  abstract double durabilidadDeConstruccion(Pico unPico);
    public  abstract double durabilidadDeConstruccion(PicoFino unPicoFino);

    public  abstract int fuerzaDeConstruccion(Hacha unHacha);
    public  abstract int fuerzaDeConstruccion(Pico unPico);
    public  abstract int fuerzaDeConstruccion(PicoFino unPicoFino);

    public abstract Desgaste desgasteDeConstruccion(Hacha unHacha);
    public abstract Desgaste desgasteDeConstruccion(Pico unPico);
    public abstract Desgaste desgasteDeConstruccion(PicoFino unPicoFino);
}
