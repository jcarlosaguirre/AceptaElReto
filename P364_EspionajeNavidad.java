package Solved;
import java.util.Scanner;

public class P364_EspionajeNavidad {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String s, s2;
		int x;
		
		
		do {

			x = 0;
			s = sc.nextLine();
			s2 = "";
			
			if (!s.contentEquals("FIN")) {
				
				for (int i = 0; i < s.length(); i++) {
					
					x = (int)s.charAt(i);
					s2 += (char)(x + 1);
							
					
				}
				
				s2 = s2.replace('!', ' ');
				s2 = s2.replace('[', 'A');
				
				System.out.println(s2);
			}
			
		} while (!s.contentEquals("FIN"));

	}

}
