public abstract class Suv extends Car{
    public Suv(String colour, int seats, Engine engine, int horsepower,  int price ) {
        this.colour = colour;
        this.seats = seats;
        this.engine = engine;
        this.horsePower = horsepower;
        this.price = price;
    }
    public int horsePower() {
        return horsePower;
    }
    public int seats() {
        return seats;
    }
    public String colour() {
        return colour;
    }
    public Engine engine() {
        return engine;
    }
    public int price() {
        return price;
    }
}
