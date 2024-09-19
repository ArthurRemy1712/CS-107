
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
        
        if ( debut < 0 || fin < 0 || debut > 24 || fin > 24){
            System.out.println("Les heures doivent Ãªtre comprises entre 0 et 24 !");
        } else {
            if ( debut == fin){
             System.out.println("Bizarre, vous n'avez pas louÃ© votre vÃ©lo bien longtemps !");
            } else {
                if ( fin < debut){
                    System.out.println("Bizarre, le dÃ©but de la location est aprÃ¨s la fin ...");
                } else {

                    int duree = fin - debut;
                    int dureeTarif1 = 0;

                    if ((7 - debut) > 0){
                        dureeTarif1 += 7 - debut ;
                    } if ((fin - 17) > 0){
                        dureeTarif1 += fin - 17 ;
                    };
                    
                    int dureeTarif2 = duree - dureeTarif1;

                    System.out.println("Vous avez loué votre vélo pendant");
                    if (dureeTarif1 > 0){
                        System.out.println(dureeTarif1 + "heure(s) au tarif horaire de 1.0 franc(s)");
                    } if (dureeTarif2 > 0){
                        System.out.println(dureeTarif2 + "heure(s) au tarif horaire de 2.0 franc(s)");
                    };
                    
                    double prix = dureeTarif1 + dureeTarif2 * 2 ;
                    System.out.println("Le montant total à payer est de " + prix + " franc(s)");   
                }
            }
        }

        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/

        clavier.close();
    }
}
