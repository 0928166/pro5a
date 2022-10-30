public class AudiFactory extends CarFactory{
    public AudiSport createSportsCar() {
        return new AudiSport(new Grey(), 2, new PertrolEngine(),525, 60000);
    }
    public AudiFamily createFamilyCar() {
        return new AudiFamily(new Grey(), 5, new DieselEngine(), 250, 40000);
    }
    public AudiSuv createSuv() {
        return new AudiSuv(new Grey(), 7, new ElectricEngine(), 280, 50000);
    }
}
