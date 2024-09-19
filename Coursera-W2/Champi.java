import java.util.Scanner;

class Champi{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

                
        System.out.print("Est-ce que votre champignon a un anneau (true : oui, false : non) ? ");
        boolean anneau = scanner.nextBoolean();
        if (anneau) {
            System.out.print("Est-ce que votre champignon vit en forêt (true : oui, false : non) ? ");
            boolean foret = scanner.nextBoolean();
            if (foret) {
                System.out.print("==> Le champignon auquel vous pensez est ");
                System.out.print("l'amanite tue-mouches");
            } else {
                System.out.print("Est-ce que votre champignon a un chapeau convexe (true : oui, false : non) ? ");
                boolean chapeau = scanner.nextBoolean();
                if (chapeau) {
                    System.out.print("==> Le champignon auquel vous pensez est ");
                    System.out.print("l'agaric jaunissant");
                } else {
                    System.out.print("==> Le champignon auquel vous pensez est ");
                    System.out.print("le coprin chevelu");
                }
            }
        } else {
            System.out.print("Est-ce que votre champignon a un chapeau convexe (true : oui, false : non) ? ");
            boolean chapeau = scanner.nextBoolean();
            if (chapeau) {
                System.out.print("==> Le champignon auquel vous pensez est ");
                System.out.print("le pied bleu");
            } else {
                System.out.print("Est-ce que votre champignon a des lamelles (true : oui, false : non) ? ");
                boolean lamelles = scanner.nextBoolean();
                if (lamelles) {
                    System.out.print("==> Le champignon auquel vous pensez est ");
                    System.out.print("la girolle");
                } else {
                    System.out.print("==> Le champignon auquel vous pensez est ");
                    System.out.print("le cèpe de Bordeaux");
                }
            }
        }
    }
}








            


                
                
  

