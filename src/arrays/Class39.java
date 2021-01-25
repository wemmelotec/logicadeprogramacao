package arrays;

public class Class39 {
    public static void main(String[] args) {
        int[] v1 = {1,2,3,4,5,6,7,8,9};
        int[] v2 = {2,3,4,5,6,7,8,9,0};
        int[] vR = new int[9];

        for (int i = 0; i < vR.length; i++) {
            vR[i]=v1[i]*v2[i];
            System.out.print(vR[i]+"\t");
        }
    }
}
