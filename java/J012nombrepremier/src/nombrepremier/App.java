package nombrepremier;

import java.util.Scanner;

/* VARIABLE
 * nombre N est un entier
 */

/* Début du programme
 * Ecrire indiquez nombre
 * Lire nombre N
 * Si N / 1 et par N alors N est un nombre premier
 */


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N;
		int i;
		int p = 0;
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("indiquez le nombre");
		
		N = sc.nextInt();
		
		
		for(i = 1; i <= N; i++) {
			if (N % i == 0) {
				p++;
			}
		}
		if (p == 2) {
			System.out.println(N + " est un nombre premier");
		} else {
			System.out.println(N + "n'est pas un nombre premier");
		
		}
		
		sc.close();
		}
}
		
	
			
	

				

	


