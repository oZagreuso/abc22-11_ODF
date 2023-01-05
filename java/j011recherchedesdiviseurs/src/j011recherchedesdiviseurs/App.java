package j011recherchedesdiviseurs;

/*
 * VARIABLES
 * i = entier // itérateur
 * n = entier // saisie de l'utilisateur
 * 
 * DEBUT DU PROGRAMME
 * Ecrire "indiquez les nombre"
 * Lire n
 * 
 * pour i de 1 à n
 * Si n mod i == 0
 * Ecrire i
 */


import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("indiquez le nombre");
		
		n = sc.nextInt();
		
		for(int i=2 ; i < n ; i++ )
		{if (n % i == 0) {
			
		System.out.println(i);
		
		}	
		}
		sc.close();
	}
			
	}


