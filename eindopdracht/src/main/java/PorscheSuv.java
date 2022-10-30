public class PorscheSuv extends Suv{
    public PorscheSuv(){}
    public PorscheSuv(Colour colour, int seats, Engine engine, int horsepower,  int price ) {
        super(colour,seats,engine,horsepower,price);
    }
    public void printInfo() {
        System.out.println("Porsche SUV");
    }
}
