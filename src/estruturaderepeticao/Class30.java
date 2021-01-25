package estruturaderepeticao;

import java.util.Scanner;

public class Class30 {
    public static void main(String[] args) {
        int opcaoDoUsuario;
        Scanner opcaoDoUsuarioEntrada = new Scanner(System.in);

        do{
            System.out.println("*****MENU*****");
            System.out.println("1 - Calcular importo de renda.");
            System.out.println("2 - Depósitar o salário.");
            System.out.println("3 - Sair.");
            System.out.print("\nEscolha uma das opções: ");
            opcaoDoUsuario = opcaoDoUsuarioEntrada.nextInt();
            switch (opcaoDoUsuario){
                case 1:
                    System.out.println("\nCalculando o imposto de renda...\n");
                    break;
                case 2:
                    System.out.println("\nDepósitando o salário...\n");
                    break;
                case 3:
                    System.out.println("\nPrograma finalizado\n");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while (opcaoDoUsuario == 1 || opcaoDoUsuario == 2);
    }
}
