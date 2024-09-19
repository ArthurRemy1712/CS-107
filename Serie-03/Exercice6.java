import java.util.Scanner;

public class Exercice6{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez un nombre entier : ");
        int nombre = scanner.nextInt();

        String signe;
        String parite;

        if (nombre == 0){
            signe = "zéro";
        } else {
            if (nombre < 0){
                signe = "négatif";
            } else {
                signe = "positif";
            }
        }
        if (nombre % 2 == 0){
            parite = "pair";
        } else {
            parite = "impair";
        }
        
        System.out.println("Le nombre est " + signe + " et " + parite + ".");
    }
}

