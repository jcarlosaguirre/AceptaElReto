package Solved;
import java.util.Scanner;

public class P369_ContandoEnArena {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x;
		
		do {
			
			x = sc.nextInt();
			
			if (x != 0) {
				
				for (int i = 0; i < x; i++) {
					
					System.out.print(1);
				}
				
				System.out.println();
			}
			
			
		} while (x != 0);

	}

}
