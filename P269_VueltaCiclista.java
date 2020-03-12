package Solved;
import java.util.Scanner;

public class P269_VueltaCiclista {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		int n, total, aux;
		
		for (int i = 0; i < casos; i++) {
			
			total = 0;
			aux = 0;
			
			do {
				
				n = sc.nextInt();
				
				if (n != 0) {

					total += aux + n;
					aux += n;
				}
				
			} while (n != 0);
			

			total *= 2;
			System.out.println(total);
			
		}

	}

}
