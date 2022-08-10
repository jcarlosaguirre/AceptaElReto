package Solved;
import java.util.Scanner;

public class P576_LeyendoDiccionario {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N;


		while (true) {

			N = sc.nextInt();
			int sec = 0, min = 0, horas = 0;

			if (N == 0) break;

			while (sc.hasNext()){
				int num = sc.nextInt();
				if (num == 0) break;
				sec += num * N;
			}

			horas = sec / 3600;
			sec -= horas * 3600;
			min = sec / 60;
			sec -= min * 60;

			System.out.println(String.format("%02d:%02d:%02d" ,horas, min, sec) );

		}


	}

}
