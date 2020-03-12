package Solved;
import java.util.Collections;
import java.util.Scanner;

public class P116_HolaMundo {

	public static void main(String[] args) {
		
		String s = "Hola mundo.";
		Scanner sc = new Scanner(System.in);
		short n = sc.nextShort();
		
		System.out.println(String.join("\n", Collections.nCopies(n, s)));
		
		

	}

}
