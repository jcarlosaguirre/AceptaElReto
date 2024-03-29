package Solved;
import java.util.Scanner;

public class P482_Calcetines {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s;
		char c;
		int negro, gris;

		do {

			s = sc.nextLine();

			if (!(s.contentEquals("."))) {

				s = s.replace(" ", "");
				negro = 0;
				gris = 0;

				for (int i = 0; i < s.length() - 1; i++) {

					c = s.charAt(i);

					if (c == 'N') {

						if (negro == 0) negro++;
						else negro--;
					}

					else {

						if (gris == 0) gris++;
						else gris--;
					}
				}

				if (negro == 0 && gris == 0) System.out.println("EMPAREJADOS");
				else if (negro == 1 && gris == 0) System.out.println("NEGRO SOLITARIO");
				else if (negro == 0 && gris == 1) System.out.println("GRIS SOLITARIO");
				else System.out.println("PAREJA MIXTA");
			}


		} while (!(s.contentEquals(".")));

	}

}
