package Solved;
import java.util.Scanner;

public class P239_PiPiPiii {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int dias, emisoras;

		do {

			dias = sc.nextInt();
			emisoras = sc.nextInt();

			if (dias != 0 || emisoras != 0) {


				double segundosOriginales = ((dias * 24) * 6) * emisoras;

				int diasX = (int) (segundosOriginales / 3600) / 24;
				int horas = (int) (segundosOriginales / 3600) - (diasX * 24);
				int minutos = (int)(segundosOriginales - ((horas + diasX * 24) * 3600)) / 60;
				int segundos = (int)segundosOriginales - (minutos + (horas * 60 + ((diasX * 24) * 60))) * 60;

				System.out.printf("%d:%02d:%02d:%02d\n", diasX, horas, minutos, segundos);

			}

		} while (dias != 0 || emisoras != 0);


	}

}
