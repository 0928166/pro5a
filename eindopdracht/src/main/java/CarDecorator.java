public class CarDecorator extends Car {
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
    @Override
    public int price() {
        if (c != null) {
            return c.price();
        }
        return 0;
    }
    @Override
    public int horsePower() {
        if (c != null) {
            return c.horsePower();
        }
        return 0;
    }
    @Override
    public int seats() {
        if (c != null) {
            return c.seats();
        }
        return 0;
    }

    @Override
    public Colour colour() {
        if (c != null) {
            return c.colour();
        }
        return null;
    }

    @Override
    public Engine engine() {
        if (c != null) {
            return c.engine();
        }
        return null;
    }

}