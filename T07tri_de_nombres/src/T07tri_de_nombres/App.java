package T07tri_de_nombres;

import java.util.Scanner;

public class App {
	
	/* Variables
	 * 
	 * a est un entier
	 * b est un entier
	 * 
	 * Début du programme
	 * 
	 * Ecrire " tri de nombres "
	 * Ecrire " indiquez un nombre "
	 * Lire a
	 * Ecrire " indiquez un second nombre "
	 * Lire b
	 * 
	 * Si a > b
	 * 	Alors afficher b puis a
	 * Sinon
	 * 	afficher a puis b
	 * 
	 * Fin si
	 * 
	 * Fin du programme
	 */
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// Déclaration des variables
		
		int a;
		int b;
		
		// Déclarer un Scanner
		
		Scanner sc = new Scanner(System.in);
		
		// Début du programme
		
		System.out.println( " tri de nombres ");
		
		System.out.println( " indiquez un premier nombre ");
			a = sc.nextInt();
		System.out.println( " indiquez un second nombre ");
			b = sc.nextInt();
			
			if ( a > b ) {
				System.out.println(b+ " , " +a);
			}
			else {
				System.out.println(a+ " , " +b);
			}
	
			sc.close();
					
					
		// Fin du programme
			
	}
	
}
			
		
	
	

