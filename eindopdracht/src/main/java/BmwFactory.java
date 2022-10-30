public class BmwFactory extends CarFactory{
    public BmwSport createSportsCar(String colour) {
        return new BmwSport(colour, 2, new PertrolEngine(), 345, 45000);
    }
    public BmwFamily createFamilyCar(String colour) {
        return new BmwFamily(colour, 7, new DieselEngine(), 180,25000);
    }
    public BmwSuv createSuv(String colour) {
        return new BmwSuv(colour, 5, new DieselEngine(), 280, 32000);
    }
}
