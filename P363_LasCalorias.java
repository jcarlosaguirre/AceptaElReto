package Solved;
import java.util.Scanner;

public class P363_LasCalorias {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		short e, n;
		int suma;

		do {

			e = sc.nextShort();

			if (e != 0) {

				n = sc.nextShort();
				suma = 0;
				
				for (int i = 0; i < n; i++) {
					
					suma += sc.nextShort();
				}
				
				if (suma % e == 0) System.out.println(suma / e);
				
				else System.out.println(suma / e + 1);
				
			}

		} while (e != 0);

	}

}
