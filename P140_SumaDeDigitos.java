package Solved;
import java.util.Scanner;

public class P140_SumaDeDigitos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;

		do {

			 n = sc.nextInt();
			int suma = 0;
			String s;
			char c;

			if (n >= 0) {

				s = Integer.toString(n);

				for (int i = 0; i < s.length(); i++) {

					if (i == s.length() - 1) {

						System.out.print(s.charAt(i) + " = ");
					}

					else System.out.print(s.charAt(i) + " + ");

					c = s.charAt(i);
					suma += Character.getNumericValue(c);
				}

				System.out.println(suma);

			} else break;

		} while (n >= 0);



	}

}
