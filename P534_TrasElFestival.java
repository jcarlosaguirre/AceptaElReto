package Solved;
import java.util.Arrays;
import java.util.Scanner;

public class P534_TrasElFestival {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int n, min;
		int[] cubos;

		do {

			min = 1000000;
			n = sc.nextInt();
			cubos = new int[n];

			if (n != 0) {

				for (int i = 0; i < cubos.length; i++) {

					cubos[i] = sc.nextInt();
				}
				
				Arrays.sort(cubos);
				
				for (int i = 0; i < cubos.length; i += 2) {
					
					if (cubos[i] - cubos[i + 1] < min) {
						
						min = cubos[i] - cubos[i + 1];
					}
				}

				System.out.println( Math.abs(min) );
			}
			

		} while (n != 0);

	}

}
