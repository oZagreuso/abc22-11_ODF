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
		
		System.out.println("indiquer l'âge");
		
		age = sc.nextInt();
		
		
		if (age < 0)
		{
			System.out.println("vous n'êtes pas encore née");
		}
		
		else if (age < 18)
		{ System.out.println("vous êtes mineur");
		
		}
		else 
		
		{
			System.out.println("vous êtes majeur");
		}
		
		sc.close();
		
		// Fin du programme
		
	}

}
