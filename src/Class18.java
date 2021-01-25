import java.util.ArrayList;
import java.util.List;

public class Class18 {
    public static void main(String[] args) {
        List<Participante> participantes = new ArrayList<Participante>();
        Participante p1 = new Participante("Gustavo",12);
        Participante p2 = new Participante("Laura", 1);
        Participante p3 = new Participante("Silvana", 19);
        Participante p4 = new Participante("Wellington", 37);
        participantes.add(p1);
        participantes.add(p2);
        participantes.add(p3);
        participantes.add(p4);

        System.out.println("Total de participantes: " + participantes.size());

        for (Participante x: participantes) {
            if(x.getIdade() < 10){
                System.out.println(
                        "Nome: " + x.getNome()
                                + "\nidade: " + x.getIdade()
                                + "\nCategoria infantil");
                System.out.println("*************");
            } else if(x.getIdade() >=11 && x.getIdade() <= 15){
                System.out.println(
                        "Nome: " + x.getNome()
                                + "\nidade: " + x.getIdade()
                                + "\nCategoria juvenil");
                System.out.println("*************");
            } else if (x.getIdade()>=16 && x.getIdade()<=19){
                System.out.println(
                        "Nome: " + x.getNome()
                                + "\nidade: " + x.getIdade()
                                + "\nCategoria pré-adulto");
                System.out.println("*************");
            }else {
                System.out.println(
                        "Nome: " + x.getNome()
                                + "\nidade: " + x.getIdade()
                                + "\nCategoria adulto");
                System.out.println("*************");
            }
        }
    }
}
