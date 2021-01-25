package estruturacondicionais;

import java.util.Scanner;

public class Class16 {
    public static void main(String[] args) {
        int numeroInteiro;
        Scanner recebeNumeroInteiro = new Scanner(System.in);

        System.out.print("Digite o número inteiro: ");
        numeroInteiro = recebeNumeroInteiro.nextInt();

        if(numeroInteiro%2==0){
            System.out.println("O número " +numeroInteiro + " é par");
        }else{
            System.out.println("O número " +numeroInteiro + " é impar");
        }
    }
}
