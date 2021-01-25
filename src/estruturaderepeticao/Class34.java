package estruturaderepeticao;

public class Class34 {
    public static void main(String[] args) {
        System.out.print("Tab 1\t\tTab 2\t\tTab 3\t\tTab 4\t\tTab 5\t\tTab 6\t\tTab 7\t\tTab 8\t\tTab 9\t\tTab 10");
        for (int col1 = 1; col1 <= 10; col1++) {
            System.out.println("");
            for (int col2 = 1; col2 <= 10; col2++) {
                System.out.print(col1 + "+" + col2 + "=" + (col1 + col2) + "\t\t");
            }
        }

    }
}
