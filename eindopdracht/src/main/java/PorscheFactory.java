public class PorscheFactory extends CarFactory{
    public PorscheSport createSportsCar() {
        return new PorscheSport(new Red(), 2, new PertrolEngine(),700, 100000);
    }
    public PorscheFamily createFamilyCar() {
        return new PorscheFamily(new White(), 5, new ElectricEngine(), 300, 70000);
    }
    public PorscheSuv createSuv() {
        return new PorscheSuv(new Black(), 5, new ElectricEngine(), 280, 50000);
    }
}
