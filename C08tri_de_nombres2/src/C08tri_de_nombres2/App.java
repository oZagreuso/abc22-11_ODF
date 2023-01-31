package C08tri_de_nombres2;

import java.util.Scanner;

public class App {
	
	//Lire 3 nombres réels double précision : a,b et c. Les écrire dans l'ordre croissant
	
	/* Variables
	 * 
	 * a est un réel
	 * b est un réel
	 * c est un réel
	 * 
	 * Début du programme
	 * 
	 * Ecrire " Saisir nombre a "
	 * Lire a
	 * Ecrire " saisir nombre b " 
	 * Lire b
	 * Ecrire " saisir nombre c "
	 * Lire c
	 * 
	 * Si a < b
	 * 		Si b < c
	 * 			Ecrire a, "<" , b , "<" , c
	 * 		Sinon // b <= a
	 * 				Si a < c
	 * 					Ecrire a , "<" , c , "<" , b
	 * 				Fin Si
	 * 		Fin Si
	 * Sinon // b <= a
	 * 		Si a < c
	 * 			Ecrire b , "<" , a , "<" , c
	 * 		Sinon // c <= a
	 * 			Si b < c
	 * 				Ecrire b , "<" , c , "<" , a
	 * 			Sinon // c <= b
	 * 				Ecrire c , "<" , b , "<" , a
	 * 			Fin SI
	 * 		Fin Si
	 * Fin SI
	 * 
	 * Fin du programme
	 * 		
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Déclaration des variables
		
		double a;
		double b;
		double c;
		
		// Déclaration d'un scanner
		
		Scanner sc = new Scanner(System.in);
		
		// Début du programme
		
		// Lecture des nomnbres
		
		System.out.println( " saisir un nombre a : ");
		a = sc.nextDouble();
		
		System.out.println( " saisir un nombre b : ");
		b = sc.nextDouble();
		
		System.out.println( " saisir un nombre c ");
		c = sc.nextDouble();
		
		// Test
		
		if (a < b) {
			if (b < c) {
				System.out.println(a + " < " + b + " < " + c);
			}
			else { // c <= b 
				if (a < c) {
					System.out.println(a + " < " + c + " < " + b);
				}
				else { // c <= a
					System.out.println(c + " < " + a + " < " + b);
				}
			}
		}
		else { // b <= a
			if (a < c) {
				System.out.println(b + " < " + a + " < " + c);
			}
			else { // c <= a
				if (b < c) {
					System.out.println(b + " < " + c + " < " + a);
				}
				else { // c <= b
					System.out.println(c+ " < " + b + " < " + a);
				}
			}
			
			}
		}
		
				

	}


