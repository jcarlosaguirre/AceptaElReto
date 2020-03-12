package Solved;
import java.util.Scanner;

public class P157_Nochevieja {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		byte dia, mes;
		int dias;
		byte[] meses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		for (int i = 0; i < casos; i++) {

			dia = sc.nextByte();
			mes = sc.nextByte();
			dias = 0;
			
			for (int j = mes; j <= 12; j++) {
				
				dias += meses[j - 1];
			}
			
			dias = dias - dia;
			
			System.out.println(dias);
		}


	}

}
