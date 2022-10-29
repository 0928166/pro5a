public class AudiFactory extends CarFactory{
    @Override
    public SportsCar createSportsCar(String colour) {
        AudiSport s = new AudiSport();
        s.colour = colour;
        s.horsePower = 525;
        s.seats = 2;
        s.price = 60000;
        s.engine = new PertrolEngine();
        return s;
    }
    public FamilyCar createFamilyCar(String colour) {
        AudiFamily f = new AudiFamily();
        f.colour = colour;
        f.horsePower = 200;
        f.seats = 5;
        f.price = 40000;
        f.engine = new ElectricEngine();
        return f;
    }

    @Override
    public Suv createSuv(String colour) {
        return null;
    }
}
