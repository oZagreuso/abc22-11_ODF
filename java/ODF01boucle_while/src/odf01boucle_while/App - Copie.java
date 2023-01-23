package odf01boucle_while;

import java.util.Scanner;

/* Instruction
 * 
 * Afficher un nombre entier et déterminer combien de billets et de pièces sont requis pour atteindre la somme
 * 
 * Variables
 * 
 * euro500 est un entier
 * euro200 est un entier
 * euro100 est un entier
 * euro50 est un entier
 * euro20 est un entier
 * euro10 est un entier
 * euro5 est un entier
 * euro2 est un entier
 * euro1 est un entier
 * 
 * Début du programme
 * 
 *  
 * Tant que nombre < 1
 * Ecrire " saisir une valeur "
 * Lire nombre
 *
 * 
 * Faire
 * 
 * Si nombre >= 500
 * 		Alors ajouter 1 à euro500 et réduire nombre de 500
 * Sinon si nombre >= 200
 * 		Alors ajouter 1 à euro200 et réduire nombre de 200
 * Sinon si nombre >= 100
 * 		Alors ajouter 1 à euro100 et réduire nombre de 100
 * Sinon si nombre >= 50
 * 		Alors ajouter 1 à euro50 et réduire nombre de 50
 * Sinon si nombre >= 20
 * 		Alors ajouter 1 à euro20 et réduire nombre de 20
 * Sinon si nombre >= 10 
 * 		Alors ajouter 1 à euro10 et réduire nombre de 10
 * Sinon si nombre >= 5
 * 		Alors ajouter 1 à euro5 et réduire nombre de 5
 * Sinon si nombre >= 2 
 * 		Alors ajouter 1 à euro2 et réduire nombre de 2
 * Sinon si nombre >= 1
 * 		Alors ajouter 1 à euro1 et réduire nombre de 1
 * Fin si
 * 
 * 
 * Afficher les résultats
 * 
 * Ecrire " 500 = " + euro500
 * Ecrire " 200 = " + euro200
 * Ecrire " 100 = " + euro100
 * Ecrire " 50 = " + euro50
 * Ecrire " 20 = " + euro20
 * Ecrire " 10 = " + euro10
 * Ecrire " 5 = " + euro5
 * Ecrire " 2 = " + euro2
 * Ecrire " 1 = " + euro1
 * 
 * 
 */



public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Déclaration des variables
		
		int euro500 = 0 ; 
		int euro200 = 0 ;
		int euro100 = 0 ;
		int euro50 = 0 ;
		int euro20 = 0 ;
		int euro10 = 0 ;
		int euro5 = 0 ;
		int euro2 = 0 ;
		int euro1 = 0 ;
		
		int nombre = 0;
		
		// Déclaration d'un scanner
		
		Scanner clavier = new Scanner(System.in);
		
		
		// Début du programme
		
		while ( nombre < 1 ) 
		{
		System.out.println( " Saisir une valeur : " );
		nombre = clavier.nextInt();
		}
		
		do {
				if ( nombre >= 500) 
				{
						euro500++ ;
						nombre -= 500;
				}
				else if( nombre >= 200 )
				{
						euro200++ ;
						nombre -= 200;
				}
				else if( nombre >= 100)	
				{
						euro100++ ;
						nombre -= 100;
				}
				else if( nombre >= 50 )
				{
						euro50++ ;
						nombre -= 50;
				}
				else if( nombre >= 20 )
				{
						euro20++ ;
						nombre -= 20;
				}
				else if( nombre >= 10 )
				{
						euro10++ ;
						nombre -= 10;
				}
				else if( nombre >= 5 )
				{
						euro5++ ;
						nombre -= 5;
				}
				else if( nombre >= 2 )
				{
						euro2++ ;
						nombre -= 2;
				}
				else if( nombre >= 1 )
				{
						euro1++ ;
						nombre -= 1;
				}
				}
				while ( nombre > 0 );
				
				System.out.println( " 500 E : " +euro500);
				
				System.out.println( " 200 E : " +euro200);
				
				System.out.println( " 100 E : " +euro100);
				
				System.out.println( " 50 E : " +euro50);
				
				System.out.println( " 20 E : " +euro20);
				
				System.out.println( " 10 E : " +euro10);
				
				System.out.println( " 5 E : " +euro5);
				
				System.out.println( " 2 E : " +euro2);
				
				System.out.println( " 1 E : " +euro1);
		
		}
		
	
		

	}


