package estruturaderepeticao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Class11 {
    public static void main(String[] args) {
        double salario;
        double percentualDoSalario;
        ArrayList<Double> resultado = new ArrayList();

        Scanner recebeSalario = new Scanner(System.in);
        System.out.print("Digite o valor de seu salário: ");
        salario = recebeSalario.nextDouble();

        percentualDoSalario = salario * 0.30;
        resultado.add(percentualDoSalario);
        percentualDoSalario = salario * 0.15;
        resultado.add(percentualDoSalario);
        percentualDoSalario = salario * 0.05;
        resultado.add(percentualDoSalario);

        for (double x : resultado
        ) {
            System.out.println("Percentuais do salário : " + x);
        }


    }
}
