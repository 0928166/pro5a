public class CarDecorator extends Car{
    private Car c = null;

    public CarDecorator(Car _c) {
        c = _c;
    }

    @Override
    public void printInfo() {
        if (c != null) {
            c.printInfo();
        }
    }
}
