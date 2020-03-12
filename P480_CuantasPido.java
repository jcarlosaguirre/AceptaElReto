package Solved;
import java.util.Scanner;

public class P480_CuantasPido {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		short casos = sc.nextShort();
		short uvas, malas, x;
		int total;

		
		for (int i = 0; i < casos; i++) {

			total = 0;
			uvas = sc.nextShort();
			malas = sc.nextShort();
			x = sc.nextShort();
			
			for (int j = 0; j <= uvas; j++) {
				
				if (j % x == 0) {
					
					if (uvas - j > malas) {
						
						total += malas;
					}
					
					else total += (uvas - j);
					
				}
				
			}
			
			System.out.println(total);
			
		}


	}

}
