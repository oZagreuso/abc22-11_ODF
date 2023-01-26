package a03exercice_procedure_calcul_périmètre_aire_triangle;

import java.util.Scanner;

public class App {

/* Enonce :
 * ecrire et utiliser une procedure calculant le perimetre et l'aire d'un triangle en connaissant les 3 cote
 * Perimetre = p = a + b + c 
 * Aire = ((p/2-a)(p/2-b)(p/2-c))(1/2)
 */
	
/* PROCEDURE_perimaire(entier a, entier b, entier c)
 * Perimetre = p est un float
 * Aire est un float
 * p <-- a + b + c
 * aire <-- (p*(p-a)*(p-b)*(p-c))
 * Ecrire " perimetre "
 * Ecrire " aire "
 * FIN PROCEDURE
 *  */
	
	public static void perimaire( int a , int b, int c )
	{
		double p;
		double aire;
		
		p = a + b + c;
		System.out.println( " le perimetre est de :" + p);
		aire = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		System.out.println( " l'aire est de : "+ aire);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaration variables
		
		int a;
		int b;
		int c;
	
		
		// Déclaration d'un scanner
		
		Scanner sc = new Scanner(System.in);
		
		// Début du programme
		
		System.out.println( " calcul du perimetre et de l'aire d'un triangle ");
		System.out.println( " indiquez la valeur de a ");
			a = sc.nextInt();
		System.out.println( "indiquez la valeur de b ");
			b = sc.nextInt();
		System.out.println( " indiquez la valeur de c ");
			c = sc.nextInt();
			
		perimaire( a , b , c);
		
		sc.close();
	}

}
