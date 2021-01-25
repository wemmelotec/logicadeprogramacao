package arrays;

import java.util.Scanner;

public class Class37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double soma = 0;
        double[] notas = new double[4];

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Informe a nota %d: ", (i + 1));
            notas[i] = input.nextDouble();
            soma = soma + notas[i];
        }
        System.out.printf("A média do aluno foi %.2f", soma / notas.length);
    }
}
