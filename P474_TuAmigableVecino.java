package Solved;
import java.util.Scanner;

public class P474_TuAmigableVecino {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		int m = 0;
		int n = 0;
		
		for (int i = 0; i < casos; i++) {
			
			int S = sc.nextInt();
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			m = Math.abs(S - A);
			n = Math.abs(S - B);
			
			if (m < n) {

				m = Math.abs(S - A);
				m += Math.abs(A - B);
			}
			
			else {

				m = Math.abs(S - B);
				m += Math.abs(B - A);
			}
			
			System.out.println(m);
			
		}

	}

}
