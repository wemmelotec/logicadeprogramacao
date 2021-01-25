package estruturaderepeticao;

import java.util.Scanner;

public class Class32 {
    public static void main(String[] args) {
        int desejaContinuar = 1;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Player 1 - Digite um número de 1 a 10: ");
            int num1 = input.nextInt();
            System.out.print("Palyer 2 - Digite um número de 1 a 10: ");
            int num2 = input.nextInt();
            System.out.println("Acertou "+ (num1==num2));
            System.out.println("Deseja continuar?");
            System.out.println("1. SIM");
            System.out.println("2. NÃO");
            desejaContinuar = input.nextInt();
        }while (desejaContinuar == 1);
    }
}
