import java.util.ArrayList;
import java.util.Scanner;

public class Class19 {
    public static void main(String[] args) {
        Scanner recebeNomeDoParticipante = new Scanner(System.in);
        Scanner recebeIdadeDoParticipante = new Scanner(System.in);
        Scanner recebeRespostaParaContinuar = new Scanner(System.in);
        int respostaParaContinuar = 0;
        ArrayList<Participante> listaDeParticipantes = new ArrayList<>();

        do {
            Participante participante = new Participante();
            System.out.print("Digite o nome do Participante: ");
            participante.setNome(recebeNomeDoParticipante.next());
            System.out.print("Digite a idade do Participante: ");
            participante.setIdade(recebeIdadeDoParticipante.nextInt());
            listaDeParticipantes.add(participante);

            System.out.println("Digite 1 para adicionar outro participante ou 2 para sair: ");
            respostaParaContinuar = recebeRespostaParaContinuar.nextInt();

        } while (respostaParaContinuar == 1);

        System.out.println("Total de participantes: " + listaDeParticipantes.size());

        for (Participante x : listaDeParticipantes
        ) {
            if (x.getIdade() < 10) {
                System.out.println(
                        "Nome: " + x.getNome()
                                + "\nidade: " + x.getIdade()
                                + "\nCategoria infantil");
                System.out.println("*************");
            } else if (x.getIdade() >= 11 && x.getIdade() <= 15) {
                System.out.println(
                        "Nome: " + x.getNome()
                                + "\nidade: " + x.getIdade()
                                + "\nCategoria juvenil");
                System.out.println("*************");
            } else if (x.getIdade() >= 16 && x.getIdade() <= 19) {
                System.out.println(
                        "Nome: " + x.getNome()
                                + "\nidade: " + x.getIdade()
                                + "\nCategoria pré-adulto");
                System.out.println("*************");
            } else {
                System.out.println(
                        "Nome: " + x.getNome()
                                + "\nidade: " + x.getIdade()
                                + "\nCategoria adulto");
                System.out.println("*************");
            }
        }
    }

}
