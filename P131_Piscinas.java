package Solved;
import java.util.Scanner;

public class P131_Piscinas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int piscina, barrenyo, perdido, viajes;

		int piscinaVecino, barrenyoVecino, perdidoVecino, viajesVecino;

		while (sc.hasNextInt()) {

			piscina = sc.nextInt();
			barrenyo = sc.nextInt();
			perdido = sc.nextInt();

			piscinaVecino = sc.nextInt();
			barrenyoVecino = sc.nextInt();
			perdidoVecino = sc.nextInt();

			if (piscina == 0 || piscinaVecino == 0) {

				break;
			}

			viajes = viajes(piscina, barrenyo, perdido);

			viajesVecino = viajes(piscinaVecino, barrenyoVecino, perdidoVecino);



			if (viajes == viajesVecino) {

				System.out.println("EMPATE " + viajes);
			}

			else {

				if (  (( viajes > viajesVecino) && (viajesVecino != 0)) || (viajes == 0)  ) {

					System.out.println("VECINO " + viajesVecino);
				}

				if (  (( viajes < viajesVecino) && (viajes != 0)) || (viajesVecino == 0)  ) {

					System.out.println("YO " + viajes);
				}

			}
		}



	}


	public static int viajes(int p, int l, int lp) {

		int  viajes = 0;
		int lFinal;

		if (l >= p) {

			viajes = 1;
		}

		else {

			lFinal = l - lp;

			if (lFinal < 1) {

				viajes = 0;
			}

			else {

				p = p - l;

				viajes = p / lFinal + 1;

				if (p % lFinal != 0) {

					viajes++;
				}
			}	
		}

		return viajes;
	}

}
