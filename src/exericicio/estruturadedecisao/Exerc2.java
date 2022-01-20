package exericicio.estruturadedecisao;

import java.util.Arrays;
import java.util.Collections;

public class Exerc2 {
    public static void main(String[] args) {
        int[] numeros = {10,7,3,9,25,1};
        System.out.println("Array desordenado");
        for (int x:numeros) {
            System.out.print(x+"\t");
        }
        System.out.println("");
        System.out.println("************************");
        System.out.println("Array ordenado de forma crescente");
        Arrays.sort(numeros);
        for (int x:numeros) {
            System.out.print(x+"\t");
        }

    }


}
