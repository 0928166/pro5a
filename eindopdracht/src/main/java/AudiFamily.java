public class AudiFamily extends FamilyCar{

    public AudiFamily(String colour, int seats, Engine engine, int horsepower,  int price ) {
        super(colour,seats,engine,horsepower,price);
    }
    @Override
    public void printInfo() {
        System.out.print("Audi family car");
    }
}
