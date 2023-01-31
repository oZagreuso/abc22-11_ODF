package C02Moyenne;

import java.util.Scanner;

public class App {

	
		// TODO Auto-generated method stub

		/* VARIABLES
		 * 			nombre 1 est une ENTIER
		 * 			nombre 2 est un ENTIER
		 * 			moyenne est un réel double précision
		 * 
		 * DEBUT PROGRAMME
		 * 
		 * 			Ecrire " Programme de calcul de la moyenne de 2 nombres"
		 * 			Ecrire "veuillez saisir un premier nombre"
		 * 			Lire nombre 1
		 * 			Ecrire " veuillez saisir un deuxième nombre "
		 * 			Lire nombre 2
		 * 			Moyenne (nombre 1 + nombre 2)/2
		 * 			Ecrire " La moyenne de " nombre 1 " et " nombre2 " est " moyenne
		 * FIN DU PROGRAMME
		 * 
		 */
	public static void main(String[] args) {
		
		//VARIABLES
		
		int nombre1; // déclaration d'une variable nomée "nombre 1 " et de type " entier "
		int nombre2; // déclaration d'une variable de type "entier"
		double moyenne; // déclaration d'une variable " moyenne " de typer réel double précision 
		
		// Création d'un scanner (voir le PDF java 03)
		
		Scanner sc = new Scanner(System.in); // permet de lire des saisies utilisateur
		
		//DEBUT PROGRAMME
		
		System.out.println(" Programme de calcul de la moyenne de 2 nombres");
		
		
		System.out.println(" Veuillez saisir un premier nombre");
		nombre1 = sc.nextInt(); // appelle l'utilisateur à saisir un nombre entier dans la console
		System.out.println(" Vous avez saisi: " + nombre1 );
		
		
		System.out.println(" Veuillez saisir un second nombre" );
		nombre2 = sc.nextInt(); // appelle l'utilisateur à saisir un nombre entier dans la console
		System.out.println(" Vous avez saisi: " + nombre2);
		
		moyenne = (nombre1 + nombre2) / 2d;
	
		System.out.println(" la moyenne des deux nombres est " + moyenne);
		
		// FIN PROGRAMME
		
	}

}
