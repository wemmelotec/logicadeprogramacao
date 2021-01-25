package estruturacondicionais;

import java.util.Scanner;

public class Class17 {
    public static void main(String[] args) {
        double salario;
        Scanner recebeSalario = new Scanner(System.in);

        System.out.print("Digite o seu salário: ");
        salario = recebeSalario.nextDouble();

        if (salario <= 1903) {
            System.out.println("Alíquota 0%");
        } else if (salario >= 1904 && salario <= 2826) {
            System.out.println("Alíquota 7,5%");
        } else if (salario >= 2827 && salario <= 3751) {
            System.out.println("Alíquota 22,5%");
        } else {
            System.out.println("Alíquota 27,5%");
        }

    }
}
