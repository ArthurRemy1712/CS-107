import java.util.Scanner;

public class Pret {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrer le montant du prêt");
        final double S0 = scanner.nextDouble();
        System.out.println("Entrer le montant de la mensualité brute");
        final double r = scanner.nextDouble();
        System.out.println("Entrer le taux d'interêt mensuel");
        final double ir = scanner.nextDouble();
        
        boolean correctS0 = S0 > 0;
        boolean correctR = r > 0 && r < S0;
        boolean correctIr = ir > 0 && ir < 1;

        if (correctS0 && correctR && correctIr ) {
            double s = S0;
            double sigmaInterest = 0;

            while (s > 0) {
                sigmaInterest += s * ir;
                s -= r;
            };
            System.out.println("Montant total des interêts = " + sigmaInterest + " euros.");
        } else {
            System.out.println("Mauvais paramètres");
        }
    }
}

        
