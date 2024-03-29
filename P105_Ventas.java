package Solved;
import java.util.Locale;
import java.util.Scanner;

public class P105_Ventas {

	public static void main(String[] args) {

		int maxPos, minPos;
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		double n, max = Double.MIN_VALUE, min = Double.MAX_VALUE, media;
		double[] rec = new double[6];
		String[] dias = {"MARTES", "MIERCOLES", "JUEVES", "VIERNES", "SABADO", "DOMINGO"};


		do {

			n = sc.nextDouble();

			if (n != -1) {

				rec[0] = n;

				media = n;
				max = n;
				min = n;
				minPos = 0;
				maxPos = 0;

				for (int i = 1; i < dias.length; i++) {

					rec[i] = sc.nextDouble();

					if (rec[i] > max) {

						max = rec[i];
						maxPos = i;
					}

					else if (rec[i] < min) {

						min = rec[i];
						minPos = i;
					}

					media += rec[i];
				}

				media = media / 6;

				if(max == min){
					
					if (rec[5] > media) System.out.println("EMPATE SI");
					else System.out.println("EMPATE NO");
				}
				
				else {
					if (rec[5] > media) System.out.println(dias[maxPos] + " " + dias[minPos] + " SI");
					else System.out.println(dias[maxPos] + " " + dias[minPos] + " NO");
				}
			}


		} while (n != -1);

	}

}
