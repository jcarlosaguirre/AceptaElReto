package Solved;
import java.util.Scanner;

public class P515_PoniendoLaMesa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n, copas, viajes;

		do {

			n = sc.nextInt();
			copas = n;
			viajes = 0;

			if (n != 0) {
				
				while (copas != 0) {
					
					viajes++;
					
					if (copas == 2 && viajes % 2 == 0) {
						
						copas -= 2;
					}
					
					else copas--;
				}
				
				System.out.println(viajes);
				
			}


		} while (n != 0);



	}

}