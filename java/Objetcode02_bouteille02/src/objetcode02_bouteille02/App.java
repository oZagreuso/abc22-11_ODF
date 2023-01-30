package objetcode02_bouteille02;



public class App {
	
		// exemple bouteille evian 1.25 litres

	public static void main(String[] args) {
		
		
		Bouteille02 evian = new Bouteille02( 1.25, 1.25 , false ,"Evian" );
		
		System.out.println(evian.nomBouteille());
		
			
		if ( evian.ouvrir() == false )
		{
			System.out.println( " je ne peux pas ouvrir la bouteille " );
		}
		else
			System.out.println( " j'ai réussi à ouvrir la bouteille ");
		
		if (evian.remplir() == true )
		{
			System.out.println( " il faut remplir la bouteille ");
		}
		else
		{
			System.out.println( " la bouteille est deja remplie au maximum ");
		}
		if (evian.vider() == true )
		{
			System.out.println( " On peut vider la bouteille ");
		}
		else
		{
			System.out.println( " la bouteille est deja vide ");
		}
		
		
	}		
		
}
