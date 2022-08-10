package Solved;
import java.util.Scanner;

public class P538_EstoEraCampo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n, m;

		do {

			n = sc.nextInt();
			m = sc.nextInt();

			if (n != 0 || m != 0) {

				if (n >= m) System.out.println("CUERDO");
				else System.out.println("SENIL");

			}

		} while (n != 0 || m != 0);


	}

}
