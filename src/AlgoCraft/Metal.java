package AlgoCraft;

public class Metal extends MaterialDeConstruccion{
    public Metal ()
    {
        this.durabilidad =50;
    }

    @Override
    public int durabilidadDeConstruccion(Hacha unHacha) {
        return 400;
    }

    @Override
    public int durabilidadDeConstruccion(Pico unPico) {
        return 400;
    }

    public int durabilidadDeConstruccion(PicoFino unPicoFino) {
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
        return (new DesgasteMitadDeFuerza());
    }

    @Override
    public Desgaste desgasteDeConstruccion(Pico unPico) {
        return (new DesgasteUsos());
    }

    @Override
    public Desgaste desgasteDeConstruccion(PicoFino unPicoFino) { //MEJORAR
        return null;
    }

    @Override
    public void serGolpeadaPor(Herramienta unaHerramienta) {

    }
}
