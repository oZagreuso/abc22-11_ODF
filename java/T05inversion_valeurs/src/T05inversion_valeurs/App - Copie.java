package T05inversion_valeurs;

import java.util.Scanner;


public class App {
	
	/* Variables
	 * 
	 * a est un entier 
	 * b est un entier
	 * temp est un entier
	 * 
	 * Début du programme
	 * 
	 * Ecrire " Inversion de deux valeurs "
	 * Ecrire " indiquer la valeur de A "
	 * Lire a
	 * Ecrire " indiquer la valeur de B "
	 * Lire b
	 * 
	 * a <- temp
	 * a = b
	 * b <- temp
	 * 
	 * Ecrire " après la permutation la valeur de A est de " + a + "la valeur de B est de " + b
	 * 
	 *Fin du programme 
	 */
	
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Déclaration des variables
		
		int a;
		int b;
		int temp;
		
		// Déclaration d'un scanner
		
		Scanner sc = new Scanner(System.in);
		
		// Début du programme
		
		System.out.println( " Inversion de deux valeurs ");
		System.out.println( " indiquer la valeur de A ");
			a = sc.nextInt();
		System.out.println( " Iniquer la valeur de B ");
			b = sc.nextInt();
		
		temp = a;
		a = b;
		b= temp;
		
		System.out.println( " Après permutation la valeur de A est de " + a + " et la valeur de B est de " + b);
		
		sc.close();
			
		// Fin du programme
		

		
		
	}

}
