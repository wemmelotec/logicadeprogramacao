package arrays;

public class Class42 {
    public static void main(String[] args) {
        int[][] arrayMulti = new int[2][2];
        arrayMulti[0][0]=3;
        arrayMulti[0][1]=5;
        arrayMulti[1][0]=10;
        arrayMulti[1][1]=8;

        int diagonal = arrayMulti[0][0]*arrayMulti[1][1];

        System.out.println(diagonal);

    }
}
