public class AudiSuv extends Suv{
    public AudiSuv(){}
    public AudiSuv(Colour colour, int seats, Engine engine, int horsepower,  int price ) {
        super(colour,seats,engine,horsepower,price);
    }
    public void printInfo() {
        System.out.println("Audi SUV");
    }
}
