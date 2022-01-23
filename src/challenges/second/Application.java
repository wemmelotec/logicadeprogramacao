package challenges.second;

import challenges.second.classes.Vehicle;
import challenges.second.repository.VehicleRepository;
import challenges.second.service.VehicleService;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
//        VehicleRepository vehicleRepository = new VehicleRepository();
//
//        for (Vehicle x: vehicleRepository.getBancoDeDadosVehicle()) {
//            System.out.println(x.getAutomaker());
//        }
        int seletor;
        Scanner opcaoDoUsuario = new Scanner(System.in);
        VehicleService vehicleService = new VehicleService();

        do {
            System.out.println("       -- Menu --\n");
            System.out.println("1 - Search by automaker");
            System.out.println("0 - Exit");
            System.out.print("\n" + "Choose one of the options: ");
            seletor = opcaoDoUsuario.nextInt();
            //implementar uma limpeza de tela aqui
            if (seletor == 1) {
                switch (seletor) {
                    case 1:
                        int numeroColunaDaEsquerda = 1;
                        int seletorDoMenuMontadora;
                        for (String x : vehicleService.searchByAutomaker()) {
                            System.out.printf("%d - " + x + "\n", numeroColunaDaEsquerda );
                            numeroColunaDaEsquerda++;
                        }

                        System.out.print("\n" +"Choose one of the options: ");
                        seletorDoMenuMontadora = opcaoDoUsuario.nextInt();

                        //aqui implemento a busca pela montadora
                        //if equals ignore case == w sout
                        vehicleService.getVehicleRepository().getBancoDeDadosVehicle()[seletorDoMenuMontadora-1].getAutomaker().getName();

                        break;
                    default:
                        System.out.println("Invalid option!\n");
                }
                System.out.println("Do you wish to continue?");
                System.out.println("0 - No\n" + "1 - Yes");
                seletor = opcaoDoUsuario.nextInt();
            }

        } while (seletor == 1);

    }
}
