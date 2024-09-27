import java.util.Scanner;

public class Pascal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Entrez la taille du triangle de Pascal : ");
        int n = scanner.nextInt() + 1;
        
        int N = n * (n + 1) / 2;

        int[] pascal = new int[N];

        for ( int i = 0; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    if (i < 2) {
                        pascal[(i * (i + 1) / 2) + j] = 1;
                    } else {
                    pascal[(i * (i + 1) / 2) + j] = pascal[ ((i - 1) * i / 2) + j] + pascal[ ((i - 1) * i / 2) + j - 1];
                    }
                }
        }
        for ( int i = 0; i < n; i++) {
            System.out.print("\n");
            for (int j = 0; j < i; j++) {
                System.out.print(pascal[(i * (i + 1) / 2) + j] + " " );
            }
        }
    }
}
        


