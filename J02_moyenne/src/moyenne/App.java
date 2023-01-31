package moyenne;

import java.util.Scanner;

public class App {
	
	/*
	Algorithme : Calcul de la moyenne de deux nombres
	nombre 1 est un entier
	nombre 2 est un entier
	moyenne est un réel
	Déclaration Variables : 1 et 2 Type variable : entier
	
DEBUT PROGRAMME
	1)	Ecrire « saisir le premier nombre1 »
	2)	Lire nombre1 
	3)	Ecrire « saisir le second nombre2 »
	4)	Lire nombre2
	5)	Moyenne   (nombre1 + nombre2)/2
	6)	Ecrire « résultat » 
FIN PROGRAMME

	 */
	
	public static void main(String[] args)
	{ 
		// VARIABLES
		
		int nombre1; //déclaration d'une variable nommée "nombre1" de type "entier"
		int nombre2; //déclaration d'une variable de type "entier"
		double moyenne; //déclaration d'une variable "momyenne" de type "réel double précision"
		
		//Création d'un scanner (voir le PDF JAVA 03
		Scanner sc  = new Scanner(System.in); // permet de lire des saisies utilisateur
		
		// DEBUT PROGRAMME
		
		System.out.println("programme de calcul de la moyenne de deux nombres");
		
		System.out.println("veuillez saisir un premier nombre");
		nombre1 = sc.nextInt();
		System.out.println("vous avez saisi: " + nombre1);
		
		System.out.println("veuillez saisir un duexième nombre");
		nombre2 = sc.nextInt();
		System.out.println("vous avez saisi " + nombre2);
		
		moyenne = (nombre1 + nombre2)/2d;
		System.out.println("la moyenne des deux nombres est " + moyenne);
		
		
	}
}
