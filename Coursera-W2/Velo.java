
import java.util.Scanner;

public class Velo {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Donnez l'heure de dÃ©but de la location (un entier) : ");
        int debut = clavier.nextInt();
        System.out.print("Donnez l'heure de fin de la location (un entier) : ");
        int fin = clavier.nextInt();

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/

        System.out.println("Les heures doivent Ãªtre comprises entre 0 et 24 !");
        System.out.println("Bizarre, vous n'avez pas louÃ© votre vÃ©lo bien longtemps !");
        System.out.println("Bizarre, le dÃ©but de la location est aprÃ¨s la fin ...");
        System.out.println("Vous avez louÃ© votre vÃ©lo pendant");
        System.out.print("Le montant total Ã  payer est de ");
        System.out.println(" franc(s).");

        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/

        clavier.close();
    }
}
