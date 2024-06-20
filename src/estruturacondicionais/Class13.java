package estruturacondicionais;

public class Class13 {
    public static void main(String[] args) {
        System.out.println("***Controle de fluxo if-else***");
        if (true) {
            System.out.println("Dentro do IF");
        }
        System.out.println("Fora do IF");
        if (false) {
            System.out.println("Dentro do IF");
        }
        System.out.println("Fora do IF");
        System.out.println("***Outro exemplo***");
        boolean condicao = true;
        if (condicao) {
            System.out.println("Dentro do IF");
        }
        System.out.println("Fora do IF");
        System.out.println("***If e Else***");
        condicao = false;
        if (condicao) {
            System.out.println("Dentro do IF");
        } else {
            System.out.println("Dentro do Else");
        }
        System.out.println("Fora do IF");
    }
}
