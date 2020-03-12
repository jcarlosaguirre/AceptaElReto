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

			// Recojo el numero y lo meto caracter a caracter en un Vector
			n = sc.next();
			vector = n.toCharArray();

			aux = "";
			res = 0;
			count = 0;

			if (!n.contentEquals("6174")) {

				while(res != 6174 && count != 8) {

					// Ordeno el Vector de menor a mayor
					Arrays.sort(vector);

					n = "";
					m = "";

					for (int j = 0, k = vector.length - 1; j < vector.length; j++, k--) {

						// "n" contiene el numero ascendente (menor) y "m" el descendente (mayor)
						n = n + vector[j];
						m = m + vector[k];

					}

					// Añade "0" a la izquierda hasta que conste de 4 digitos
					n = String.format("%04d", Integer.parseInt(n));
					
					// Añade "0" a la derecha hasta que conste de 4 digitos
					m = Integer.toString(Integer.parseInt(m) * (int)(Math.pow(10, 4 - m.length())));

					// Guardamos el resto y si cumple las condiciones del While lo utiliza para el bucle
					// sino finaliza
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
