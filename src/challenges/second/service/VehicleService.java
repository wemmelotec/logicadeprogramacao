package challenges.second.service;

import challenges.second.repository.VehicleRepository;

public class VehicleService {

    VehicleRepository vehicleRepository = new VehicleRepository();

    //ele tem que retornar um novo array com os veiculos das montadoras
    public void searchByAutomaker(){

    }
    public VehicleRepository getVehicleRepository() {
        return vehicleRepository;
    }

    public void setVehicleRepository(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }
}
