package convertisseurDegre;

import java.util.Scanner;

public class calcul {

	public static void calcule() {
		int choix = 0;
		Scanner sc = new Scanner(System.in);
		String continuer = "O";
		String quitter = "n";
		while (continuer.equalsIgnoreCase("O") && !quitter.equalsIgnoreCase("O")) {
			System.out.println("Choisissez le Mode de conversion :");
			System.out.println("1 - Convertisseur Celsius - Fahrenheit");
			System.out.println("2 - Convertisseur Fahrenheit - Celsius");
			choix = sc.nextInt();
			if (choix == 1) {
				System.out.println("Temperature a convertir: ");
				double temperature = sc.nextInt();
				double conversion = ((temperature * 9 / 5) + 32);
				System.out.println(temperature + " °C correspond à : " + conversion + " °F.");
				System.out.println("Voulez-vous convertir une autre température? (O/N)");
				continuer = sc.next();

			} else if (choix == 2) {
				System.out.println("Temperature a convertir: ");
				double temperature = sc.nextInt();
				double conversion = (((temperature - 32) * 5) / 9);
				System.out.println(temperature + " °F correspond à : " + conversion + " °C.");
				System.out.println("Voulez-vous convertir une autre température? (O/N)");
				continuer = sc.next();
			} else {
				System.out.println("Choix non valide");
				System.out.println("Voulez vous quitter? (o/n)");
				quitter = sc.next();
			}
		}
		System.out.println("Au revoir");
		sc.close();
	}
}
