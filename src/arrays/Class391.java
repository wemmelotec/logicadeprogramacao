package arrays;

public class Class391 {
    public static void main(String[] args) {
        int[] v1 = new int[9];
        int[] v2 = new int[9];
        int[] vR = new int[9];
        for (int i = 1; i < v1.length; i++) {
            v1[i] = i;
            v2[i] = i + 1;
            vR[i] = v1[i] * v2[i];
            System.out.println(v1[i] + " x " + v2[i] + " = " + vR[i]);
        }
    }
}
