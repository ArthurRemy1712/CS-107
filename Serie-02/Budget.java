import java.util.Scanner;

public class Budget{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int Budget;
        System.out.println("Combien avez-vous reçu d'argent");
        Budget = scanner.nextInt();

        int BudgetFournitures = 3 * Budget / 4;
        System.out.println("Livres et Fournitures : " + BudgetFournitures);

        Budget -= BudgetFournitures;

        int BudgetActivites = Budget / 3 ;

        int CafesSat = BudgetActivites / 2;
        int NumFlash = BudgetActivites / 4;
        int BilletMetro = BudgetActivites / 3;


        System.out.println("Vous pouvez ensuite acheter : ");
        System.out.println(CafesSat + " cafés à Sat");
        System.out.println(NumFlash + " numero de Flash");
        System.out.println(BilletMetro + " billets de métro");

        int Reste = Budget - CafesSat * 2 - NumFlash * 4 - BilletMetro * 3;
        System.out.println("et il vous reste " + Reste + " Frs pour les roses blanches");
    }
}


