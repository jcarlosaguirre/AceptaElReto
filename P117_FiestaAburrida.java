package Solved;
import java.util.Scanner;

public class P117_FiestaAburrida {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		sc.nextLine();
		String s1;
		
		for (int i = 0; i < casos; i++) {
			s1 = sc.nextLine();
			System.out.println("Hola, " + s1.substring(4) + ".");
		}
	}
}
