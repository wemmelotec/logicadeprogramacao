public class ConhecendoOPrint {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 30;
        System.out.printf("Soma das variáveis num1 e num2 = %d\n",(num1 + num2));

        System.out.printf("Mostrando o primeiro nome %s\n e o segundo nome %s\n","wellington", "gustzvo");

        for (int i=1; i<=10000;i++){
            System.out.print("contagem: \r"+i);
        }
    }
}
