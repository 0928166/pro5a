public class AudiSport extends SportsCar{
    public AudiSport(){
    }
    public AudiSport(Colour colour, int seats, Engine engine, int horsepower,  int price ) {
        super(colour,seats,engine,horsepower,price);
    }
    public void printInfo() {
        System.out.println("Audi sport car");
    }
}
