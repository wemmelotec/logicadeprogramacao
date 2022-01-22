package challenges.second;
import challenges.second.classes.Vehicle;
import challenges.second.repository.VehicleRepository;
import challenges.second.service.VehicleService;

public class Application {
    public static void main(String[] args) {
//        VehicleRepository vehicleRepository = new VehicleRepository();
//
//        for (Vehicle x: vehicleRepository.getBancoDeDadosVehicle()) {
//            System.out.println(x.getAutomaker());
//        }
        VehicleService vehicleService = new VehicleService();
        vehicleService.searchByAutomaker();

//        for (String x: vehicleService.searchByAutomaker()) {
//            System.out.println();
//        }

    }
}
