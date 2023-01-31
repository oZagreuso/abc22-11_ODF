package C07tri_de_nombres;

import java.util.Scanner;

public class App {

	/* Variables
	 * 
	 * a est un entier
	 * b est un entier
	 * 
	 * Début du programme
	 * 
	 * Ecrire " donnez un premier nombre "
	 * Lire a
	 * Ecrire " donnez un deuxième nombre "
	 * Lire b
	 * 
	 * Début SI
	 * 			SI a > b
	 * 				ALORS
	 * 					Afficher b puis a
	 * 				SINON
	 * 					Afficher a puis b
	 * 
	 * Fin SI
	 * 
	 * Fin du programme
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Déclaration des variables
		
		int a;
		int b;
		
		// Déclaration d'un scanner
		
		Scanner sc = new Scanner(System.in);
		
		// Début du programme
		
		System.out.println( " Tri de nombres ");
		
		System.out.println( " indiquez le nombre a ");
			a = sc.nextInt();
			
		System.out.println( "indiquez le nombre b ");
			b = sc.nextInt();
			
		if ( a > b ) {
			System.out.println(b+ " , "+a);
		}
		else {
			System.out.println(a+" , "+b);
		}
		
		sc.close();
		
		}
			
		

	}


