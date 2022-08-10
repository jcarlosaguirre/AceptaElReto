package Solved.Notsolved;

import java.util.Scanner;

public class P424_Ahorros {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int casos, suma, mayorSuma;

		do {

			casos = sc.nextInt();

			if( casos == 0 ) break;

			suma = 0;
			mayorSuma = 0;

			for (int i = 0; i < casos; i++) {

				suma += sc.nextInt();
				if (suma > mayorSuma) mayorSuma = suma;
			}

			System.out.println( suma + " " + mayorSuma );

		} while(casos != 0);

	}

}