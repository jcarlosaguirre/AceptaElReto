package Solved;
import java.util.Scanner;
import java.util.Stack;

public class P145_TrenDelAmorSTACK {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s;
		Stack<Character> pila;
		int count;

		while (sc.hasNext()) {

			s = sc.nextLine();
			pila = new Stack<Character>();

			count = 0;

			for (int i = 0; i < s.length() ; i++) {

				if ( 	(s.charAt(i) == 'H' ) ||
						(s.charAt(i) == 'h' ) ) {


					pila.push(s.charAt(i));
				}


				else if (s.charAt(i) == '@') {

					pila.clear();
				}


				else if (pila.empty() == false && (
						(s.charAt(i) == 'M' && pila.peek() == 'H') || 
						(s.charAt(i) == 'm' && pila.peek() == 'h') )) {


					pila.pop();
					count++;
				}

				else if (pila.empty() == false && (
						(s.charAt(i) == 'M' && pila.peek() == 'h') || 
						(s.charAt(i) == 'm' && pila.peek() == 'H') )) {
					
					pila.clear();
				}


			}

			System.out.println(count);
		}

	}

}