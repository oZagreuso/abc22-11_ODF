package a04exercice_fonction_moyenne_2nombres;

import java.util.Scanner;

public class App {
	
	// Enoncé: Ecrire et utiliser une fonction calculant la moyenne de 2 nombres
	
	/*VARIABLES
	 * nombre a est une entier
	 * nombre b est un entier
	 * moyenne est un réel 
	 * 
	 * FONCTION_moyenne( entier a , entier b )
	 * Moyenne (nombre a + nombre b)/2
	 * Retours " moyenne "
	 * 
	 * FIN FONCTION */
	
		public static double calculMoyenne( double a , double b)
		{
			
			double moyenne;
			moyenne = ( a + b )/2;
			
			return moyenne;
		}
	
			public static void main(String[] args) {
				// TODO Auto-generated method stub

				// Declaration variables
		
				int a;
				int b;
				double moyenne;
		
				// Declaration d'un scanner
		
				Scanner sc = new Scanner(System.in);
		
				// Début du programme
		
				System.out.println( " calcul de la moyenne de deux nombres ");
				System.out.println( " indiquez la valeur de a ");
				a = sc.nextInt();
				System.out.println( "indiquez la valeur de b ");
				b = sc.nextInt();
				
				// Fonction
				
				moyenne = calculMoyenne( a , b);
				
				System.out.println( " la moyenne est de :" + moyenne);
				
				sc.close();
			}
}
			
		
