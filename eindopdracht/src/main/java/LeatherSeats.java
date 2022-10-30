public class LeatherSeats extends CarDecorator{
    private int price = 3000;

    public LeatherSeats(Car c){
        super(c);
//        c.setPrice(c.getPrice() + price);
    }

@Override
    public void printInfo() {
        super.printInfo();
        System.out.println("with leather seats");
    }

@Override
    public int price() {
        return (super.price() + price);
    }
}
