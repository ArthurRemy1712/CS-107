import java.util.Scanner;

public class MulMat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quelle est la dimension de la première matrice ?");
        int n1 = scanner.nextInt();
        int m1 = scanner.nextInt();

        System.out.println("Quelle est la dimension de la deuxième matrice ?");
        int n2 = scanner.nextInt();
        int m2 = scanner.nextInt();
        
        if (m1 != n2) {
            System.out.println("Impossible de faire le produit des deux matrices");
        } else {
            double[][] mat1 = new double[n1][m1];
            double[][] mat2 = new double[n2][m2];

            System.out.println("Remplissez les valeurs de la première matrice");
            System.out.println("Nombre de lignes = " + n1);
            System.out.println("Nombre de colonnes = " + m1);
            for (int i = 0; i <= n1 - 1; i ++) {
                for (int j = 0; j <= m1 - 1; j ++) {
                    System.out.print("M["+ (i+1) + "," + (j+1) + "]=");
                    mat1[i][j] = scanner.nextDouble();
                }
            };

            System.out.println("Remplissez les valeurs de la deuxième matrice");
            System.out.println("Nombre de lignes = " + n2);
            System.out.println("Nombre de colonnes = " + m2);
            for (int k = 0; k <= n2 - 1; k ++) {
                for (int l = 0; l <= m2 - 1; l ++) {
                    System.out.print("M["+ (k+1) + "," + (l+1) + "]=");
                    mat2[k][l] = scanner.nextDouble();
                }
            };
            
            double[][] prod = new double[n1][m2];
            
            for (int m = 0; m <= n1 - 1; m++) {
                System.out.print("\n");
                for (int n = 0; n <= m2 - 1; n++) {
                    for (int p = 0; p <= n2 - 1; p++) {
                        prod[m][n] += mat1[m][p] * mat2[p][n];
                    };
                    System.out.print(" " + prod[m][n]);
                    
                };
            };
            
       }
    }
}
                    
                    




