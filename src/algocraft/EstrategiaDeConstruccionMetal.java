package algocraft;

public class EstrategiaDeConstruccionMetal extends EstrategiaDeConstruccion{
    @Override
    public double durabilidadDeConstruccion(Hacha unHacha) {
        return 400;
    }

    @Override
    public double durabilidadDeConstruccion(Pico unPico) {
        return 400;
    }

    @Override
    public double durabilidadDeConstruccion(PicoFino unPicoFino) {
        return 1000;
    }

    @Override
    public int fuerzaDeConstruccion(Hacha unHacha) {
        return 10;
    }

    @Override
    public int fuerzaDeConstruccion(Pico unPico) {
        return 12;
    }

    @Override
    public int fuerzaDeConstruccion(PicoFino unPicoFino) {
        return 20;
    }

    @Override
    public Desgaste desgasteDeConstruccion(Hacha unHacha) {
        return (new DesgastePorFactor(0.5));
    }

    @Override
    public Desgaste desgasteDeConstruccion(Pico unPico) {
        return (new DesgasteUsos());
    }

    @Override
    public Desgaste desgasteDeConstruccion(PicoFino unPicoFino) {
        return (new DesgastePorFactor(0.1));
    }
}
