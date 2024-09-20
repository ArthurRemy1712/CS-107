import java.util.Scanner;

public class Intervalle{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez un réel : ");
        double x = scanner.nextDouble();
        
        boolean isIntervalBound = x == 2 || x == 1 || x == -10 || x == -2 ;
        boolean inFirstInterval =  -10 < x && x < -2;
        boolean inSecondInterval = 0 < x && x < 1;
        boolean inThirdInterval = 2 < x && x < 3;

        if (isIntervalBound || inFirstInterval || inSecondInterval || inThirdInterval) {
            System.out.println("x appartient à I");
        } else {
            System.out.println("x n'appartient pas à I");
        }
    }
}


            
        




                   

