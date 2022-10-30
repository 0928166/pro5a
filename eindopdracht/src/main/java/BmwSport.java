public class BmwSport extends SportsCar{
    public BmwSport(){}
    public BmwSport(Colour colour, int seats, Engine engine, int horsepower,  int price ) {
        super(colour,seats,engine,horsepower,price);
    }
        public void printInfo() {
            System.out.println("BMW sport car");
        }
}
