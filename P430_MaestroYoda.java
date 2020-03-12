package Solved;
import java.util.Scanner;

public class P430_MaestroYoda {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n, total, suma;
		int[][] m;

		do {

			n = sc.nextInt();

			if (n != 0) {

				suma = 0;
				total = 0;
				m = new int[n][2];

				for (int i = 0; i < m.length; i++) {

					for (int j = 0; j < m[i].length; j++) {

						m[i][j] = sc.nextInt();
					}


					if (total < m[i][0]) {

						total = m[i][0];
					}

					else if (total == m[i][0]) {

						total += m[i][1];

					}

					else if (total > m[i][0]) {

						suma = m[i][0];
						while ( suma <= total) {

							suma += m[i][1];

						}


						if (suma > total) total += (suma - total);
						else total += total - suma;
					}

				}
				
				System.out.println(total);
			}

		} while (n != 0);

	}
}