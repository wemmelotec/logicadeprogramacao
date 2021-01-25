package exericicio.lacosderepeticao;

import static java.lang.Math.pow;

public class Exerc1 {
    public static void main(String[] args) {
        for(int i = 15; i<=200; i++){
            //System.out.println("Número: " + i + " e seu quadrado " + (int)pow(i,2));
            System.out.printf("Número: %d e seu quadrado é %d%n",i, (int)pow(i,2));
        }
    }
}
