package Solved;
import java.util.Scanner;

public class P533_BotellaGanadora {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		int  CO, botella, x;

		System.out.println(Short.MAX_VALUE);
		for (int i = 0; i < casos; i++) {

			botella = 0;
			CO = sc.nextInt() * 1000;

			do {

				x = sc.nextInt();
				
				if (CO > 0){

					botella ++;
					CO -= x * 125;
				}

			} while (x != 0 );

			if (CO > 0) System.out.println("SIGAMOS RECICLANDO");
			else System.out.println(botella);

		}

	}

}
