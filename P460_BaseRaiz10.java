package Solved;
import java.util.Scanner;

public class P460_BaseRaiz10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String numero;
		String base;

		while (sc.hasNext()) {

			numero = sc.nextLine();
			base = "";

			for (int i = 0; i < numero.length(); i++) {
				
				base += numero.charAt(i);
				
				if (!(i == numero.length() - 1)) {

					base += '0';
				}
				
			}
			
			System.out.println(base);

		}

	}

}
