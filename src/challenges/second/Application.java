package challenges.second;

import challenges.second.service.VehicleService;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        int seletor;
        Scanner opcaoDoUsuario = new Scanner(System.in);
        VehicleService vehicleService = new VehicleService();

        do {
            System.out.println("       -- Menu --\n");
            System.out.println("1 - Search by automaker");
            System.out.println("0 - Exit");
            System.out.print("\n" + "Choose one of the options: ");
            seletor = opcaoDoUsuario.nextInt();

            if (seletor == 1) {
                int numeroColunaDaEsquerda = 1;
                        int seletorDoMenuMontadora;
                        for (String x : vehicleService.searchByAutomaker()) {
                            System.out.printf("%d - " + x + "\n", numeroColunaDaEsquerda );
                            numeroColunaDaEsquerda++;
                        }
                        System.out.print("\n" +"Choose one of the options: ");
                        vehicleService.printVehicleByAutomaker(seletorDoMenuMontadora = opcaoDoUsuario.nextInt());
                System.out.println("Do you wish to continue?");
                System.out.println("0 - No\n" + "1 - Yes");
                seletor = opcaoDoUsuario.nextInt();
            }else if (seletor == 0){
                break;
            }else{
                System.out.println("Invalid option!\n");
            }

        } while (seletor == 1);

    }
}
