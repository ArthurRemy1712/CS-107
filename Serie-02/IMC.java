import java.util.Scanner;

public class IMC{
	public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

		double poids = 74.5;
		double taille = 1.75;

		System.out.println("Entrez un poids (en kg) : ");
		poids = scanner.nextDouble();
		System.out.println("Entrez une taille (en cm) : ");
		taille = scanner.nextDouble()/100;

		double imc = poids / (taille*taille);

		System.out.println("Pour " + poids + " kg et " + taille + " m, l'IMC est de " + imc);
        scanner.close();
	}
}



