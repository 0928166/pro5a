public class AudiSport extends SportsCar{

    public AudiSport(String colour, int seats, Engine engine, int horsepower,  int price ) {
        super(colour,seats,engine,horsepower,price);
    }
    public void printInfo() {
        System.out.println("Audi sport car");
    }
}
