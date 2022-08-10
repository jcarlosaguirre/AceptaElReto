package Solved.Notsolved;

import java.util.Scanner;

public class P472_CaminandoVoy {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int desnivel, cotas;

        while( sc.hasNext() ) {

            desnivel = sc.nextInt();
            cotas = sc.nextInt();
            sc.nextLine();


            int sum = 0, current = 0, actual = 0, anterior = sc.nextInt();

            for (int i = 1; i < cotas - 1; i++) {

                actual = sc.nextInt();

                sum += actual - anterior;
                if ( sum <= current ) sum = 0;
                else if (sum > desnivel) {
                    System.out.println("NO APTA");
                    break;
                }

                current = sum;
                System.out.println( anterior );
                anterior = actual;
            }


            if (sum <= desnivel) {
                System.out.println("APTA");
            }


        };

    }

}
