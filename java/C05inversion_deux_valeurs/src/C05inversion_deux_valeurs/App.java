package C05inversion_deux_valeurs;

import java.util.Scanner;

public class App {
	
	/* Variables
	 * 
	 * a est un entier
	 * b est un entier
	 * temp est un entier
	 * 
	 * Début programme
	 * 
	 * Ecrire " valeur de A " 
	 * Lire a
	 * Ecrire "valeur de B "
	 * Lire B
	 * tmp = a
	 * a = b
	 * b = temp
	 * Ecrire " a "
	 * Ecrire " b "
	 * 
	 * FIn du programme
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		// Déclaration des variables
		
		int a;
		int b;
		int temp;
		
		// Déclaration d'un scanner
		
		Scanner sc = new Scanner(System.in);
		
		// Début du proframme
		
		System.out.println( " Inversion de deux valeurs ");
		System.out.println( " indiquez la valeur de A ");
			a = sc.nextInt();
		System.out.println( "indiquez la valeur de B ");
			b = sc.nextInt();
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println( " Apres la permutation la valeur de A est de " + a + " et la valeur de B est de " + b);
		
		sc.close();
		
		

	}

}
