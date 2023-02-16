package robotBar;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		// Déclaration d'un scanner
		
		Scanner sc = new Scanner(System.in);
		
		RobotBar Barlambda = new RobotBar();
		RobotBar BarFire = new RobotBar( " BarFire ", false, false, 2, 0, 9, 4);
		
		System.out.println( " Bar Fire ");
		System.out.println(BarFire.toString());
		
		boolean on = BarFire.allumer();
		System.out.println(BarFire.toString());
		
		BarFire.deplacer();
		
		boolean fill = BarFire.remplir();
		System.out.println(BarFire.toString());
		
	}

}
