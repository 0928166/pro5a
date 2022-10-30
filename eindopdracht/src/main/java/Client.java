public class Client {
    private String name;
    private Car car;
    private DealerShip dealerShip;

    public Client(){}
    public Client(String n, Car c, DealerShip d){
        this.name = n;
        this.car = c;
        this.dealerShip = d;
    }

    public void buyNewCar(){
        car = dealerShip.buyNewCar();
        System.out.println(name + " Bought: ");
        car.printInfo();
    }

    public void sellCar(){
        System.out.println(name + " is Selling: ");
        car.printInfo();
        dealerShip.sellCar(car);
        car = null;
    }
    public void buyOccasion(){
        car = dealerShip.buyOccasion();
        System.out.println(name + " Bought: ");
        car.printInfo();
    }

    public Car getCar() {
        return car;
    }

    public DealerShip getDealerShip() {
        return dealerShip;
    }

    public String getName() {
        return name;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setDealerShip(DealerShip dealerShip) {
        this.dealerShip = dealerShip;
    }

    public void setName(String name) {
        this.name = name;
    }
}
