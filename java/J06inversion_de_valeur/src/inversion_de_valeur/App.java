package inversion_de_valeur;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// VARIABLES
		
		int a;
		int b;
		int temp;
		
		// Déclaration d'un scanner
		
		Scanner sc = new Scanner(System.in);

		// Début du programme
		
		System.out.println("Inversion de deux valeurs");
		
		System.out.println("indiquer la valeur de a");
						
		a = sc.nextInt();
		
		System.out.println("indiquer la valeur de b");
		
		b = sc.nextInt();
		
		temp = a;
		
		a = b;
		
		b = temp;
		
		System.out.println("le resultat de l'inversion de valeur a est.. " + a  + " le resultat de l'inversion de valeur b est.." + b);
		

		sc.close();
		
		// Fin du programme
		
		
		
		
	}

}
