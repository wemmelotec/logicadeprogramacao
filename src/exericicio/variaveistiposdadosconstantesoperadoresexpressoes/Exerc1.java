package exericicio.variaveistiposdadosconstantesoperadoresexpressoes;
import java.util.Scanner;
import static java.lang.Math.pow;

public class Exerc1 {
    public static void main(String[] args) {
        int raio;
        double area;
        final double PI = 3.141592654;
        Scanner recebeRaioInformadoPeloUsuario = new Scanner(System.in);

        System.out.println("Este programa irá calcular a área de um círculo com o raio informado pelo usuário\n");
        System.out.print("Informe o raio: ");
        raio = recebeRaioInformadoPeloUsuario.nextInt();

        area = PI * pow(raio, 2);
        System.out.println("\nA área do círculo é: " + area);

    }
}
