package exericicio.variaveistiposdadosconstantesoperadoresexpressoes;

import java.util.Scanner;

public class Exerc2 {
    public static void main(String[] args) {
        double ht, vh, sb, td, sl, percentual, pd;
        //int pd;
        String nomeDoFuncionario;
        Scanner input = new Scanner(System.in);
        System.out.println("Rotina para calculo de salários líquidos\n");
        System.out.print("Informe o nome do funcionário: ");
        nomeDoFuncionario = input.next();
        System.out.print("Informe a quantidade de horas trabalhadas: ");
        ht = input.nextDouble();
        System.out.print("Informe o valor da hora de trabalho: ");
        vh = input.nextDouble();
        sb = ht*vh;
        System.out.print("Informe o percentual de desconto: ");
        pd = input.nextDouble();
        percentual = pd/100;
        td = percentual*sb;
        sl = sb - td;
        System.out.println("***********************************");
        System.out.println("Salário base do funcionário " + nomeDoFuncionario + " \n " + sb);
        System.out.println("Salário liquído do funcionário " + nomeDoFuncionario + " \n " + sl);
    }
}
