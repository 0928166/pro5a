public class AudiSuv extends Suv{
    public AudiSuv(String colour, int seats, Engine engine, int horsepower,  int price ) {
        super(colour,seats,engine,horsepower,price);
    }
    public void printInfo() {
        System.out.println("Audi SUV");
    }
}
