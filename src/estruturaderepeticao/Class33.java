package estruturaderepeticao;

import java.util.ArrayList;

public class Class33 {
    public static void main(String[] args) {
        ArrayList<Integer> numerosP = new ArrayList();
        ArrayList<Integer> numerosI = new ArrayList();
        for (int contador = 0; contador <= 50; contador++) {
            if (contador % 2 == 0) {
                numerosP.add(contador);
            }else {
                numerosI.add(contador);
            }
        }
        System.out.println("Números pares");
        for (int x:numerosP
             ) {
            System.out.print(x+"\n");
            
        }
    }
}
