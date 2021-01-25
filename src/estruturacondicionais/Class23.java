package estruturacondicionais;

import java.util.Scanner;

public class Class23 {
    public static void main(String[] args) {
        String sexo;
        Scanner sexoInformado = new Scanner(System.in);
        System.out.print("Informe o seu sexo M para masculino ou F para feminino: ");
        sexo = sexoInformado.next();
        if("M".equalsIgnoreCase(sexo) || "F".equalsIgnoreCase(sexo)){
            int idade;
            Scanner idadeInformada = new Scanner(System.in);
            System.out.print("Digite sua idade: ");
            idade = idadeInformada.nextInt();
            if("M".equalsIgnoreCase(sexo) && idade >= 18){
                System.out.println("Alistamento obrigatório");
            }else if("M".equalsIgnoreCase(sexo) && idade < 18){
                System.out.println("Alistamento não permitido");
            }else if("F".equalsIgnoreCase(sexo) && idade >= 18){
                System.out.println("Alistamento opcional");
            }else if("F".equalsIgnoreCase(sexo) && idade < 18){
                System.out.println("Alistamento não permitido");
            }
        }else{
            System.out.println("O sexo informado é inválido");
        }
    }
}
