package Solved;
import java.util.Scanner;

public class P191_ProblemasRico {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		int compartimentos;
		int litros;
		int diferencia;
		int resultado = 0;
		
		
		for (int i = 0; i < casos; i++) {
			
			compartimentos = sc.nextInt();
			litros = sc.nextInt();
			diferencia = sc.nextInt();
			
			resultado = (compartimentos * litros);
			
			for (int j = 0; j < compartimentos; j++) {
				
				resultado -= (diferencia * j);
			}
			
			System.out.println(resultado);
		}

	}

}
