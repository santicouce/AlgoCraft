package AlgoCraft;

public class EstrategiaDeConstruccionMadera extends EstrategiaDeConstruccion {
    @Override
    public int durabilidadDeConstruccion(Hacha unHacha) {
        return 100;
    }

    @Override
    public int durabilidadDeConstruccion(Pico unPico) {
        return 100;
    }

    @Override
    public int durabilidadDeConstruccion(PicoFino unPicoFino) {
        return 0;
    }

    @Override
    public int fuerzaDeConstruccion(Hacha unHacha) {
        return 2;
    }

    @Override
    public int fuerzaDeConstruccion(Pico unPico) {
        return 2;
    }

    @Override
    public int fuerzaDeConstruccion(PicoFino unPicoFino) {
        return 0;
    }

    @Override
    public Desgaste desgasteDeConstruccion(Hacha unHacha) {
        return (new DesgasteDeFuerza());
    }

    @Override
    public Desgaste desgasteDeConstruccion(Pico unPico) {
        return (new DesgasteDeFuerza());
    }

    @Override
    public Desgaste desgasteDeConstruccion(PicoFino unPicoFino) {
        return null;
    }
}
