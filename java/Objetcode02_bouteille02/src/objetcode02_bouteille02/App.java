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
			System.out.println( " je peux remplir la bouteille ");
		}
		else
		{
			System.out.println( " il m'est impossible de remplir la bouteille ");
		}
		if (evian.vider() == true )
		{
			System.out.println( " je peux vider la bouteille ");
		}
		else
		{
			System.out.println( " impossible d'ouvrir la bouteille ");
		}
		
		Bouteille02 evian = new Bouteille();
		String evian to String = evian to String();
		System.out.println( evian to String );
		Boolean ok = evian
		
	}		
		
}
