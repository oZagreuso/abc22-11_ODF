package tri_de_nombre;

import java.util.Scanner;

		// Variables

		/*nombre a
		 * nombre b
		 */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Variables 
		
		double a;
		double b;
		
		// Déclaration d'un scanner
		
		Scanner sc = new Scanner(System.in);
		
		// Début du programme
		
		System.out.println("Tri de nombres");
		
		System.out.println("indiquer le nombre a");
		a = sc.nextInt();
		
		System.out.println("indiquer le nombre b");
		b = sc.nextInt();
		
		
		if (a > b)
		{System.out.println("b vient avant a");
				}
		
		else if (a < b)
		{System.out.println("a vient avant b");

				}
		sc.close();
	}
		// Fin du programme
		
}
