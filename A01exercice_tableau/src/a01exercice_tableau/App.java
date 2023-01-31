package a01exercice_tableau;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Déclaration variable
		
		int nombre;
		
		// Déclaration scanner
		
		Scanner sc = new Scanner(System.in);
		
		// Début du programme
		
		System.out.println( " saisir un nombre ");
		nombre = sc.nextInt();
		
		// Déclaration d'un tableau de chaine de caractère contenant 12 éléments
		
		String[] tabPrenom = new String[12];
		
		// Stockage de valeur dans le tebleau tabPrenom
		
		tabPrenom[0] = " Mustafa " ; 
		tabPrenom[1] = " Olivier " ;
		tabPrenom[2] = " Raphael " ;
		tabPrenom[3] = " Mickael " ;
		tabPrenom[4] = " Stefan " ;
		tabPrenom[5] = " Florian " ;
		tabPrenom[6] = " Kevin " ;
		tabPrenom[7] = " Guillaume " ;
		tabPrenom[8] = " Natan " ;
		tabPrenom[9] = " Terance " ;
		tabPrenom[10] = " Kevin " ;
		tabPrenom[11] = " Frederic " ;
		
		// Début du programme
		
		if(nombre >= 1  && nombre <= tabPrenom.length-1) 
		{
			System.out.println( " Bonjour " + tabPrenom[nombre - 1]); // - 1 pour partir de 0
		}
		else 
		{ 
			System.out.println( " error 404 not found "); 
		}  
		
		sc.close();
		
		}

	}


