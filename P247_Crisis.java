package Solved;
import java.util.Scanner;

public class P247_Crisis {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;

		do {

			boolean razon = true;

			n = sc.nextInt();

			if (n != 0) {

				int min = sc.nextInt();
				
				for (int i = 0; i < n - 1; i++) {

					int next = sc.nextInt();
					
					if (min >= next) {
						
						razon = false;
					}
					
					min = next;
				}

				
				
				if (razon) {
					
					System.out.println("SI");
				}
				
				else System.out.println("NO");

			}
			
			

		} while (n != 0);

	}

}
