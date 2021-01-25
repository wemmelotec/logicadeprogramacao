package estruturaderepeticao;

import java.util.Scanner;

public class Class301 {
    public static void main(String[] args) {
        int opcaoDoUsuario = 0;
        Scanner opcaoDoUsuarioEntrada = new Scanner(System.in);

        while (opcaoDoUsuario != 3) {
            System.out.println("       -- Menu --\n");
            System.out.println("1 - Calcular imposto");
            System.out.println("2 - Calcular salário");
            System.out.println("3 - Sair");
            System.out.print(">>");
            opcaoDoUsuario = opcaoDoUsuarioEntrada.nextInt();
            switch (opcaoDoUsuario) {
                case 1:
                    System.out.println("Você está na aba que calcula imposto!\n");
                    break;
                case 2:
                    System.out.println("Você está na aba que calcula salário!\n");
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!\n");
            }
        }
    }
}
