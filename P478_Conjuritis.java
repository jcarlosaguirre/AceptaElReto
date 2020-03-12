package Solved;
import java.util.Scanner;

public class P478_Conjuritis {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;
		long total, vida, aBuscar;
		int[] hechizo;
		boolean in;

		do {
			
			total = 0;
			in = true;
					
			n = sc.nextInt();

			hechizo = new int[n];

			if (n >= 3) {

				for (int i = 0; i < n; i++) {

					hechizo[i] = sc.nextInt();
					total += hechizo[i];
				}

				vida = sc.nextLong();
				aBuscar = total - vida;

				for (int i = 0; in; i++) {

					for (int j = hechizo.length - 1; j > 0; j--) {

						if (hechizo[i] + hechizo[j] < aBuscar) {

							break;
						}

						else if (hechizo[i] + hechizo[j] == aBuscar) {

							System.out.println(hechizo[i] + " " + hechizo[j]);
							in = false;
							break;
						}


					}

				}


			}


		} while (n >= 3);

	}

}
