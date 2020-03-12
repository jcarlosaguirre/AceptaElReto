package Solved;
import java.util.Scanner;

public class P155_PerimetroRectangulo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x, y, res;
		
		
		do {
			x = sc.nextInt();
			y = sc.nextInt();
			
			if (x >= 0 && y >= 0) {
				res = (x*2)+(y*2);
				System.out.println(res);
			}
			
		} while (x >= 0 && y >= 0);

	}

}
