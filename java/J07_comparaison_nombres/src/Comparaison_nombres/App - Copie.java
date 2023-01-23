package Comparaison_nombres;

import java.util.Scanner;

		/* Variable
		 * age (entier)
		 */


public class App {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Variables
		
		int age;
		
		// Déclarration d'un scanner
		
		Scanner sc = new Scanner(System.in);
		
		// Début du programme
		
		System.out.println("comparer les nombres");
		
		System.out.println("indiquer l'age");
		
		age = sc.nextInt();
		
		
		if (age < 0)
		{
			System.out.println("vous n'etes pas encore nee");
		}
		
		else if (age < 18)
		{ System.out.println("vous etes mineur");
		
		}
		else 
		
		{
			System.out.println("vous etes majeur");
		}
		
		sc.close();
		
		// Fin du programme
		
	}

}
