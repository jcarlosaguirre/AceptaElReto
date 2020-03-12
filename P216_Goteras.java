package Solved;
import java.util.Scanner;

public class P216_Goteras {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int sec; 
		int min;		
		int horas;
		
		for (int i = 0; i < n; i++) {
			
			sec = sc.nextInt();
			min = sec / 60;
			horas = min / 60;
			sec = sec - min * 60;
			min = min - horas * 60;
			System.out.printf("%02d:%02d:%02d%n", horas, min, sec);	
		}
	}
}
