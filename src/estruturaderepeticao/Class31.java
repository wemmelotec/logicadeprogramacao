package estruturaderepeticao;

import java.util.Scanner;

public class Class31 {
    public static void main(String[] args) {
        final String LOGIN_CORRETO = "admin";
        final String SENHA_CORRETA = "admin123";
        String loginInformadoPeloUsuario, senhaInformadaPeloUsuario;
        boolean chaveador = true;
        Scanner input = new Scanner(System.in);

        while (chaveador) {
            System.out.println("Digite seu usuário: ");
            loginInformadoPeloUsuario = input.next();
            System.out.println("Digite sua senha: ");
            senhaInformadaPeloUsuario = input.next();

            if (LOGIN_CORRETO.equalsIgnoreCase(loginInformadoPeloUsuario)
                    && SENHA_CORRETA.equalsIgnoreCase(senhaInformadaPeloUsuario)) {
                System.out.println("Acesso concedido");
                chaveador = false;
            } else {
                System.out.println("Acesso Negado");
            }
        }

    }
}
