package challenges.second.service;

import challenges.second.repository.VehicleRepository;
import java.util.Arrays;

public class VehicleService {

    VehicleRepository vehicleRepository = new VehicleRepository();

    //solution in https://pt.stackoverflow.com/questions/14339/eliminar-valores-repetidos-array-java
    public String[] withdrawRepeated(String[] array) {
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
        return withdrawRepeated(automakers);
    }

    public void printVehicleByAutomaker(int x){
        switch (x){
            case 1:
                for (int i = 0; i < vehicleRepository.getBancoDeDadosVehicle().length; i++) {
                    if(vehicleRepository.getBancoDeDadosVehicle()[i].getAutomaker().getName()=="GM"){
                        System.out.println(vehicleRepository.getBancoDeDadosVehicle()[i].prettyPrint());
                    }
                }
                break;
            case 2:
                for (int i = 0; i < vehicleRepository.getBancoDeDadosVehicle().length; i++) {
                    if(vehicleRepository.getBancoDeDadosVehicle()[i].getAutomaker().getName()=="Hyundai"){
                        System.out.println(vehicleRepository.getBancoDeDadosVehicle()[i].prettyPrint());
                    }
                }
                break;
            case 3:
                for (int i = 0; i < vehicleRepository.getBancoDeDadosVehicle().length; i++) {
                    if(vehicleRepository.getBancoDeDadosVehicle()[i].getAutomaker().getName()=="Volkswagen"){
                        System.out.println(vehicleRepository.getBancoDeDadosVehicle()[i].prettyPrint());
                    }
                }
                break;
            case 4:
                for (int i = 0; i < vehicleRepository.getBancoDeDadosVehicle().length; i++) {
                    if(vehicleRepository.getBancoDeDadosVehicle()[i].getAutomaker().getName()=="Audi"){
                        System.out.println(vehicleRepository.getBancoDeDadosVehicle()[i].prettyPrint());
                    }
                }
                break;
            case 5:
                for (int i = 0; i < vehicleRepository.getBancoDeDadosVehicle().length; i++) {
                    if(vehicleRepository.getBancoDeDadosVehicle()[i].getAutomaker().getName()=="Mercedes"){
                        System.out.println(vehicleRepository.getBancoDeDadosVehicle()[i].prettyPrint());
                    }
                }
                break;
            case 6:
                for (int i = 0; i < vehicleRepository.getBancoDeDadosVehicle().length; i++) {
                    if(vehicleRepository.getBancoDeDadosVehicle()[i].getAutomaker().getName()=="Peugeot"){
                        System.out.println(vehicleRepository.getBancoDeDadosVehicle()[i].prettyPrint());
                    }
                }
                break;
            default:
                System.out.println("Invalid option!");
        }

    }

    public VehicleRepository getVehicleRepository() {
        return vehicleRepository;
    }

}
