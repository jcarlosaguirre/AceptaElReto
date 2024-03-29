package Solved;
import java.util.Scanner;

public class P336_TiraYAfloja {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero, x, y, aux;
		int[] ninos;
		int count;
		boolean sigue, juegan;

		while (sc.hasNext()) {

			sigue = true;
			juegan = true;
			count = 0;
			
			numero = sc.nextInt();
			ninos = new int[numero];
			
			x = 0;
			y = 0;

			for (int i = 0; i < numero; i++) {
				
				aux = sc.nextInt();
				ninos[i] = aux;
				x += ninos[i];
			}
			
			for (int i = ninos.length - 1; sigue && juegan; i--) {
				
				y += ninos[i];
				x -= ninos[i];
				count++;
				
				if (x - ninos[i - 1] < y) {
					
					sigue = false;
					count -= numero;
				}
				
				if (x - ninos[i - 1] == y) juegan = false;
				
				
			}
			
			if (juegan) {

				System.out.println(count + " " + x + " " + y);
			}
			
			else System.out.println("NO JUEGAN");
			

		}

	}

}
