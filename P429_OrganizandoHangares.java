package Solved;
import java.util.Scanner;

public class P429_OrganizandoHangares {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		short h, n;
		int max, pos;
		int[] h2, n2;
		boolean cabe;

		do {

			cabe = true;
			
			h = sc.nextShort();

			if (h != 0) {

				h2 = new int[h];
				
				// Tamaño hangares
				for (int i = 0; i < h2.length; i++) {
					
					h2[i] = sc.nextInt();
				}
				
				
				n = sc.nextShort();
				n2 = new int[n];
				
				//Tamaño naves
				for (int i = 0; i < n2.length; i++) {
					
					max = 0;
					pos = 0;
					
					for (int j = 0; j < h2.length; j++) {
						
						if (h2[j] > max) {
							
							max = h2[j];
							pos = j;
							
						}
					}
					
					n2[i] = sc.nextInt();
					
					
					if (n2[i] <= max) {
						
						h2[pos] -= n2[i];
					}
					
					else cabe = false;
					
				}
				
				if (cabe) System.out.println("SI");
				
				else System.out.println("NO");
				
				
			}

		} while (h != 0);

	}

}
