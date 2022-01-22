package challenges.second;


public class Application {
    public static void main(String[] args) {
        Automaker automaker = new Automaker("GM");
        Automaker automaker2 = new Automaker("Hyundai");
        Vehicle vehicle = new Vehicle(automaker, "Suburban","back",2020);
        Vehicle vehicle2 = new Vehicle(automaker2,"Azera", "blue", 2022);

        Vehicle[] listVehicle = new Vehicle[10];
        listVehicle[0] = vehicle;
        listVehicle[1] = vehicle2;

        for (Vehicle x: listVehicle) {
            System.out.println(x.prettyPrint());
        }
    }
}
