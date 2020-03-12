package Solved;
import java.util.Scanner;

public class P119_EscudosRomanos {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int n, r, f, escudos;

		do {

			n = sc.nextInt();

			if (n != 0) {

				escudos = 0;
				r = n;

				while (r != 0) {

					f = (int)Math.floor(Math.sqrt(r));
					escudos += (int)(Math.pow(f, 2) + 8 + ((f - 2) * 4));

					r -= (int)Math.pow(f, 2);
				}

				System.out.println(escudos);
			}

		} while (n != 0);

	}

}
