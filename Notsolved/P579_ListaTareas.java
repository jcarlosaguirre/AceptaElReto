package Solved.Notsolved;

import java.util.*;

public class P579_ListaTareas {



	public static class Tarea implements Comparable<Tarea>{

		int prioridad;
		int duracion;

		public Tarea(int prioridad, int duracion) {
			this.prioridad = prioridad;
			this.duracion = duracion;
		}

		@Override
		public int compareTo(Tarea o) {
			if (this.prioridad > o.prioridad) return 1;
			else if (this.prioridad < o.prioridad) return -1;
			else{
				if (this.duracion > o.duracion) return 1;
				else if (this.duracion < o.duracion) return -1;
			}
			return 0;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int casos;
		Tarea[] tareas;

		while( true ) {

			casos = sc.nextInt();

			if( casos == 0 ) break;

			tareas = new Tarea[casos];

			for (int i = 0; i < casos; i++) {

				int s1 = sc.nextInt();
				int s2 = sc.nextInt();

				Tarea x = new Tarea(s1, s2);

				tareas[i] = x;
			}

			Arrays.sort( tareas );

			for (int i = 0; i < tareas.length; i++) {
				System.out.println( tareas[i]);
			}

			System.out.println( Arrays.toString(tareas) );
		};
	}


}