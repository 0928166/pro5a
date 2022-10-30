public class Tune extends CarDecorator{
    private int price = 300;
    private int horsePower = 50;

    public Tune(Car c) {
        super(c);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("With tune");
    }

    @Override
    public int horsePower() {
         return (super.horsePower() + horsePower);
    }

    @Override
    public int price() {
        return (super.price() + price);
    }
}
