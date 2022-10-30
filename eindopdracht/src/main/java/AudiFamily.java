public class AudiFamily extends FamilyCar{
    public AudiFamily(){}
    public AudiFamily(Colour colour, int seats, Engine engine, int horsepower,  int price ) {
        super(colour,seats,engine,horsepower,price);
    }
    @Override
    public void printInfo() {
        System.out.println("Audi family car");
    }
}
