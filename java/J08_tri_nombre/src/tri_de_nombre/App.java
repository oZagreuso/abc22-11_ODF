package tri_de_nombre;

import java.util.Scanner;

public class App {

	/* Variables
	 * nombre a
	 * nombre b
	 * nombre c
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Variables
		
		int a;
		int b;
		int c;
		
		// Déclaration d'un scanner
		
				Scanner sc = new Scanner(System.in);

				// Début du programme
				
				System.out.println("Tri de nombre ++");
				
				System.out.println("indiquer le nombre a");
				a = sc.nextInt();
				
				System.out.println("indiquer le nombre b");
				b = sc.nextInt();
				
				System.out.println("indiquer le nombre c");
				c = sc.nextInt();
				
				if (a > b && b > c)
				{
					System.out.println("c b a");
				}

				else if (b > a && a > c)
				{
					System.out.println("b a c");
				}
				else if (c > a && a > b)
				{
					System.out.println("c a b");
				}
				else if (a > c && c > b)
				{
					System.out.println("a c b");
				}
				else if (b > a && c > a)	
				{
					System.out.println("b c a");
				}
				if (c> b && b > a)
				{
					System.out.println("c b a");
				}
				
				sc.close();
				}
					// Fin du programme
					
			

					
					
					// if else, if et le dernier if
				
	}


