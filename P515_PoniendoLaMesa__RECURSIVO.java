package Solved;
import java.util.Scanner;

public class P515_PoniendoLaMesa__RECURSIVO {

	public static int viajes(int copas, int viaje) {

		if (copas != 0) {

			viaje++;

			if (copas == 2 && viaje % 2 == 0) {

				return viajes(copas - 2, viaje);
			}
			
			else {	
				
				return viajes(copas - 1, viaje);
			}
		}

		return viaje;
	}
  
  
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n, viaje;

		do {

			n = sc.nextInt();

			if (n != 0) {

				viaje = viajes(n, 0);

				System.out.println(viaje);
			}


		} while (n != 0);

	}

}