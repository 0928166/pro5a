public class App {
    public static void main(String[] args) {
        AudiFactory audiFactory = new AudiFactory();

        Car audiSport = audiFactory.createSportsCar("black");

        System.out.println("base car:");
        audiSport.printInfo();
        audiSport = new Tune(audiSport);
        System.out.println("tuned car:");
        audiSport.printInfo();
    }
}
