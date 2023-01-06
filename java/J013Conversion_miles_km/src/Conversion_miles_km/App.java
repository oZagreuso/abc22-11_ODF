package Conversion_miles_km;

import java.util.Scanner;

/* Variable
 * nombre N, double
 * 
 * Début du programme:
 * Ecrire : "indiquez la valeur en km"
 * Lire: "valeur en km"
 * Si N < 0.01 ou si > 1000000 alors lire: "veuillez saisir une nouvelle valeur"
 * Si N > 0.01 et < 1000000 alors appliquer la conversion (1 mile = 1.609344 km) lire "résultat conversion"
 * Si N = Q (soit si l'utilisateur presse la touche Q), alors le programme se termine et se ferme
 */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Déclaration variables		
		double kiloMeters, miles;
		// 1 mile = 1.609344 kilomètres => 1 kilomètre = 1/1.609344 miles
		double conversionFactor = 1.609344;			
		
		// Récupérer les données de l'utilisateur via un Scanner class
		System.out.println(" indiquez une distance comprise entre 0,01 et 1 000 000 km");
		Scanner input = new Scanner(System.in);
		kiloMeters = input.nextDouble();
		
		miles = kiloMeters / conversionFactor;
		
		System.out.println(" la distance en Miles est de : " + miles);
		
		
		
		
		
		

	}

}
