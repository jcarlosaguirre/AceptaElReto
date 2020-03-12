package Solved;
import java.util.Scanner;

public class P427_YoSoyTu {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		
		for (int i = 0; i < casos; i++) {
			
			String nombre = sc.next();
			String parentesco = sc.next();
			
			if (nombre.contentEquals("Luke") && parentesco.contentEquals("padre")) {
				
				System.out.println("TOP SECRET");
			}
			
			else {
				
				System.out.println(nombre + ", yo soy tu " + parentesco);
			}
			
			
		}
		

	}

}
