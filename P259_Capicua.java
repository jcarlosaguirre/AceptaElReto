package Solved;
import java.math.BigInteger;
import java.util.Scanner;

public class P259_Capicua {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x, y;
		BigInteger s;

		do {

			x = sc.nextInt();
			
			if (x != 0) {

				if (x == 1) s = new BigInteger("10");
				
				else {
					
					s = new BigInteger("9");
					
					if (x % 2 == 0) {
						
						y = x / 2 - 1;
					}
					
					else {
						
						y = x / 2;
					}
					
					s = s.multiply(new BigInteger("10").pow(y));
				}

				System.out.println(s);
			} 

		} while (x != 0);

	}

}
