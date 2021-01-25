package variaveis;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculadoraPercentualSalario {

        public static void main(String[] args) {

                double valorSalario;
                double percentual = 0.10;
                double percentualDoSalario;

                Scanner recebeValorSalario = new Scanner(System.in);
                System.out.print("Digite o valor de seu salario: ");
                valorSalario = recebeValorSalario.nextDouble();
                percentualDoSalario = valorSalario * percentual;

                System.out.println("Sem o formatador: " + percentualDoSalario);

                DecimalFormat format = new DecimalFormat("0.00");
                System.out.println("Com o formatador: "+ format.format(percentualDoSalario) + "R$");
        }


}



