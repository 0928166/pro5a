public abstract class Car {
    //fields
    public int horsePower;
    public int seats;
    public Engine engine;
    public int price;
    public String colour;

    public  void printInfo(){
        System.out.print("Engine: ");
        engine.printEngineType();
        System.out.println(" horsepower: " + horsePower + " seats: " + seats + " colour: " + colour + " Price: " + price);
    };

}
