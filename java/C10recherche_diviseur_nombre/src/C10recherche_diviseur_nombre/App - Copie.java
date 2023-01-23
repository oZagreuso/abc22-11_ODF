package C10recherche_diviseur_nombre;

import java.util.Scanner;


/* Variables
 * 
 * i est un entier // iterateur
 * n est un entier // iterateur
 * 
 * Début du programme
 * 
 * Ecrire " veuillez saisir un nombre "
 * Lire n
 * 
 * Pour i de 2 à n , i < n
 * 	Si n mod i == o
 * 			Ecrire i
 * 	fin Si
 * 
 * fin pour
 */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		// Déclaration des variables
		
		int i; // Iterateur
		int n; // Saisie de l'utilisateur
		
		// Début du programme
		
		System.out.println(" veuillez saisir un nombre ");
		n = sc.nextInt();
		
		for(i = 2 ; i < n ; i += 2) {
			if(n % i == 0) {
				System.out.print( i + " ");
			}
		}
			}
		
	}


