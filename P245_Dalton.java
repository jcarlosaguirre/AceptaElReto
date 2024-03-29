package Solved;
import java.util.Scanner;

public class P245_Dalton {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long n, a, b;
		boolean mayor, valid;

		while (sc.hasNext()) {

			n = sc.nextLong();

			if (n == 0) break;

			mayor = false;
			valid = true;

			a = sc.nextLong();
			b = sc.nextLong();

			n -= 2;

			if (a > b) mayor = true;
			else if (a < b) mayor = false;
			else {
				
				sc.nextLine();
				n = 0;
				valid = false;
			}

			while (n != 0) {
				
				a = b;
				b = sc.nextLong();
				
				n--;

				if (mayor) {

					if (a <= b) {
						
						sc.nextLine();
						n = 0;
						valid = false;
					}

				}
				
				else {
					
					if (a >= b) {
						
						sc.nextLine();
						n = 0;
						valid = false;
					}
				}
			}
			
			if (valid) System.out.println("DALTON");
			else System.out.println("DESCONOCIDOS");

		}
	}
}


