package AlgoCraft;

public class EstrategiaDeConstruccionPiedra extends EstrategiaDeConstruccion{
    @Override
    public int durabilidadDeConstruccion(Hacha unHacha) {
        return 200;
    }

    @Override
    public int durabilidadDeConstruccion(Pico unPico) {
        return 200;
    }

    @Override
    public int durabilidadDeConstruccion(PicoFino unPicoFino) {
        return 1000;
    }

    @Override
    public int fuerzaDeConstruccion(Hacha unHacha) {
        return 5;
    }

    @Override
    public int fuerzaDeConstruccion(Pico unPico) {
        return 4;
    }

    @Override
    public int fuerzaDeConstruccion(PicoFino unPicoFino) {
        return 20;
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
        return (new DesgasteMitadDeFuerza());
    }
}
