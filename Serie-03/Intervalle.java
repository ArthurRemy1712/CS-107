import java.util.Scanner;

public class Intervalle{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez un réel : ");
        double x = scanner.nextDouble();
        
        if ( x == 2 || x == 1 || x == -10 || x == -2){
            System.out.println("x appartient à I");
        } else {   
            if ( -10 < x){
                if ( x < -2){
                    System.out.println("x appartient à I");
                } else {
                    if ( 0 < x) {
                            if ( x < 1) {
                                System.out.println("x appartient à I");
                            } else {
                                if ( 2 < x) {
                                    if ( x < 3) {
                                        System.out.println("x appartient à I");
                                    } else {
                                        System.out.println("x n'appartient pas à I");
                                    }
                            } else {
                                System.out.println("x n'appartient pas à I");
                            }
                        }
                    } else {
                        System.out.println("x n'appartient pas à I");
                    }
                }
            } else {
                System.out.println("x n'appartient pas à I");
            }
        }
    }
}


            
        




                   

