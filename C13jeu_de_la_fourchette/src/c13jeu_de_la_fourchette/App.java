package c13jeu_de_la_fourchette;

import java.util.Scanner;
import java.util.Random;

/* Variables
 * 
 * nb est un entier genere aleatoirement
 * nbJoueur est un entier saisie par le joueur
 * borneMin est un entier
 * borneMax est un entier
 * nbEssais est un entier
 * 
 * Début du programme
 * 
 * 		Initialisation des variables
 * 		
 * 		nbJoueur <-- -1
 * 		borneMin <-- 0
 * 		borneMax <-- 100
 * 		nb <-- Random(borneMin , borneMax)
 * 
 * 		Tant que nb est différent de nbJoueur
 * 			Faire
 * 					Ecrire " Saisir un nombre entre ",borneMin, " et " , borneMax
 * 					Lire nbJoueur
 * 					Si nb est égal à nbJoueur
 * 						Alors
 * 							Ecrire " vous avez gagné en " , nbEssais , " essais "
 * 					Fin Si
 * 					Si nb est inférieur à nbJoueur
 * 						Alors
 * 							Ecrire " C'est moins "
 * 							borneMax = nbJoueur - 1
 * 					Fin Si
 * 					Si nb est supérieur à n nbJoueur 
 * 						Alors 
 * 							Ecrire " c'est plus "
 * 							borneMin = nbJoueur + 1
 * 					Fin Si
 * 					nbEssais+1
 * 		Fin tant que
 * 
 * Fin du programme
 * 					
 */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Initialisation des variables
		
		Random rand = new Random();
		int nb;
		int borneMin;
		int borneMax;
		int nbEssais;
		int nbJoueur;
		
		// Déclaration d'un scanner
		
		Scanner sc = new Scanner(System.in);
		
		// Début du programme
		
		nbJoueur = -1;
		borneMin = 0;
		borneMax = 100;
		nbEssais = 1;
		nb = rand.nextInt(borneMax - borneMin +1) + borneMin;
		
		while(nb != nbJoueur)
		{
			System.out.println( " Veuillez saisir un nombre entre : " + borneMin + " et " + borneMax);
			nbJoueur = sc.nextInt();
			if(nb == nbJoueur)
			{
				System.out.println( " Bravo vous avez trouvé en " + nbEssais + " essais ");
			}
			if(nb < nbJoueur)
			{
				System.out.println( " C'est moins ") ;
				borneMax = nbJoueur -1;
			}
			if(nb > nbJoueur)
			{
				System.out.println( " C'est plus " );
				borneMin = nbJoueur + 1;
			}
			nbEssais++;
			}
		}
		


	}


