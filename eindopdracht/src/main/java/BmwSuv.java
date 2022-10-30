public class BmwSuv extends Suv{
    public BmwSuv(){}
    public BmwSuv(Colour colour, int seats, Engine engine, int horsepower,  int price ) {
        super(colour,seats,engine,horsepower,price);
    }
    public void printInfo() {
        System.out.print("BMW Suv");
    }
}
