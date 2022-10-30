import java.util.Random;

public class App {
    public static void main(String[] args) {
        // testing code
        // setting up factories and dealership
        AudiFactory audiFactory = new AudiFactory();
        BmwFactory bmwFactory = new BmwFactory();
        PorscheFactory porscheFactory = new PorscheFactory();
        DealerShip dealerShip = new DealerShip();
        // filling the occasion list with random cars
        for (int i = 0; i < 10; i++) {
            CarFactory f = audiFactory;
            Random random = new Random();
            int r1 = random.nextInt(0,3);
            switch (r1) {
                case 1 -> f = bmwFactory;
                case 2 -> f = porscheFactory;
            }
            int r2 = random.nextInt(0,2);
            switch (r2) {
                case 0 -> dealerShip.sellCar(f.createSportsCar());
                case 1 -> dealerShip.sellCar(f.createFamilyCar());
                case 2 -> dealerShip.sellCar(f.createSuv());
            }
        }
        // new client
        Client client1 = new Client("bob", null,dealerShip);
        // client buys occasion
        client1.buyOccasion();
        // client doesn't like it anymore and sells it
        client1.sellCar();
        // client buys a nice new car
        client1.buyNewCar();
        // client modifies his new car
        client1.modifyCar();

    }
}
