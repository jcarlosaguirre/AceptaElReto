package Solved;
import java.util.Scanner;

public class P475_CameoStanLee {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		
		sc.nextLine();
		
		int cameos, c;
		String frase, nombre = "stanlee";
		
		for (int i = 0; i < casos; i++) {
			
			cameos = 0;
			c = 0;
			
			frase = sc.nextLine();
			frase = frase.toLowerCase();
			
			
			for (int j = 0; j < frase.length(); j++) {
				
				if ( frase.charAt(j) ==  nombre.charAt(c)) {
					
					c++;
				}

				if (c == 7) {
					
					cameos++;
					c = 0;
				}
				
			}
			
			System.out.println(cameos);
			
			
		}

	}

}
