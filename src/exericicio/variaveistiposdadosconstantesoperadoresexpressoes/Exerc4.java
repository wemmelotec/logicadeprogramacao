package exericicio.variaveistiposdadosconstantesoperadoresexpressoes;

import java.util.Scanner;

public class Exerc4 {
    public static void main(String[] args) {
        float grausFah;
        float grausCelsius;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite e temperatura em Fahrenheit: ");
        grausFah = input.nextFloat();
        grausCelsius = ((grausFah - 32) * 5) / 9;
        System.out.printf("A temperatura informada de %.1f em Fahrenheit,\n" +
                "representa %.1f em Celsius",grausFah,grausCelsius);
    }
}
