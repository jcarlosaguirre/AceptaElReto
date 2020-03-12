package Solved;
import java.util.Scanner;

public class P513_Empleado {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int casos, aux, patentes;
		int[] dias;
		String s;
		
		while(sc.hasNext()) {
			
			s = "";
			casos = sc.nextInt();
			dias = new int[casos];
			patentes = 0;
			
			for (int i = 0; i < dias.length; i++) {
				
				dias[i] = sc.nextInt();
				
				aux = dias[i] * (i + 1);
				
				if (i != 0){
					
					aux -= patentes;
				}
				
				patentes += aux;
				
				s += aux + " ";
			}
			
			System.out.println(s.trim());
			
		}

	}

}
