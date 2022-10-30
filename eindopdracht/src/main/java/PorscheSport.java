public class PorscheSport extends SportsCar{
    public PorscheSport(){}
    public PorscheSport(Colour colour, int seats, Engine engine, int horsepower,  int price ) {
        super(colour,seats,engine,horsepower,price);
    }
    public void printInfo() {
        System.out.println("porsche sport car");
    }
}
