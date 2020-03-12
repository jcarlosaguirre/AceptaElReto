package Solved;
import java.util.Scanner;

public class P520_CubiletesYBolitas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cubiletes, posicion, aux, aux2, aux3;
		int[] moves;

		do {
			
			cubiletes = sc.nextInt();
			posicion = sc.nextInt();
			
			aux = 1;
			aux2 = 1;
			
			if (cubiletes != 0 && posicion != 0) {
				
				moves = new int[cubiletes];
				
				for (int i = 0; i < moves.length; i++) {
					
					moves[i] = i + 1;
				}
				
				while (aux != 0 && aux2 != 0) {
					
					aux = sc.nextInt();
					aux2 = sc.nextInt();
					
					if (aux != 0 && aux2 != 0) {
						
						aux3 = moves[aux - 1];
						moves[aux - 1] = moves[aux2 - 1];
						moves[aux2 - 1] = aux3;
						
					}
				}
				
				for (int i = 0; i < moves.length; i++) {
					
					if (moves[i] == posicion) aux = i + 1;
				}
				
				System.out.println(aux);
				
			}
			
			
			
		} while (cubiletes != 0 && posicion != 0);
		
	}

}
