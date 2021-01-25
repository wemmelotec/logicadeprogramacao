package variaveis;

import sun.swing.StringUIClientPropertyKey;

public class Class12 {
    public static void main(String[] args) {
        System.out.println("****************Char***************");
        char caracter = 89;
        char masculino = 'M', feminino ='F';
        System.out.println(caracter);
        caracter = 'A';
        System.out.println(caracter);
        System.out.println(masculino+feminino);
        System.out.println(""+masculino+feminino);//qdo inicio a impressão com string o java entende que o resto será string
        System.out.println("****************String***************");
        String masculinoS = "M", femininoS = "F";
        System.out.println(masculinoS+femininoS);//na variavel do tipo string sempre o Java verá como string
        System.out.println("****************boolean***************");
        boolean condicao = false;//nesse momento ele é um boolean
        boolean condicao2 = true;
        System.out.println(""+ condicao + condicao2);//nesse momento passa a ser String
    }
}
