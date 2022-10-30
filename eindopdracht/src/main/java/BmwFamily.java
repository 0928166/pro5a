public class BmwFamily extends FamilyCar{
    public BmwFamily(){}
    public BmwFamily(Colour colour, int seats, Engine engine, int horsepower,  int price ) {
        super(colour,seats,engine,horsepower,price);
    }
    public void printInfo() {
        System.out.println("BMW family car");
    }
}
