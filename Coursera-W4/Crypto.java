import java.util.Scanner;

public class Crypto {

    static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    static final int DECALAGE = 4;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Veuillez entrer une chaine de caracteres : ");
        String s = scanner.nextLine();

        // la chaine a coder
        String aCoder = "";
        // la chaine codee
        String chaineCodee = "";

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/ 
        for (int i = 0; i < s.length(); i++) {
            if ( s.charAt(i) == ' ') {
                aCoder += ' ';
            } else {
                for (int j = 0; j < ALPHABET.length(); j++) {
                    if (s.charAt(i) == ALPHABET.charAt(j)) {
                        aCoder += s.charAt(i);
                    }
                }
            }
        }
        for (int i = 0; i < aCoder.length(); i++) {
            if ( aCoder.charAt(i) == ' ') {
                chaineCodee += ' ';
            } else {
                chaineCodee += ALPHABET.charAt((ALPHABET.indexOf(aCoder.charAt(i)) + DECALAGE) % ALPHABET.length());
            }
        }

        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
        System.out.format("La chaine initiale etait : '%s'\n", s);

        if (aCoder.isEmpty()) {
            System.out.println("La chaine a coder est vide.\n");
        } else {
            System.out.format("La chaine a coder est : '%s'\n", aCoder);
            System.out.format("La chaine codee est : '%s'\n", chaineCodee);
        }
    }
}
