package algocraft;

public class EstrategiaDeConstruccionMadera extends EstrategiaDeConstruccion {
    @Override
    public double durabilidadDeConstruccion(Hacha unHacha) {
        return 100;
    }

    @Override
    public double durabilidadDeConstruccion(Pico unPico) {
        return 100;
    }

    @Override
    public double durabilidadDeConstruccion(PicoFino unPicoFino) {
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
        return (new DesgastePorFactor(1));
    }

    @Override
    public Desgaste desgasteDeConstruccion(Pico unPico) {
        return (new DesgastePorFactor(1));
    }

    @Override
    public Desgaste desgasteDeConstruccion(PicoFino unPicoFino) {
        return null;
    }
}
