package e02exemple_boucle_for;

// Exemple d'une boucle for qui compte de 1 à 50

/* Variables
 * 
 * i est un entier
 * 
 * Début du programme
 * 
 * debut boucle pour
 * 		pour i allant de 1 à 50
 * 			Ecrire i
 * 		Fin boucle pour
 * 
 * Fin du programme
 * 
 */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Déclaration de la variable
		
		int i;
		
		// Boucle for de 1 à 50
		
		for( i = 1 ; i <= 50 ; i ++)
		{
				System.out.println(i);
		}

		// Boucle for de 50 à 1
		
		for(int j = 50 ; j >= 1 ; j --)
		{ 
				System.out.println(j);
		}
		
		// Boucle for de 2 à 50 avec pas de 2
		
		for(int k = 2 ; k <= 50 ; k += 2) 
		{
				System.out.println(k);
		}	
				
	}		
}	

