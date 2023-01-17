package e03exemple_boucle_while;

/* Déclaration de la variable
 * 
 * compteur est un entier
 * 
 * Début du programme
 * 
 * compteur<-- a
 * 
 * tant compteur <= 50
 * Ecrire compteur
 * compteur + 1
 * fin de boucle tant que
 * 
 * Fin du programme
 */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Déclaration de la variable
		
		int compteur = 1;
	
		// Début du programme;
		
		while( compteur < 50)
		{
			System.out.println( compteur + " ");
			compteur++;
		}
		do
		{ 
			System.out.println( compteur + " ");
		}
		while(compteur < 50);

	}
}