package Solved;
import java.util.Scanner;

public class P166_Zapping {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int c, d, saltos, saltos2;

		do {
			c = sc.nextInt();
			d = sc.nextInt();

			if (c != 0 && d != 0) {
				if (c < d) {

					saltos = d - c;
					saltos2 = (99 + c) - d;

					if (saltos < saltos2) System.out.println(saltos);
					else System.out.println(saltos2);

				} 

				else {

					saltos = c - d;
					saltos2 = (99 + d) - c;

					if (saltos < saltos2) System.out.println(saltos);
					else System.out.println(saltos2);

				}
			}

		} while (c != 0 && d != 0);


	}

}
