package exericicio.variaveistiposdadosconstantesoperadoresexpressoes;

import java.util.Scanner;

public class Exerc3 {
    public static void main(String[] args) {
        float grauCelsius, grauFahrenheit;
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o grau que você quer converter: ");
        grauCelsius = input.nextFloat();
        grauFahrenheit = (9*grauCelsius)/5;
        System.out.println(grauCelsius + " Celsius convertido para Fahrenheit é " + grauFahrenheit);
    }
}
