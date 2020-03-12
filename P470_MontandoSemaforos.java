package Solved;
import java.util.Scanner;

public class P470_MontandoSemaforos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()){

			String semaf = sc.next();
			char[] li = new char [semaf.length()];
			int numsemaforos = 0;

			if (semaf.length() >= 3){

				li[0] = semaf.charAt(0);
				li[1] = semaf.charAt(1);
				int i = 2;
				int j = 2;

				while (j < semaf.length()) {

					char letra = semaf.charAt(j);
					if ( (letra == 'V') && (i >= 2) && (li[i-2] == 'R') && (li[i-1] == 'A') ){

						numsemaforos++;
						i = i - 2;
					}

					else{

						li[i] = letra;
						i++;
					}
					
					j++;
					
				} 
			}
			
			System.out.println(numsemaforos);
		}

	}

}
