package challenges.first;

import java.util.Scanner;

public class Application {
    public static void main(String[] args){
        int seletor;
        Scanner opcaoDoUsuario = new Scanner(System.in);
        String[][] arrayMulti = {
                { "GM", "Suburban", "Malibu", "Silverado"},
                { "Hyundai", "Azera", "Sonata", "Veloster" },
                { "Volkswagen", "Golf", "Jetta", "Polo"},
                { "Audi", "A4", "Q7", "R8"},
                { "Mercedes", "C 180", "C 200", "GLA 200"},
                { "Peugeot", "206", "208", "2008"}
        };

        do{
            System.out.println("       -- Menu --\n");
            System.out.println("1 - " + arrayMulti[0][0]);
            System.out.println("2 - " + arrayMulti[1][0]);
            System.out.println("3 - " + arrayMulti[2][0]);
            System.out.println("4 - " + arrayMulti[3][0]);
            System.out.println("5 - " + arrayMulti[4][0]);
            System.out.println("6 - " + arrayMulti[5][0]);
            System.out.println("7 - Exit");
            System.out.print("\n" +"Choose one of the options: ");
            seletor = opcaoDoUsuario.nextInt();
            if(seletor != 7) {
                switch (seletor) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        System.out.println("Available vehicles:");
                        System.out.println(arrayMulti[seletor-1][0]);
                        System.out.println(arrayMulti[seletor-1][1]);
                        System.out.println(arrayMulti[seletor-1][2]);
                        System.out.println(arrayMulti[seletor-1][3] + "\n");
                        break;
                    default:
                        System.out.println("Invalid option!\n");
                }
                System.out.println("Do you wish to continue?");
                System.out.println("0 - No\n" +"1 - Yes");
                seletor = opcaoDoUsuario.nextInt();
            }

        }while (seletor == 1);

    }
}


