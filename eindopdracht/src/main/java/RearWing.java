public class RearWing extends CarDecorator{
    private int price = 500;
    public RearWing(Car c) {
        super(c);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("with rearwing upgrade");
    }

    @Override
    public int price() {
        return (super.price() + price);
    }
}
