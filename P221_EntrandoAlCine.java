package Solved;
import java.util.Scanner;

public class P221_EntrandoAlCine {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int pares;
		int casos = sc.nextInt();
		int[] numero;
		boolean puerta;

		for (int i = 0; i < casos; i++) {
			
			pares = 0;
			puerta = true;
			numero = new int[sc.nextInt()];

			if (puerta) {

				for (int j = 0; j < numero.length; j++) {

					numero[j] = sc.nextInt();

					if (numero[j] % 2 == 0) pares++;

					if (j > 0 && numero[j] % 2 == 0 && numero[j - 1] % 2 == 1) {

						puerta = false;
					}

				}

			}

			if (puerta) System.out.println("SI " + pares);
			else System.out.println("NO");

		}


	}

}
