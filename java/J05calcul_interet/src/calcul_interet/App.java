package calcul_interet;

import java.util.Scanner;

/* VARIABLES
 * somme S double réel
 * années N double réel
 * intérêt i double réel
 */

public class App {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Variables
		
		double somme;
		double annees;
		double interet;
		double interetSimple;
		double interetCompose;
		
		// Déclaration d'un scanner
		
		Scanner sc = new Scanner(System.in);
		
		// Début du programme
		
		System.out.println("calcul d'intérêt d'une somme");

		System.out.println("indiquer la somme S");
		
		somme = sc.nextDouble();
		
		System.out.println("indiquer le nombre d'années N");
		
		annees = sc.nextDouble();
		
		System.out.println("indiquer le taux d'intérêt i");
		
		interet = sc.nextDouble();
		
		
		interetSimple = somme * (1 + annees * interet);
		
		interetCompose = somme * Math.pow((1 + interet),annees);
		
		System.out.println("le résultat est intérêt simple" + interetSimple  + "le résultat intérêt composé est" + interetCompose);
				
			sc.close();	
			
		// Fin du programme
		
	}

	

}
