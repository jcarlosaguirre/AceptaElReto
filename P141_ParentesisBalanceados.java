package Solved;
import java.util.Scanner;
import java.util.Stack;

public class P141_ParentesisBalanceados {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s;
		Stack<Character> pila;

		while (sc.hasNext()) {
			
			s = sc.nextLine();
			pila = new Stack();

			for (int i = 0; i < s.length() ; i++) {
				
				
				if (pila.empty() == false && (
						(s.charAt(i) == ')' && pila.peek() == '(') || 
						(s.charAt(i) == ']' && pila.peek() == '[') || 
						(s.charAt(i) == '}' && pila.peek() == '{') )) {
					

					pila.pop();
					
					
				}
				
				else if (s.charAt(i) == '(' || s.charAt(i) == '[' || 
						 s.charAt(i) == '{' || s.charAt(i) == ')' ||
						 s.charAt(i) == ']' || s.charAt(i) == '}' ) {

					pila.push(s.charAt(i));
				}
			}
			
			if (pila.empty()) System.out.println("YES");
			else System.out.println("NO");
			
		}

	}

}
