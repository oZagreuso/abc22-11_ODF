package odf02boucle_for;

// for ( point de départ ; condition ; changer le départ ) {

// Instruction: afficher tous les nombres premiers de 0 à 1000
// Nombre premier est uniquement divisible par un et par lui même
// Créer une boucle imprégnée par une autre boucle 

public class App {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for ( int nombre = 2 ; nombre < 100 ; nombre++ ) 
		{
			boolean test = true;
		
			for (int start = 2 ; start < nombre ; start++ ) 
			{
				if ( nombre % start == 0 )
				{
					test = false;
					break;
				}
			}
			
			if ( test ) 
			{
				System.out.println( nombre );
			}
			
			
			}
		
		
	}

}


