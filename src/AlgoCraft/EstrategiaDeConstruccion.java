package AlgoCraft;

public abstract class EstrategiaDeConstruccion {
    public  abstract int durabilidadDeConstruccion(Hacha unHacha);
    public  abstract int durabilidadDeConstruccion(Pico unPico);
    public  abstract int durabilidadDeConstruccion(PicoFino unPicoFino);

    public  abstract int fuerzaDeConstruccion(Hacha unHacha);
    public  abstract int fuerzaDeConstruccion(Pico unPico);
    public  abstract int fuerzaDeConstruccion(PicoFino unPicoFino);

    public abstract Desgaste desgasteDeConstruccion(Hacha unHacha);
    public abstract Desgaste desgasteDeConstruccion(Pico unPico);
    public abstract Desgaste desgasteDeConstruccion(PicoFino unPicoFino);
}
