package Solved;

import java.util.Scanner;

public class P397_Multiplo3 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        long sum;

        for (int i = 0; i < casos; i++) {

            long num = sc.nextInt();
            sum = (num * (num + 1)) / 2;

            System.out.println( sum % 3 == 0 ? "SI":"NO");
        }

    }
}
