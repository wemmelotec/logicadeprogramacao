package estruturacondicionais;

import java.util.Scanner;

public class Class27 {
    public static void main(String[] args) {
        String tipoDaConta;
        Scanner recebeTipoDaConta = new Scanner(System.in);
        System.out.println("Informe o tipo de sua conta: ");
        tipoDaConta = recebeTipoDaConta.next();

        switch (tipoDaConta){
            case "poupanca":
                System.out.println("percentual da conta poupança é 0.05%");
                break;
            case "corrente":
                System.out.println("percentual da conta corrente é 0.02%");
                break;
            case "investimento":
                System.out.println("percentual da conta investimento é 0.1%");
                break;
            default:
                System.out.println("A conta informada é inválida");
        }
    }
}
