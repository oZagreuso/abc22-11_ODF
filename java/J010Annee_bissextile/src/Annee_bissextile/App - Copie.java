package Annee_bissextile;

import java.util.Scanner; 

public class App 
{
	
	/* Variables
	 * Année A
	 */

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		//DECLARATION DU SCANNER
		
		Scanner sc = new Scanner(System.in);
		
		//DEBUT DU PROGRAMME
		
			System.out.println("Annee Bissextile");
			
			System.out.println("Indiquer une annee");
			
			int A = sc.nextInt();
				
			if( (A % 4 == 0 && A % 100 != 0) || A % 400 == 0)
			{
				System.out.println("est une anne bissextile");
			}
			else
			{
				System.out.println("n'est pas une annee bissextile");
			}
			sc.close();

		
	}

}
