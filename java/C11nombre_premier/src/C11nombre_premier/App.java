package C11nombre_premier;

import java.util.Scanner;

/* Variables
 * 
 * n est un entier
 * i est un entier
 * booléen est_premier
 * 
 * Début du programme
 * 
 * Ecrire " saisissez n "
 * Lire n
 * 
 * pour i de 2 à n - 1
 * 			if n mod i = 0 
 * 			alors est_premier <-- faux
 * 
 * 			fin SI
 * Fin pour
 * 
 * si est_premier = vrai 
 * 		alors Ecrire " n est premier "
 * Sinon
 * 			  Ecrire " n n'est pas premier "
 * 
 * fin Si
 * 
 * Fin du programme
 */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Déclaration des variables
		
		int n;
		boolean est_premier = true;
		
		// Déclaration d'un scanner
		
		Scanner sc = new Scanner(System.in);
		
		// Début du programme 
		
		System.out.println(" saisir un nombre n ";
		n = sc.nextInt();
		
		n = Math.abs(n); // valeur
		
		

	}

}
