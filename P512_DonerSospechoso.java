package Solved;
import java.util.Scanner;

public class P512_DonerSospechoso {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt();
		int conejo, caballo;
		
		for (int i = 0; i < casos; i++) {
			
			conejo = sc.nextInt();
			caballo = sc.nextInt();
			
			System.out.println((conejo * 100) / (conejo + caballo));
			
		}

	}

}
