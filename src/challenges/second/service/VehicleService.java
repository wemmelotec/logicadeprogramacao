package challenges.second.service;

import challenges.second.classes.Vehicle;
import challenges.second.repository.VehicleRepository;

import java.util.Arrays;

public class VehicleService {

    VehicleRepository vehicleRepository = new VehicleRepository();
    //soluçao em https://pt.stackoverflow.com/questions/14339/eliminar-valores-repetidos-array-java
    public String[] retiraRepetidos(String[] array) {
        String[] arraySemRepeticao = new String[array.length];
        int qtd = 0;
        for( int i = 0 ; i < array.length ; i++ ) {
            boolean existe = false;
            for( int j = 0 ; j < qtd ; j++ ) {
                if( arraySemRepeticao[ j ] == array[ i ] ) {
                    existe = true;
                    break;
                }
            }
            if( !existe ) {
                arraySemRepeticao[ qtd++ ] = array[ i ];
            }
        }
        arraySemRepeticao = Arrays.copyOf( arraySemRepeticao , qtd );

        return arraySemRepeticao;
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

}
