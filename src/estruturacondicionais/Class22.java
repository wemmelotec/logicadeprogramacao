package estruturacondicionais;

import java.util.Scanner;

public class Class22 {
    public static void main(String[] args) {
        String nomeDoUsuario = null;
        Scanner loginDigitado = new Scanner(System.in);
        System.out.print("Digite o nome de usuário: ");
        nomeDoUsuario = loginDigitado.next();
        //nessas duas formas
        if("admin".equalsIgnoreCase(nomeDoUsuario) || nomeDoUsuario.equalsIgnoreCase("administrador")){
            System.out.println("O login digitado é inválido");
        }else{
            System.out.println("Login cadastrado com sucesso!");
        }
    }
}
