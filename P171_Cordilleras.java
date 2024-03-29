package Solved;
import java.util.ArrayList;
import java.util.Scanner;

public class P171_Cordilleras {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n, abadia;
		boolean valid;
		ArrayList<Integer> montanyas;
		
		do {
			
			montanyas = new ArrayList();
			n = sc.nextInt();
			
			if (n > 0) {

				for (int i = 0; i < n; i++) {
					
					abadia = sc.nextInt();
					valid = true;
					
					for (int j = montanyas.size() - 1; j >= 0 && valid; j--) {

						if (montanyas.get(j) <= abadia ) {
							
							montanyas.remove(j);
						} 
						
						else {
							
							valid = false;
						}
					}
					
					montanyas.add(abadia);
				}
				
				System.out.println(montanyas.size());
			}
			
		} while (n != 0);

	}

}