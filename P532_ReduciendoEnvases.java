package Solved;
import java.util.Scanner;

public class P532_ReduciendoEnvases {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		short N, T;
		int res;

		for (int i = 0; i < casos; i++) {
			
			N = sc.nextShort();
			T = sc.nextShort();
			res = Math.abs(N - T);
			
			
			System.out.println(res);
		}

		
		
	}

}
