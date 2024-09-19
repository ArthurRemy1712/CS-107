import java.util.Scanner;

public class Formules{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez un nombre réel : ");
        double x = scanner.nextDouble();

        if (x != 0){
            System.out.println("Expression 1 = " + x/(1-Math.exp(x)));
        } else {
            System.out.println("Expression 1 = Expression indéfinie");
        }

        if (x > 0 && x!= 1) {
            System.out.println("Expression 2 = " + x * Math.log(x) * Math.exp(2 / (x - 1)));
        } else {
            System.out.println("Expression 2 = Expression indéfinie");
        }

        if ( x <= 0 || x >= 8) {
            System.out.println("Expression 3 = " + (-x - Math.sqrt(Math.pow(x, 2) - 8 * x)) / (2 - x));
        } else {
            System.out.println("Expression 3 = Expression indéfinie");
        }
    }
}

