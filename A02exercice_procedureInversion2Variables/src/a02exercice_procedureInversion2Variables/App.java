package a02exercice_procedureInversion2Variables;

import java.util.Scanner;


public class App {
	
	
	
/* Enoncé exercice : 
 * " Ecrire et utiliser une procédure inversant le contenu de 2 variables a et b passées en argument "
 */


/* PROCEDURE_inversion(entier a , entier b)
 * tmp est un entier
 * tmp <- a
 * a <- b
 * b <- tmp
 * Ecrire " a "
 * Ecrire " b "
 * FIN PROCEDURE
 */

	public static void Inversion( int a , int b ) 
	{
		int tmp;
		
		tmp = a ;
		a = b ;
		b = tmp ;
		System.out.println( " Apres la permutation la valeur de A est de " + a + " et la valeur de B est de " + b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Déclaration variables
		
		int a;
		int b;
		
		
		// Déclaration d'un scanner
		
		Scanner sc = new Scanner(System.in);
		
		// Début du programme
		
		System.out.println( " Inversion de deux valeurs ");
		System.out.println( " indiquez la valeur de A ");
			a = sc.nextInt();
		System.out.println( "indiquez la valeur de B ");
			b = sc.nextInt();
		
		Inversion(  a ,  b);
			
		
		
		sc.close();
	
		}
	}

