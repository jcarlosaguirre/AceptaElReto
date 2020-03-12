package Solved;
import java.util.Scanner;

public class P102_Encriptacion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s;
		int lett, count, vocal;
		char[] coded;

		do {

			// Incluyo la siguiente linea caracter a caracter en el Vector
			coded = sc.nextLine().toCharArray();
			count = 0;
			vocal = 0;
			s = "";

			// Hasta que el codigo de la primera letra coincida con el codigo de "p", suma o resta
			while (coded[0] != 112) {

				if (coded[0] > 112) {

					coded[0]--;
					count--;
				}

				else {

					coded[0]++;
					count++;
				}
			}

			for (int i = 1; i < coded.length; i++) {

				// Cojo el valor de cada letra de la frase y le aplico suma o resta
				// dependiendo de su valor inicial
				lett = coded[i];
				
				// En estos if identificamos MAYUSCULAS y minusculas
				if (lett > 64 && lett < 91) {

					coded[i] += count;
					
					if (coded[i] < 65) coded[i] = (char)(91 - Math.abs(count + (lett - 65)));
					else if (coded[i] > 90) coded[i] = (char)(64 + (count - Math.abs(lett - 90)));
				}
				
				else if (lett > 96 && lett < 123) {

					coded[i] += count;
					
					if (coded[i] < 97) coded[i] = (char)(123 - Math.abs(count + (lett - 97)));
					else if (coded[i] > 122) coded[i] = (char)(96 + (count - Math.abs(lett - 122)));
				}
				
				// Sumamos al contador de vocales si la posicion coincide
				if (coded[i] == 'a' || coded[i] == 'e' || coded[i] == 'i' || 
					coded[i] == 'o' || coded[i] == 'u' || coded[i] == 'A' || 
					coded[i] == 'E' || coded[i] == 'I' || coded[i] == 'O' || 
					coded[i] == 'U' ) {

					vocal++;
				}
				
				// Solo si la frase puede resultar en "FIN" la almacenamos para la comprobacion
				if (coded.length == 4) s = s + coded[i];
				
			}
			
			if ( s.contentEquals("FIN")) break;
			
			else System.out.println(vocal);
			
		} while ( !s.contentEquals("FIN"));

	}

}
