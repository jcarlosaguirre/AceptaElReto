package Solved;
import java.util.Scanner;

public class P149_SanFermines {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int toros = sc.nextInt();
			int velToro, max = 0;

			for (int i = 0; i < toros; i++) {

				velToro = sc.nextInt();
				if (velToro > max) max = velToro;
			}

			System.out.println(max);
		}
	}

}
