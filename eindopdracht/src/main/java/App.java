public class App {
    public static void main(String[] args) {
        AudiFactory audiFactory = new AudiFactory();

        Car audiSport = audiFactory.createSportsCar("black");
        Car sport = new AudiSport("black", 2, new PertrolEngine(),525, 60000);

        audiSport.printInfo();
        System.out.println(audiSport.price());
        audiSport.engine().printEngineType();
        System.out.println(audiSport.horsePower());
        System.out.println(audiSport.colour());
        System.out.println(audiSport.seats());

        System.out.println("=====");
        audiSport = new LeatherSeats(audiSport);
        audiSport = new Tune(audiSport);
        audiSport = new RearWing(audiSport);

        audiSport.printInfo();
        System.out.println(audiSport.price());
        audiSport.engine().printEngineType();
        System.out.println(audiSport.horsePower());
        System.out.println(audiSport.colour());
        System.out.println(audiSport.seats());
//        System.out.println("base car:");
//        audiSport.printInfo();
////        audiSport = new Tune(audiSport);
////        audiSport.printInfo();
////        audiSport = new Tune(audiSport);
////        audiSport.printInfo();
////        audiSport = new RearWing(audiSport);
////        audiSport.printInfo();
//        audiSport = new LeatherSeats(audiSport);
//        audiSport = new LeatherSeats(audiSport);
//        System.out.println("tuned car:");
//        audiSport.printInfo();
    }
}
