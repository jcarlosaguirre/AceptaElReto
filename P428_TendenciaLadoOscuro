package Solved;
import java.util.Scanner;

public class P428_TendenciaLadoOscuro {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		int n, m;
		
		for (int i = 0; i < casos; i++) {

			
			n = sc.nextInt();
			m = 0;
			
			
			while (n / 5 > 0) {
				
				m = (n % 5 == 4) ? m + 1: m + 0;
				n = n / 5;
				
			}
			
			if (n == 4) m++;
			
			if (m >= 2) {
				
				System.out.println( "SI" );
			}
			
			else System.out.println( "NO" );
			
			
		}


	}

}
