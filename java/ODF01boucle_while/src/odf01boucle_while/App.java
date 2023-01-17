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
 */



public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int euro500 = 0 ; 
		int euro200 = 0 ;
		int euro100 = 0 ;
		int euro50 = 0 ;
		int euro20 = 0 ;
		int euro10 = 0 ;
		int euro5 = 0 ;
		int euro2 = 0 ;
		int euro1 = 0 ;
		
		Scanner clavier = new Scanner(System.in);
		int nombre = 0;
		
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
				while ( nombre > 0 );
				
				System.out.println( " 500 E : " +euro500);
				
				System.out.println( " 500 E : " +euro200);
				
				System.out.println( " 500 E : " +euro100);
				
				System.out.println( " 500 E : " +euro50);
				
				System.out.println( " 500 E : " +euro20);
				
				System.out.println( " 500 E : " +euro10);
				
				System.out.println( " 500 E : " +euro5);
				
				System.out.println( " 500 E : " +euro2);
				
				System.out.println( " 500 E : " +euro1);
		
		}
		
	}
		

	}

}
