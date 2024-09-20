import java.util.Scanner;

public class Rebonds1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez la hauteur initiale :");
        final double H0 = scanner.nextDouble();
        System.out.println("Entrez le coefficient de rebonds :");
        final double eps = scanner.nextDouble();
        System.out.println("Entrez le nombre de rebonds :");
        final int nbr = scanner.nextInt();

        final double g = 9.81;

        boolean correctH0 = H0 >= 0;
        boolean correctEps = 0 <= eps && eps < 1;
        boolean correctNbr = 0 <= nbr;

        if ( correctH0 && correctEps && correctNbr) {
            
            double v = Math.sqrt(2*g*H0);
            double h = H0;
            double h1 = 0.0;
            double v1;

            for (int i = 0 ; i < nbr ; i++) {
                v1 = eps * v;
                h1 = Math.pow(v1,2) / ( 2 * g);
                v = Math.sqrt(2 * g * h1);
            };
            System.out.println("Hauteur atteinte au bout de " + nbr + " rebonds = " + h1); 

        } else {
            System.out.println("Mauvais paramètres !");
        }
    }
}

