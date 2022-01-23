package challenges.second.service;

import challenges.second.classes.Vehicle;
import challenges.second.repository.VehicleRepository;

import java.util.Arrays;

public class VehicleService {

    VehicleRepository vehicleRepository = new VehicleRepository();

    public static String[] retiraRepetidos(String[] array) {
        Arrays.sort(array);
        String[] lista = new String[array.length];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if ((i > 0) && (array[i].equals(array[i - 1])) && (array[i].equals(array[i + 1]))) continue;
            if ((i < array.length - 2) && (array[i].equals(array[i + 2]))) continue;
            lista[j++] = array[i];
        }
        if (j != array.length){
            String[] newLista = new String[j];
            System.arraycopy(lista, 0, newLista, 0, j);
            return newLista;
        }
        return lista;
    }

    public String[] searchByAutomaker(){
        String[] automakers = new String[vehicleRepository.getBancoDeDadosVehicle().length];
        for (int i = 0; i < vehicleRepository.getBancoDeDadosVehicle().length ; i++) {
            automakers[i] = vehicleRepository.getBancoDeDadosVehicle()[i].getAutomaker().getName();
        }
        return retiraRepetidos(automakers);
    }

    public VehicleRepository getVehicleRepository() {
        return vehicleRepository;
    }

//    public void setVehicleRepository(VehicleRepository vehicleRepository) {
//        this.vehicleRepository = vehicleRepository;
//    }
}
