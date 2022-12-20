package surface_secteur_circulaire;

import java.util.Scanner;

/* VARIABLES
 * Rayon R est un entire
 * Angle A est un entier
 * Aire est un double réel
 * Double Pi est un nombre réel
 */


public class App {
	
	public static void main(String[] args) { 
		
		// Variables
		
		int rayon ;
		double angle;
		double aire;
		double PI = Math.PI;
		
		// Déclaration d'un scanner
		
		Scanner sc = new Scanner(System.in);
		
		//Début du programme
		
		System.out.println("calcul de la surface d'un secteur circulaire");
		
		System.out.println("indiquer le rayon R");
		
		rayon = sc.nextInt();
		
		System.out.println("indiquer angle");
		
		angle = sc.nextInt();
		
		aire = PI * Math.pow(rayon, 2) * angle / 360; 
		
		System.out.println("l'aire du secteur circulaire est" + " " + aire);
		
		//Fin du programme
		
		
		
		
		
		

	}
}