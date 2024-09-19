import java.util.Scanner;

public class Fondue{
    public static void main(String[] args){
       
        Scanner scanner = new Scanner(System.in);
        int Base = 4;
        double fromage = 800;
        double eau = 2.0;
        double ail = 2.0;
        double pain = 400;
        int nbConvives;

        System.out.println("Combien voulez de portions de fondue ?");
        nbConvives = scanner.nextInt();
        fromage = fromage * nbConvives / Base;
        eau = eau * nbConvives / Base;
        ail= ail * nbConvives / Base;
        pain = pain * nbConvives / Base;
        System.out.println("Pour faire une fondue fribourgeoise pour " + nbConvives + " personnes, il vous faut :");
        System.out.println("- " + fromage + " gr de Vacherin");
        System.out.println("- " + eau + " dl d'eau");
        System.out.println("- " + ail + " gousses d'ail");
        System.out.println("- " + pain + " gr de pain");
    }
}



