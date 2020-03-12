package Solved;
import java.util.Scanner;

public class P151_MatrizIdentidad {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n, suma;
		int[][] m;
		boolean id;

		do {

			n = sc.nextInt();

			if (n != 0) {

				suma = 0;
				id = true;
				m = new int[n][n];

				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {

						m[i][j] = sc.nextInt();

						suma += m[i][j];


					}
				}

				if (suma == n) {

					for (int i = 0; i < n; i++) {

						if (m[i][i] != 1) {

							id = false;
						}
					}

				}
				
				else {
					
					id = false;
				}

				if (id) System.out.println("SI");
				else System.out.println("NO");

			}






		} while (n != 0);
	}

}
