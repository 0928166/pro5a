public class AudiFactory extends CarFactory{
    public AudiSport createSportsCar(String colour) {
        return new AudiSport(colour, 2, new PertrolEngine(),525, 60000);
    }
    public AudiFamily createFamilyCar(String colour) {
        return new AudiFamily(colour, 5, new DieselEngine(), 250, 40000);
    }
    public AudiSuv createSuv(String colour) {
        return new AudiSuv(colour, 7, new ElectricEngine(), 280, 50000);
    }
}
