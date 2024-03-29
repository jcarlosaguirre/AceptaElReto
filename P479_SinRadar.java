package Solved;
import java.util.Scanner;

public class P479_SinRadar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char[][] m;
		String fila;
		int x, y, casos, pos, a, b;
		boolean found;

		do {

			x = sc.nextInt();
			y = sc.nextInt();

			sc.nextLine();


			if (x != 0 && y != 0) {

				m = new char[x][y];	

				for (int i = 0; i < x; i++) {

					fila = sc.nextLine();
					m[i] = fila.toCharArray();

				}

				casos = sc.nextInt();

				for (int i = 0; i < casos; i++) {

					found = true;
					pos = 0;
					a = sc.nextInt() - 1;
					b = sc.nextInt() - 1;

					String ubi = sc.nextLine();
					switch (ubi) {
					case " ARRIBA":

						while (m[a][b] != 'X' && found) {
							a--;
							pos++;

							if (a < 0) {

								found = false;
								a++;
							}
						}

						break;

					case " DERECHA":

						while (m[a][b] != 'X' && found) {
							b++;
							pos++;

							if (b >= m[0].length) {

								found = false;
								b--;
							}
						}

						break;

					case " ABAJO":

						while (m[a][b] != 'X' && found ) {

							a++;
							pos++;

							if (a >= m.length) {

								found = false;
								a--;
							}
						}

						break;

					case " IZQUIERDA":

						while (m[a][b] != 'X' && found) {

							b--;
							pos++;

							if (b < 0) {

								found = false;
								b++;
							}
						}

						break;
					}

					if (found) System.out.println(pos);
					else System.out.println("NINGUNO");	

				}
				
				System.out.println("---");

			}

		} while (x != 0 && y != 0);

	}

}
