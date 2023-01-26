package evaluation_19_01_23_ODF;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		//Déclaration d'un scanner
		
		Scanner clavier = new Scanner(System.in);
		
		// Déclaration des variables
		
		int numero;
		
		// Début du programme
		
		System.out.println( " Saisir un numero de mois ");
		numero = clavier.nextInt();
		
		
			if(numero <= 0) {
				System.out.println( " numero du mois invalide, veuillez recommencer ");					
			}
			if(numero > 12) {
				System.out.println( " numero de mois invalide, veuillez recommencer ");
			}
			
		
		
		while(numero >= 1 && numero <= 12) {
		
			if(numero == 1 ) {
				System.out.println(" le mois de janvier est impair " + " Les jours pairs du mois sont : 2, 4, 6, 8, 12, 14, 16, 18, 22, 24, 26, 28 ");
			} 			
			else if(numero == 2) {
				System.out.println(" le mois de fevrier est pair " + " Les jours impairs du mois sont : 1, 5, 7, 11, 13, 17, 19, 23, 25 ");
			}			
			else if(numero == 3) {
				System.out.println(" le mois de mars est impair " + " Les jours pairs du moi sont : 2, 4, 6, 8, 12, 14, 16, 18, 22, 24, 26, 28 ");
			}
			else if(numero == 4) {
				System.out.println(" le mois d' avril est pair " + " Les jours impairs du mois sont : 1, 5, 7, 11, 13, 17, 19, 23, 25 ");
			}
			else if(numero == 5) {
				System.out.println(" le mois de mai est impair " + " Les jours pairs du moi sont : 2, 4, 6, 8, 12, 14, 16, 18, 22, 24, 26, 28 ");
			}
			else if(numero == 6) {
				System.out.println(" le mois de juin est pair " + " Les jours impairs du mois sont : 1, 5, 7, 11, 13, 17, 19, 23, 25 ");
			}
			else if(numero == 7) {
				System.out.println(" le mois de juillet est impair " + " Les jours pairs du moi sont : 2, 4, 6, 8, 12, 14, 16, 18, 22, 24, 26, 28 ");
			}
			else if(numero == 8) {
				System.out.println(" le mois d'aout est pair " + " Les jours impairs du mois sont : 1, 5, 7, 11, 13, 17, 19, 23, 25, 31 ");
			}
			else if(numero == 9) {
			System.out.println(" le mois de septembre est impair " + " Les jours pairs du moi sont : 2, 4, 6, 8, 12 ,14 ,16 ,18 ,22 ,24 ,26 ,28 ");
			}		
			else if(numero == 10) {
			System.out.println(" le mois d'octobre est pair " + " Les jours impairs du mois sont : 1, 5, 7, 11, 13, 17, 19, 23, 25, 31 ");
			}
			else if(numero == 11) {
				System.out.println(" le mois de novembre est impair " + " Les jours pairs du moi sont : 2, 4, 6, 8, 12, 14, 16, 18, 22, 24,26 ,28 ");
			}	
			else if(numero == 12) {
				System.out.println(" le mois de decembre est pair " + " Les jours impairs du mois sont : 1, 5, 7, 11, 13, 17, 19, 23, 25, 31 ");
			}
		
			
			while(numero >= 1 && numero <= 12) {
			
			numero++;
			
			}
		}
	}
}
		
	

	
	

