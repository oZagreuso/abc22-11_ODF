package T04calcul_interet;

import java.util.Scanner;

public class App {
	
/* Declaration des variables
 * 
 * Somme S est un entier
 * Interet i est un entier
 * Nombre d'annees N est un entier;
 * somme1 est un double reel
 * somme 2 est un double reel
 * 
 * Début du programme
 * 
 * Ecrire " Caclul d'un taux d'interet simple et d'un taux d'interet compose
 * Ecrire " indiquer la somme "
 * Lire S
 * Ecrire " indiquer le taux d'interet "
 * Lire i
 * Ecrire " indiquer le nombre d'annee "
 * Lire N
 * somme1 = S * ( 1 + N * i )
 * somme2 = S * ( 1 + i ) * N
 * Ecrire " le resultat avec un interet simple est de " + somme1 + " et le resultat avec un interet compose est de " + somme2;
 * 
 * Fin du programme
 */
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// Declaration des variables
		
		int S;
		int i;
		int N;
		double somme1;
		double somme2;
		
// Declaration d'un scanner
		
		Scanner sc = new Scanner(System.in);
		
// Debut du programme
		
		System.out.println( " calcul d'un taux d'interet simple et d'un taux d'interet compose " );
		System.out.println( " indiquez une somme " );
		S = sc.nextInt();
		System.out.println( " indiquez le taux d'interet " );
		i = sc.nextInt();
		System.out.println( " veuillez indiquer le nombre d'annee " );
		N = sc.nextInt();
		
		somme1 = S * ( 1 + N * i / 100d);
		somme2 = S * Math.pow(( 1 + i / 100d ), N);
		
		System.out.println( " le resultat avec un interet simple est de " + somme1 + " le resultat avec un interet compose est de " + somme2);
		
		sc.close();
		
		
		
		
		
		
		
		
	
		
		

		
		

		
		
		
		
	}

}
