package Solved;
import java.util.Scanner;

public class P217_ladoCalle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
			
			n = sc.nextInt();
			
			if (n == 0) break;
			if (n % 2 == 0) System.out.println("DERECHA");
			else System.out.println("IZQUIERDA");
			
				
		} while (n != 0);

	}

}
