package c12_conversion_km_miles;

import java.util.Scanner;

/* Variables
 * 
 * km est un réel
 * miles est un réel
 * fermeture_prog est un boolean
 * quit est une chaine de caractère
 * saisie_utilisateur est une chaine de caractère
 * 
 * Début du programme
 * 
 * Tant que fermeture_prog est faux
 * Faire
 * 		Ecrire " veuillez saisir une valeur en km comprise entre 0,01 et 1000000 "
 * 		Lire saisie utilisateur
 * 			Si saisie_utilisateur est egale a quit
 * 				Alors fermeture_prog est vraie
 * 			Sinon
 * 				km<-- conversion en reel de saisie utilisateur
 * 				Si km inférieur à 0,01 ou supérieure à 1000000
 * 					Alors
 * 						Ecrire " veuillez saisir une valeur en km comprise entre 0,01 et 1000000
 * 						Lire saisie utilisateur
 * 					Sinon
 * 						miles = km/1,609
 * 						Ecrire km + " kilometres valent : " + miles + " miles
 * 				Fin si
 * 			Fin Si
 * Fin tant que
 * 
 * Fin du programme
 */


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Déclaration des variables
		
		double km = 0;
		double miles;
		String quit = "q";
		String saisie_utilisateur;
		boolean fermeture_prog = false;
		
		//Déclaration d'un scanner
		
		Scanner sc = new Scanner(System.in);
		
		// Début du programme
		
				// Boucle tant que fermeture_prog est faux
		
				while(!fermeture_prog) 
				{
				
					System.out.println( " veuillez saisir une valeur en km comprise entre 0,01 et 1000000");
					saisie_utilisateur = sc.nextLine();
					// On teste si l'utilisateur a saisie q
					if(saisie_utilisateur.equals(quit) ) 
					{
						// Si oui on ferme le programme
						fermeture_prog = true;
					}
					else
						// Sinon on convertie la chaine de caractère saisie en double
						km = Double.parseDouble(saisie_utilisateur);
							// On teste si la valeur saisie est comprise entre 0,01 et 1000000
							if(km < 0.01 || km > 1000000)
							{
								// Si oui on demande de sair la aleur
								System.out.println( " Veuillez saisir une valeur comprise entre 0,01 et 1000000 " );
								saisie_utilisateur = sc.nextLine();
							}
							else
							{
								// Sinon on fait la convesion et on affiche le resultat
								miles = km/1.609;
								System.out.println( km + " kilometres valent : " + miles + " miles ");
						
							}
								
					}
								sc.close();
								
	}
}
				
							
		
			

	


