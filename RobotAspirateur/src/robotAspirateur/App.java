package robotAspirateur;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		robotAspirateur Raph = new robotAspirateur("Raph", false, false, false);
		
		String marque = Raph.getMarque();
		System.out.println(Raph.toString());
		
		boolean allumer = Raph.allumerRobot();
		System.out.println(Raph.toString());
		
		Raph.robotMove(robotAspirateur.Deplacement.AVANT);
		
		boolean eteindre = Raph.eteindreRobot();
		System.out.println(Raph.toString());
			
		Raph.robotMove(robotAspirateur.Deplacement.AVANT);
	}

}
