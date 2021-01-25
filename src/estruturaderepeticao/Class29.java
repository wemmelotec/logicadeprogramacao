package estruturaderepeticao;

import java.util.Scanner;

public class Class29 {
    public static void main(String[] args) {
        int contador = 0;
        int valorLimiteInformadoPeloUsuario;

        Scanner valorLimiteInformadoPeloUsuarioRecebido = new Scanner(System.in);
        System.out.println("Informe o até que valor você quer descobrir os números ímpares? ");
        valorLimiteInformadoPeloUsuario = valorLimiteInformadoPeloUsuarioRecebido.nextInt();

        while (contador <= valorLimiteInformadoPeloUsuario) {

            if (contador % 2 != 0){
                System.out.println("Número ímpar: " + contador);
            }
            contador++;
        }
    }
}
