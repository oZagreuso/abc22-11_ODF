package C06comparaison_de_nombres;

import java.util.Scanner;


public class App {
	
	/* Variables
	 * 
	 * a est un entire
	 * 
	 * Début du programme
	 * 
	 * Ecrire " Saisir age "
	 * lire age
	 * 
	 * si age < 0
	 * 		alors afficher " nous n'etes pas encore nee "
	 * 
	 * sinon si age < 18
	 * 		alors afficher " vous etes mineur "
	 * 
	 * sinon afficher " vous etes majeur "
	 * 
	 * Fin du programme
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Déclarer la variable
		
		int a;
		
		// Déclarer un Scanner
		
		Scanner sc = new Scanner(System.in);
		
		// Début du programme 
		
		System.out.println( " saisir l'age " );
		a = sc.nextInt();
		
				// si l'âge est inférieur à 0
				if(a<0) {
					System.out.println( " vous n'etes pas encore nee ");
				}
				
				// si l'âge est inférieur à 18
				else if(a<18) {
					System.out.println( " vous ete mineur " );
				}
				
				// dans autres cas soit a>=18
				
				else {
					System.out.println( " vous ete majeur ");
				}
				sc.close();
				
				}
	}


