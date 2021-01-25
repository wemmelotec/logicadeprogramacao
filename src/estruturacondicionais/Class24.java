package estruturacondicionais;

import java.util.Scanner;

public class Class24 {
    public static void main(String[] args) {
        int diaDaSemana;
        Scanner recebeDiaDaSemana = new Scanner(System.in);
        System.out.println("Informe um número entre 1 e 7 para o dia da semana: ");
        diaDaSemana = recebeDiaDaSemana.nextInt();

        switch (diaDaSemana){
            case 1:
                System.out.println("Você escolheu o Domingo.");
                break;
            case 2:
                System.out.println("Você escolheu a Segunda.");
                break;
            case 3:
                System.out.println("Você escolheu a Terça.");
                break;
            case 4:
                System.out.println("Você escolheu a Quarta.");
                break;
            case 5:
                System.out.println("Você escolheu a Quinta.");
                break;
            case 6:
                System.out.println("Você escolheu a Sexta.");
                break;
            case 7 :
                System.out.println("Você escolheu o Sábado.");
                break;
            default:
                System.out.println("Opção inválida.");
        }

    }
}
