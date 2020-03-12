package Solved;
import java.util.Scanner;

public class P111_AprobarQuimica {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String element;
		int electrones, pos;
		int[] value;
		String res;
		String[] s = {

				"1s", "2s", "2p", "3s", "3p", "4s", "3d", "4p", "5s", 
				"4d", "5p", "6s", "4f", "5d", "6p", "7s", "5f", "6d", "7p" 

		};


		do {

			element = sc.next();

			if ( !(element.contentEquals("Exit")) ) {

				electrones = sc.nextInt();
				value = new int[19];
				
				if (electrones != 0) {
					
					res = "";

					for (int i = 0; electrones != 0; i++) {

						pos = value[i];

						switch (s[i].charAt(1)) {

						case 's':

							if (electrones >= 2) {

								pos = 2;
							}

							else pos = 1;

							electrones -= pos;

							break;

						case 'p':

							if (electrones >= 6) {

								pos = 6;
							}

							else pos = electrones;

							electrones -= pos;

							break;

						case 'd':

							if (electrones >= 10) {

								pos = 10;
							}

							else pos = electrones;

							electrones -= pos;

							break;

						case 'f':

							if (electrones >= 14) {

								pos = 14;
							}

							else pos = electrones;

							electrones -= pos;

							break;

						}

						res +=  s[i] + pos + " ";

					} //FOR i
					
					System.out.println(res.trim());
				}
				
				else System.out.println("1s0");

			}

		} while ( !(element.contentEquals("Exit")) );


	}

}
