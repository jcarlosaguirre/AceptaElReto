package Solved;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class P578_HaciendoInventario {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x;
		String s;
		HashSet<String> productos;

		while(true) {

			x = sc.nextInt();
			sc.nextLine();

			if( x == 0 ) break;

			productos = new HashSet<String>();

			for (int i = 0; i < x; i++) {

				s = sc.nextLine().toLowerCase();
				productos.add( s );
			}

			System.out.println( productos.size() );


		};

	}

}