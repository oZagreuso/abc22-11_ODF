package aire_volume_sphere;

import java.util.Scanner;

/*
  VARIABLES
  R est un entier
  Aire est un réel double
  Volume est un réel double
 DEBUT PROGRAMME
  Ecrire " Veuillez ecrire la valeur du rayon R "
  Ecrire " le volume de la sphère est de " +Volume
 FIN DE PROGRAMME
 */
public class App {
	
	public static void main(String[] args) {
	
	/*	//utilisation de l'objet pi de la classe Java
		double pi = Math.PI;
		int rayon;
		// utilisation de l'objet pow(puissance) de la classe math (1er paramètre de la variable est le nombre,
		double aire = Math.pow(rayon, 2); */
		
		// Variables
		int rayon; 
		double aire;
		double volume;
		double pi = Math.PI;
		
		// Déclaration d'un scanner
		Scanner sc = new Scanner(System.in);
		
		// DEBUT DU PROGRAMME
	
		System.out.println("calcul de l'aire et du volume d'une sphère");
		
		// On demande à l'utilisateur de saisir le rayon de la sphère 
		System.out.println("indiquer le rayon R");
		
		// On stocke la valeur saisie dans la varaiable rayon
		rayon = sc.nextInt();
		
		// On fait le calcul de l'aire et on stocke le résultat dans la variable aire
		aire = 4 * pi * Math.pow(rayon, 2); // Utilisation de l'objet pow (puissance) de la classe Math
		
		//On fait le calcul du volume et on stocke le résultat dans la variable volume
		volume = 4/3 * pi * Math.pow(aire, 3);
		 
		// On affiche le résultat
		System.out.println("l'aire de la sphère est" + " " + aire);
		System.out.println("le volume de la sphère est" + " " + volume);
		
		// Fin du programme 
		
		
		
		
		
}
	
}
