package estruturacondicionais;

import java.util.Scanner;

public class Class15 {
    public static void main(String[] args) {
        double salario, percentualDoSalario;
        Scanner recebeSalario = new Scanner(System.in);

        System.out.print("Digite o seu salário: ");
        salario = recebeSalario.nextDouble();

        if(salario>4500){
            percentualDoSalario = salario*0.30;
            System.out.println("30% do salário: " + percentualDoSalario);
        }else {
            percentualDoSalario = salario*0.15;
            System.out.println("15% do salário: " + percentualDoSalario);
        }

    }
}
