public class SatNav extends CarDecorator{
    private int price = 500;
    public SatNav(Car c) {
        super(c);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("with satnav");
    }

    @Override
    public int price() {
        return (super.price() + price);
    }
}
