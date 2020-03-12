package Solved;
import java.util.Scanner;

public class P158_SaltosDeMario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		int muros, pos, next;
		
		
		for (int i = 0; i < casos; i++) {

			int up = 0;
			int down = 0;
			
			muros = sc.nextInt();
			pos = sc.nextInt();
			
			for (int j = 0; j < muros - 1; j++) {
				
				next = sc.nextInt();
				
				if ( pos > next) {
					
					down++;
					pos = next;
				} 
				
				else if (pos < next) {
					
					up++;
					pos = next;
				}
				
			}
			
			System.out.println(up + " " + down);
			
			
		}
		
		
	}

}
