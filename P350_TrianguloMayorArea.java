package Solved;
import java.util.Scanner;

public class P350_TrianguloMayorArea {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a, b;
		double c;

		do {
			a = sc.nextInt();
			b = sc.nextInt();

			if ((a != 0) && (b != 0)) {
				c = 0.5*a*b;

				System.out.printf("%.1f\n", c);
			}

		} while ((a != 0) && (b != 0));

	}

}
