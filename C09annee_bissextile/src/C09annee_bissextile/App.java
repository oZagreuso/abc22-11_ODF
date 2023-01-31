package C09annee_bissextile;

import java.util.Scanner;

/* Déclaration de la Variable
 * 
 * annee est un entier
 * 
 * Début du programme
 * 
 * Ecrire " veuillez saisir l'annee "
 * Lire annee
 * 
 * Si (annee mod 4 != 0 et annee mod 100 == 0 et annee mod 400 != 0)
 * 		Alors Ecrire " l'anne , annee , " n'est pas bissextile
 * 
 * Sinon
 * 		Ecrire " l'annee , annee , " est bissextile "
 * 
 * Fin du programme
 * 
 * 
 */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Déclaration de la variable
		
		int annee;
		
		// Déclaration d'un scanner
		
		Scanner sc = new Scanner(System.in);
				
		// Début du programme
		
		System.out.println(" saisir une annee ");
		annee = sc.nextInt();
		System.out.println(" vous avez saisi l'annee" +annee);
		
				// Déterminer si l'annee est bissextile
		if (
				annee % 4 != 0 ||
				(annee % 100 == 0 &&
				annee % 400 != 0)
			) {
			System.out.println(" L'annee " + annee + " n'est pas bissextile ");
			
		}
		
		else { 
				System.out.println(" L'annee " + annee + " est bissextile ");
		}
		sc.close();
		
		}
	}	


