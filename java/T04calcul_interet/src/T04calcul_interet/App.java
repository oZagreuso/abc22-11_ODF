package T04calcul_interet;

import java.util.Scanner;

public class App {
	
	/* Variables
	 * 
	 * Somme S est un entier
	 * Interet i est un entier
	 * Nombre d'annes N est un entier
	 * somme1 est un réel double
	 * somme2 est un réel double
	 * 
	 * Début du programme
	 * 
	 * Ecrire " veuillez entrer la somme"
	 * Lire S
	 * Ecrire " veuillez entrer le taux d'interet "
	 * Lire i
	 * Ecrire " veuillez entrer le nombre d'annnee "
	 * Lire N
	 * somme1 = S * ( 1 + N * i)
	 * somme2 = S * ( 1 + i ) * N
	 * 
	 * Ecrire " la somme avec un interet simple est de" + somme1 + " et la somme d'un interet compose est de " + somme2
	 * 
	 * Fin du programme
	 */
	 

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// Déclaration variables
		
		int S;
		int i;
		int N;
		double somme1;
		double somme2;
		
	// Déclaration d'un scanner
		
		Scanner sc = new Scanner(System.in);
		
	// Début du programme
		
		System.out.println( "calcul taux d'interet simple et taux d'interet compose ");
		System.out.println( " indiquez la somme ");
		 S = sc.nextInt();
		System.out.println( " indiquez le taux d'interet ");
		 i = sc.nextInt();
		System.out.println( " indiquez le nombre d'annee N ");
		 N = sc.nextInt();
		 
		somme1 = S * ( 1 + N  * i / 100d );
		somme2= S * (( 1 + i / 100d ) * N);
		 
		System.out.println( " le résultat avec un interet simple ets de " + somme1 + " et le résultat d'un interet compose " + somme2 );
		
		sc.close();
		
		 // Fin du programme;
	
		
		 
		
		
		
		
	
		
		

		
		

		
		
		
		
	}

}
