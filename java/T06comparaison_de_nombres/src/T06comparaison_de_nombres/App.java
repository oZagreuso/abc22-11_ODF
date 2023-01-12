package T06comparaison_de_nombres;

import java.util.Scanner;

public class App {
	
/* Variable
 * 
 * a est un entier
 * 
 * Début du programme 
 * 
 * Ecrire " Comparaison de nombres "
 * Ecrire " indiquez l'age "
 * Lire a
 * 
 * Si a = 0
 * Alors Ecrire " vous n'ete pas nee "
 * Sinon si a < 18 
 * Alors Ecrire " vous etes mineur "
 * Sinon Ecrire " vous etes majeur "
 * 
 * Fin du programme
 */
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Déclarer la variable
		
		int a;
		
		// Déclarer un scanner
		
		Scanner sc = new Scanner(System.in);
		
		// Début du programme
		
		System.out.println( " Comparaisons de nombres ");
		System.out.println( " Indiquez l'age ");
		a = sc.nextInt();
		
		if(a<0) {
			System.out.println( " Vous n'ete pas encore nee ");
		}
		else if(a<18) {
			System.out.println( " vous ete mineur ");
		}
		else {
			System.out.println( " vous ete majeur ");
		}
		sc.close();
	}
		}
	
		
	


