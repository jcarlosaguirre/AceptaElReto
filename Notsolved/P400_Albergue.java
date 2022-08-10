package Solved.Notsolved;

import java.util.Scanner;

public class P400_Albergue {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {

            String linea = sc.nextLine();
            int puntosActuales = 0;
            int x = 0, aux = 0;
            int puntos = 0;

            for (int i = 0; i < linea.length(); i++) {
                if (linea.charAt( i ) == 'X'){
                    x++;

                    if(puntos >= puntosActuales){
                        puntosActuales = Math.max(puntos, puntosActuales);
                    }

                    if (puntosActuales % 2 == 1) {
                        if(x > 1) aux = ( (int)( (double) puntosActuales/2 )  );
                        else aux = ( (int)( (double) puntosActuales/2 )  + 1  );
                    }
                    else {
                        if(x > 1) aux = ( (int)( (double)puntosActuales/2) - 1 );
                        else aux = ( (int)( (double)puntosActuales/2) );
                    }

                    puntos = 0;
                }
                else puntos++;
            }

            System.out.println( aux );

        }

    }

}
