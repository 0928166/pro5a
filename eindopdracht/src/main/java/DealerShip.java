import java.util.ArrayList;
import java.util.Scanner;

public class DealerShip {
    Scanner input = new Scanner(System.in);
    private ArrayList<Car> occasionList = new ArrayList<Car>();
    private CarFactory factory;

    public Car buyNewCar() {
        System.out.println("""
                Brand:
                1. audi
                2. BMW
                3. Porsche
                4. cancel""");
        int choice1 = input.nextInt();
        switch (choice1) {
            case 1 -> factory = new AudiFactory();
            case 2 -> factory = new BmwFactory();
            case 3 -> factory = new PorscheFactory();
            case 4 -> {return null;}
            default -> {
                System.out.println("Wrong input");
                return null;
            }
        }
        System.out.println("""
                Type:
                1. sport
                2. family
                3. SUV
                4. cancel""");
        int choice2 = input.nextInt();
        switch (choice2) {
            case 1 :
                return factory.createSportsCar();
            case 2:
                 return factory.createFamilyCar();
            case 3:
                 return factory.createSuv();
            case 4:
                return null;
            default:
                System.out.println("Wrong input");
                return null;
        }
    }
    public Car buyOccasion() {
        int i = 0;
        if (occasionList.size() == 0) {
            System.out.println("no occasions to buy");
            return null;
        }
        System.out.println("showing occasion list:");
        while (i < occasionList.size()) {
            System.out.println(i);
            occasionList.get(i).printInfo();
            occasionList.get(i).price();
            i++;
        }
        while (true) {
            int choice = input.nextInt();
            if (choice < occasionList.size()) {
                return occasionList.remove(choice);
            }
        }
    }
    public void sellCar (Car c) {
        occasionList.add(c);
    }

    public Car modifyCar(Car c) {
        System.out.println("""
                Modifications:
                1. Tune
                2. Rear Wing
                3. Leather seats
                4. SatNav
                5. cancel""");
        int choice = input.nextInt();
        return switch (choice) {
            case 1 -> new Tune(c);
            case 2 -> new RearWing(c);
            case 3 -> new LeatherSeats(c);
            case 4 -> new SatNav(c);
            default -> c;
        };
    }

}
