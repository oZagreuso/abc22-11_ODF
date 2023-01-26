package a05_fonction_annee_bissextile;

import java.util.Scanner;

/* Enonce : 
 * Ecrire et utiliser une fonction déterminant si une année passée en paramètre est bissextile ou non
 */
/* VARIABLE
 * 
 * annee est un entier
 * 
 * 
 */

public class App {

public static boolean bissextile(int annee)
{
if (
		annee % 4 != 0 ||
		(annee % 100 == 0 &&
		annee % 400 != 0)
	) 
{
	return true;
}


else { 
		
	return false;
	}
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Variable
		
		int annee;
		
		// Déclarer un Scanner
		
		Scanner sc = new Scanner(System.in);
		
		// Début du programme
		
		System.out.println( " Indiquez une anne ");
		annee = sc.nextInt();
		
		// Appeler la fonction:
		
		if(bissextile(annee))
		{
			System.out.println(" L'annee " + annee + " n'est pas bissextile ");
		}
		else
		{
			System.out.println(" L'annee " + annee + " est bissextile ");
		}
		
		
		

	}

}
