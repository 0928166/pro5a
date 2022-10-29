public class Tune extends CarDecorator{
    private int price = 300;
    private int hp = 50;

    public Tune(Car c) {
        super(c);
        c.price += price;
        c.horsePower += hp;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("With tune");


    }
}
