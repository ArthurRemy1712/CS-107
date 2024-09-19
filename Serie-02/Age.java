import java.util.Scanner;

public class Age{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        
        int CurrentYear = 2024;
        int Age;
        
        System.out.println("Donnez votre age");
        Age = scanner.nextInt();

        int BirthYear = CurrentYear - Age;

        System.out.println("Vous êtes né en " + BirthYear +".");
        }
}

