package estruturacondicionais;

import java.util.Scanner;

public class Class14 {
    public static void main(String[] args) {
        int idade;

        Scanner recebeIdade = new Scanner(System.in);
        System.out.print("Qual é a sua idade? ");
        idade = recebeIdade.nextInt();

        if(idade>18){
            System.out.println("Adulto");
        }else {
            System.out.println("Ainda não é adulto");
        }
    }
}
