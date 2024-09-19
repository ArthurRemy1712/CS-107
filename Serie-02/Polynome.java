import java.util.Scanner;

public class Polynome{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int a;
        int b;
        int c;
        double x;

        System.out.println("Entrez a (int) : ");
        a = scanner.nextInt();
        System.out.println("Entrez b (int) : ");
        b = scanner.nextInt();
        System.out.println("Entrez c (int) : ");
        c = scanner.nextInt();

        System.out.println("Entrez x (double) : ");
        x = scanner.nextDouble();

        double y = ((a+b)/2)*x*x*x + (a+b)*(a+b)*x*x + a + b + c;
        System.out.println("La valeur du polynôme est : " + y);
    }
}
