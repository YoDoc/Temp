package convertisseurDegre;


public class Sdz1 {
	/**
	 * Ma classe
	 */

	public static void main(String[] args) {
		System.out.println("CONVERTISSEUR DEGRÉS CELSIUS ET DEGRÉS FAHRENHEIT");
		System.out.println("-------------------------------------------------");
		calcul.calcule();
	}

	public static double arrondi(double A, int B) {
		return ((int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
	}
}
