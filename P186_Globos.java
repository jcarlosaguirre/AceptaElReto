package Solved;
import java.util.Scanner;

public class P186_Globos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int equipos, globos, n, max, pos;
		boolean empate = false;
		int[] equipo;

		do {

			equipos = sc.nextInt();
			globos = sc.nextInt();
			max = -1;
			pos = 0;
			n = 0;

			if (equipos != 0 || globos != 0) {

				equipo = new int[equipos];

				for (int i = 0; i < globos; i++) {

					n = sc.nextInt();
					sc.nextLine();

					equipo[n - 1]++;
				}
				
				for (int i = 0; i < equipo.length; i++) {
					
					if (equipo[i] > max) {

						max = equipo[i];
						pos = i;
						empate = false;
					}
					
					else if (equipo[i] == max) empate = true;
					
				}

				System.out.println( (empate) ? "EMPATE" : pos + 1);

			}

		} while (equipos != 0 || globos != 0);

	}

}