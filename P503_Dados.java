package Solved;
import java.util.Arrays;
import java.util.Scanner;

public class P503_Dados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		int a, b;
		int[] repes;
		
		for (int i = 0; i < casos; i++) {
			
			a = sc.nextInt();
			b = sc.nextInt();
			
			repes = new int[a + b + 1];
			
			for (int j = 1; j <= a; j++) {
				
				for (int j2 = 1; j2 <= b; j2++) {
					
					repes[j + j2]++;
				}
			}
			
			
			String aux = "";
			int max = 0;
			
			for (int j = 2; j < repes.length; j++) {
				
				if (repes[j] == max) {
					
					aux += j + " ";
				}
				
				else {
					
					if (repes[j] > max) {
						
						aux = j + " ";
						max = repes[j];
					}
				}
				
			}
			
			
			System.out.println(aux.trim());
			
			
			
		}
		
	}

}
