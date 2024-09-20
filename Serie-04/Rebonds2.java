import java.util.Scanner;

public class Rebonds1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez la hauteur initiale :");
        final double H0 = scanner.nextDouble();
        System.out.println("Entrez le coefficient de rebonds :");
        final double eps = scanner.nextDouble();
        System.out.println("Entrez la hauteur finale :");
        final double h_fin = scanner.nextDouble();

        final double g = 9.81;

        boolean correctH0 = H0 >= 0;
        boolean correctEps = 0 <= eps && eps < 1;
        boolean correctH_fin = 0 < h_fin && h_fin < H0;

        if ( correctH0 && correctEps && correctH_fin) {
            
            double h = H0;
            double v;
            double h1;
            double v1;
            
            int rebonds = 0;

            while ( h > h_fin ) {
                v = Math.sqrt(2 * g * h);
                v1 = eps * v;
                h1 = Math.pow(v1,2) / ( 2 * g);
                h = h1;
                ++ rebonds;
            };
            System.out.println("Hauteur finale atteinte au bout de " + rebonds + " rebonds" ); 

        } else {
            System.out.println("Mauvais paramètres !");
        }
    }
}

