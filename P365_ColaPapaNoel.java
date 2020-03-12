package Solved;
import java.util.Scanner;

public class P365_ColaPapaNoel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int aitor, min;
		int[] regalos;
		int casos = sc.nextInt();
		
		for (int i = 0; i < casos; i++) {
			
			min = 0;
			regalos = new int[sc.nextInt()];
			aitor = sc.nextInt();
			
			for (int j = 0; j < regalos.length; j++) {
				
				regalos[j] = sc.nextInt();
			}
			

				
				for (int j = 0; regalos[aitor - 1] != 0; j++) {
					
					if (j > regalos.length - 1) {
						
						j = 0;
					}
					
					if (regalos[j] != 0) {
						
						regalos[j]--;
						min += 2;
					}
					

					
					
				}
				
				
				
				
			System.out.println(min);
			
			
			
			
		}

	}

}
