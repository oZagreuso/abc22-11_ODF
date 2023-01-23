package C04calcul_interet;

import java.util.Scanner;

public class App {
	
	/* Variables
	 * 
	 * S est un entier
	 * I est un entier
	 * N est un entier
	 * Somme1 est un réel double
	 * Somme2 est un réel double
	 * 
	 * Début du programme
	 * 
	 * Ecrire " veuillez entrer la somme "
	 * Lire S
	 * Ecrire " veuillez entrer le taux d'intérêt "
	 * Lire i
	 * Ecrire " veuillez entrer le nombre d'années de placement "
	 * Lire N
	 * Somme1 = S * ( 1 + N * i )
	 * Somme2 = S * ( 1 + i ) N
	 * Ecrire " la somme avec un intérêt simple est " ; somme1 ; " et la somme avec un intérêt composé est " ; somme2
	 * 
	 * Fin du programme
	 */

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Déclaration des variables
		
		int S = 0;
		int i = 0;
		int N = 0;
		double Somme1;
		double Somme2;
		
		Scanner sc = new Scanner(System.in);
		
		// début du programme
		
		System.out.println(" Calcul d'un interet simple et d'un interet compose ");
		System.out.println(" Saisir la somme du compte en banque ");
		S = sc.nextInt();
		System.out.println(" Saisir le taux d'interet ");
		i = sc.nextInt();
		System.out.println(" Saisir le nombre d'annees ");
		N = sc.nextInt();
		Somme1 = S * ( 1 + N * i / 100d);
		Somme2 = S * Math.pow((1 + i / 100d), N);
		System.out.println(" La somme avec un interet simple est " + Somme1 + " et la somme avec un interet compose est " + Somme2);
		
		sc.close();
		
		// fin du programme
		
				
	}

}
