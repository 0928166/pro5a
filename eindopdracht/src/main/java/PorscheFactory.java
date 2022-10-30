public class PorscheFactory extends CarFactory{
    public PorscheSport createSportsCar(String colour) {
        return new PorscheSport(colour, 2, new PertrolEngine(),700, 100000);
    }
    public PorscheFamily createFamilyCar(String colour) {
        return new PorscheFamily(colour, 5, new ElectricEngine(), 300, 70000);
    }
    public PorscheSuv createSuv(String colour) {
        return new PorscheSuv(colour, 5, new ElectricEngine(), 280, 50000);
    }
}
