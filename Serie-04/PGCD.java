import java.util.Scanner;

public class PGCD {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez un nombre positif");
        int number1 = scanner.nextInt();
        System.out.println("Entrez un nombre positif");
        int number2 = scanner.nextInt();
        
        int i = number1;
        int j = number2;

        while ( i != j) {
            
            if (i < j) { // Test pour assurer l'ordre
                int temp = i;  // des deux nombres
                i = j;
                j = temp;
            };
            i -= j;
        };

        System.out.println("Le PGCD de " + number1 + " et " + number2 + " est " + i);
    }
}

