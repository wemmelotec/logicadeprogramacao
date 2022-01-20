package hackerhank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if(n%2 == 0){
            if(n >= 2 && n <= 5){
                System.out.println("Not Weird");
            }else if(n >= 6 && n <= 20){
                System.out.println("Weird");
            }else if(n > 20){
                System.out.println("Not Weird");
            }
        }else{
            System.out.println("Weird");
        }
//        if (n >= 1 && n <= 100) {
//            if (n == 1) {
//                System.out.println("Not Weird");
//            } else if (n >= 2 && n <= 5) {
//                System.out.println("Not Weird");
//            } else if (n >= 6 && n <= 20) {
//                System.out.println("Weird");
//            } else {
//                System.out.println("Not Weird");
//            }
//        } else {
//            System.out.println("Fora do escopo");
//        }

    }
}
