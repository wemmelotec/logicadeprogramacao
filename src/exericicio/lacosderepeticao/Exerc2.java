package exericicio.lacosderepeticao;

import java.util.Scanner;

public class Exerc2 {
    public static void main(String[] args) {
        int numero = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Informe um número inteiro de 1 a 10: ");
        numero = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + "+" + i + "=" + (numero + i)
                    + "\t\t\t" + numero + "-" + i + "=" + (numero - i)
                    + "\t\t\t" + numero + "*" + i + "=" + (numero * i)
                    + "\t\t\t" + numero + "/" + i + "=" + (numero / i));
        }
    }
}
