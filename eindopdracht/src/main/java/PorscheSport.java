public class PorscheSport extends SportsCar{
    public PorscheSport(String colour, int seats, Engine engine, int horsepower,  int price ) {
        super(colour,seats,engine,horsepower,price);
    }
    public void printInfo() {
        System.out.println("porsche sport car");
    }
}
