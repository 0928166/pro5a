public class BmwFactory extends CarFactory{
    public BmwSport createSportsCar() {
        return new BmwSport(new White(), 2, new PertrolEngine(), 345, 45000);
    }
    public BmwFamily createFamilyCar() {
        return new BmwFamily(new Black(), 7, new DieselEngine(), 180,25000);
    }
    public BmwSuv createSuv() {
        return new BmwSuv(new Red(), 5, new DieselEngine(), 280, 32000);
    }
}
