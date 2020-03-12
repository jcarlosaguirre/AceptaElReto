package Solved;
import java.util.Scanner;

public class P536_HuertoEcologico {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N;
		int[][] terrenos;
		String[] contacto;


		while (sc.hasNext()) {

			N = sc.nextInt();
			terrenos = new int[4][2];
			contacto = new String[2];


			terrenos[0][0] = sc.nextInt();
			terrenos[3][0] = sc.nextInt();
			terrenos[1][0] = sc.nextInt();
			terrenos[2][0] = sc.nextInt();

			contacto[0] = sc.nextLine().trim();


			for (int i = 1; i < N; i++) {

				terrenos[0][1] = sc.nextInt();
				terrenos[3][1] = sc.nextInt();
				terrenos[1][1] = sc.nextInt();
				terrenos[2][1] = sc.nextInt();

				contacto[1] = sc.nextLine().trim();


				if (terrenos[0][0] < terrenos[0][1]) {

					terrenos[0][0] = terrenos[0][1];
					terrenos[3][0] = terrenos[3][1];
					terrenos[1][0] = terrenos[1][1];
					terrenos[2][0] = terrenos[2][1];

					contacto[0] = contacto[1];

				}

				else if (terrenos[0][0] == terrenos[0][1] && terrenos[1][0] > terrenos[1][1]){

					terrenos[0][0] = terrenos[0][1];
					terrenos[3][0] = terrenos[3][1];
					terrenos[1][0] = terrenos[1][1];
					terrenos[2][0] = terrenos[2][1];

					contacto[0] = contacto[1];

				}

				else if (terrenos[0][0] == terrenos[0][1] && terrenos[1][0] == terrenos[1][1] && terrenos[2][0] > terrenos[2][1]){

					terrenos[0][0] = terrenos[0][1];
					terrenos[3][0] = terrenos[3][1];
					terrenos[1][0] = terrenos[1][1];
					terrenos[2][0] = terrenos[2][1];

					contacto[0] = contacto[1];

				}

				else if (terrenos[0][0] == terrenos[0][1] && terrenos[1][0] == terrenos[1][1] && terrenos[2][0] == terrenos[2][1] && terrenos[3][0] > terrenos[3][1]){

					terrenos[0][0] = terrenos[0][1];
					terrenos[3][0] = terrenos[3][1];
					terrenos[1][0] = terrenos[1][1];
					terrenos[2][0] = terrenos[2][1];

					contacto[0] = contacto[1];

				}



			}
			
			System.out.println(contacto[0]);


		}


	}

}
