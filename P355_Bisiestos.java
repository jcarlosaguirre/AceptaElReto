package Solved;

import java.util.Scanner;

public class P355_Bisiestos {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();

        for (int i = 0; i < casos; i++) {

            int num = sc.nextInt();

            if(num % 4 == 0 && num % 100 != 0){
                System.out.println( 29 );
            }
            else if (num % 100 == 0 && num % 400 == 0){
                System.out.println( 29 );
            }
            else{
                System.out.println( 28 );
            }
        }

    }

}
