package challenges.second.service;

import challenges.second.classes.Vehicle;
import challenges.second.repository.VehicleRepository;

public class VehicleService {

    VehicleRepository vehicleRepository = new VehicleRepository();

    public String[] searchByAutomaker(){
        String[] automakers = new String[vehicleRepository.getBancoDeDadosVehicle().length];
        for (int i = 0; i < vehicleRepository.getBancoDeDadosVehicle().length ; i++) {
            automakers[i] = vehicleRepository.getBancoDeDadosVehicle()[i].getAutomaker().getName();
        }
        return automakers;
    }

    public VehicleRepository getVehicleRepository() {
        return vehicleRepository;
    }

//    public void setVehicleRepository(VehicleRepository vehicleRepository) {
//        this.vehicleRepository = vehicleRepository;
//    }
}
