import java.util.Scanner;

public class Scalaire {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        final int nMax = 10;

        System.out.println("Quelle taille de vecteurs voulez-vous ?");
        int n = scanner.nextInt();

        if (n > nMax) {
            System.out.println("Trop grande taille de vecteurs !");
        } else {
            double[] v1 = new double[n];
            double[] v2 = new double[n];

            System.out.println("Entrez les coordonnées du premier vecteur");
            for (int i = 0; i < n; i++) {
               v1[i] = scanner.nextDouble();
            };
            System.out.println("Entrez les coordonnées du deuxième vecteur");
            for (int i = 0 ; i < n; i++) {
                v2[i] = scanner.nextDouble();
            };

            double scal = 0;

            for (int i=0 ; i<n ; i++) {
                scal += v1[i] * v2[i];
            };
            System.out.println("Valeur du produit scalaire = " + scal);
        }
    }
}

                

        

