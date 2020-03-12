package Solved;
import java.util.Scanner;

public class P165_Hyperpar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		char c;
		String s;
		boolean SI;

		do {

			SI = true;
			n = sc.nextInt();

			if (n >= 0) {
				
				s = Integer.toString(n);
				
				for (int i = 0; i < s.length(); i++) {
					
					c = s.charAt(i);
					
					if (Character.getNumericValue(c) % 2 == 1) {
						
						SI = false;
						break;
					}
				}
				
				if (SI) System.out.println("SI");
				else System.out.println("NO");
				

			}

		} while (n >= 0);

	}

}
