package Solved;

import java.util.Arrays;
import java.util.Scanner;

public class P100_Kaprekar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String n, m, aux;
		int count, res;
		char[] vector = new char[4];
		int casos = sc.nextInt();


		for (int i = 0; i < casos; i++) {

			n = sc.next();
			vector = n.toCharArray();

			aux = "";
			res = 0;
			count = 0;

			if (!n.contentEquals("6174")) {

				while(res != 6174 && count != 8) {

					Arrays.sort(vector);

					n = "";
					m = "";

					for (int j = 0, k = vector.length - 1; j < vector.length; j++, k--) {

						n = n + vector[j];
						m = m + vector[k];

					}

					n = String.format("%04d", Integer.parseInt(n));
					m = Integer.toString(Integer.parseInt(m) * (int)(Math.pow(10, 4 - m.length())));

					res = (Integer.parseInt(m) - Integer.parseInt(n));
					aux = Integer.toString(res);
					vector = aux.toCharArray();

					if (aux.contentEquals("0")) count = 8;
					else count++;

				}
			}

			System.out.println(count);
		}


	}

}