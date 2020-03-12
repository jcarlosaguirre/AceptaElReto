package Solved;
import java.util.Scanner;

public class P338_DetectandoCopiones {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N, K, detectado, copiado, x;
		int[] respuestas;

		while (sc.hasNext()) {

			N = sc.nextInt();
			K = sc.nextInt();

			detectado = 0;
			copiado = 0;

			respuestas = new int[100001];

			for (int i = 1; i <= N; i++) {

				x = sc.nextInt();

				if (respuestas[x] != 0) {

					copiado++;

					if (i - respuestas[x] <= K ){

						detectado++;
					}
				}
				
				respuestas[x] = i;
			}

			System.out.println(copiado + " " + detectado);

		}



	}


}


