package Solved;
import java.util.Scanner;

public class P362_Navidad {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		int dia, mes;
		
		for (int i = 0; i < casos; i++) {
			dia = sc.nextInt();
			mes = sc.nextInt();
			
			if (dia == 25 && mes == 12) System.out.println("SI");
			else System.out.println("NO");
		}
	}

}
