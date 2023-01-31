package aire_volume_sphère;

//importation de l'objet scanner pour la saisie utilisateur
import java.util.Scanner;

/* VARIABLES
 * R est un entier
 * Aire est un réel double
 * Volume est un réel double
 * 
 * DEBUT PROGRAMME
 * 
 * Ecrire "veuillez saisir la valeur du rayon R"
 * Lire R
 * Aire 4* PI R3
 * Ecrire " l'aire du volume de la sphère " + aire
 * Ecrire " le volume de la sphère est de " + volume
 * 
 * FIN DU PROGRAMME
 */


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// déclaration des variables
		
		double PI = Math.PI; // utilisation de l'objet PI de la classe Math
		
		int rayon = 0;
		
		double aire;
		
		double volume;
		
		// déclaration du Scanner
		
		Scanner sc = new Scanner(System.in);
		
		// début du programme
		
		System.out.println(" Calcul de l'aire et du volume d'une sphère ");
		
		// on demande à l'utilisateur de saisie le rayon de la sphère
		System.out.println(" saisir la valeur du rayon ");
		
		// on stocke la valeur saisie dans la variable rayon
		rayon = sc.nextInt();
		
		System.out.println(" vous avez saisi : " + rayon);
		
		// on fait le calcul de l'aire et on stocke le résultat dans la variable air
		aire = 4 * PI * Math.pow(rayon,  2); // utilisation de l'objet pow (puissance) de la classe Math (1er paramètre : la variable 1er nombre, le 2ème l'exposant)
		
		// on fait le calcul du volume et on stocke le résultat dans la variable volume
		volume = 4 / 3d * PI * Math.pow(rayon,  3);
		
		// on affiche le résultat
		System.out.println(" l'air de la sphère est " + aire + " son volume est " +volume);
		
		// fin du programme
		
		sc.close();
		

	}

}
