public class PorscheFamily extends FamilyCar{
    public PorscheFamily(){}
    public PorscheFamily(Colour colour, int seats, Engine engine, int horsepower,  int price ) {
        super(colour,seats,engine,horsepower,price);
    }
    public void printInfo() {
        System.out.println("Porsche family car");
    }
}
