package Solved;
import java.util.Scanner;

public class P506_Tension {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		int a, b;
		
		for (int i = 0; i < casos; i++) {
			
			a = sc.nextInt();
			sc.next();
			b = sc.nextInt();
			
			if (a >= b) {
				 System.out.println("BIEN");
			}
			
			else System.out.println("MAL");
		}
	}

}
