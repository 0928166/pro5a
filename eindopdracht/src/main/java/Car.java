public abstract class Car {
    protected int horsePower;
    protected int seats;
    protected Engine engine;
    protected int price;
    protected String colour;

    public abstract void printInfo();
    public abstract int price();
    public abstract int horsePower();
    public abstract int seats();
    public abstract String colour();
    public abstract Engine engine();
}
