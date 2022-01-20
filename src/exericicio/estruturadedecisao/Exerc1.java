package exericicio.estruturadedecisao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exerc1 {
    public static void main(String[] args) {
        List<Float> notas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        float somatorio = 0, media;
        for (int i = 0; i < 4; i++) {
            System.out.printf("Informe a nota do %d bimestre: ", i + 1);
            notas.add(scanner.nextFloat());
        }
        for (float x : notas) {
            somatorio = somatorio + x;
        }
        media = somatorio / 4;
        if(media<5.0F){
            System.out.println("Infelizmente você foi reprovado");
        }else if(media == 5.0){
            System.out.println("Você ficou em recuperação");
        }else {
            System.out.println("Você foi aprovado");
        }

    }
}
