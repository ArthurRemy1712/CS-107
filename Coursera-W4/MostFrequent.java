class MostFrequent {

    public static void main(String[] args) {
        int[] tab1 = {2, 7, 5, 6, 7, 1, 6, 2, 1, 7, 6};
        int taille = tab1.length;

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
            
        int[] uniqueOccurrenceTemp = new int[taille];
        for (int i = 0; i < taille; i++) {
            uniqueOccurrenceTemp[i] = 10000000;
        }

        int uniqueCounter = 0;

        for (int i = 0; i < taille; i++) {
            for (int j = 0; j <= taille; j++) {
                if (j == taille){
                    uniqueOccurrenceTemp[uniqueCounter] = tab1[i];
                    uniqueCounter ++;
                } else if (tab1[i] == uniqueOccurrenceTemp[j]) {
                    break;
                }
            }
        }

        int[] uniqueOccurrenceFinal = new int[uniqueCounter];

        for (int i = 0; i < uniqueCounter; i++) {
            uniqueOccurrenceFinal[i] = uniqueOccurrenceTemp[i];
        }

        int[] uniqueNumberCounter = new int[uniqueCounter];

        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < uniqueCounter; j++) {
                if (tab1[i] == uniqueOccurrenceFinal[j]) {
                    uniqueNumberCounter[j] += 1;
                    break;
                }
            }
        }
        
        int maxOccurrence = 0;
        int maxIndex = 0;

        for (int i = 0; i < uniqueCounter; i++) {
            if (uniqueNumberCounter[i] > maxOccurrence) {
                maxOccurrence = uniqueNumberCounter[i];
                maxIndex = i;
            }
        }

        System.out.println("Le nombre le plus frequent dans le tableau est le :");
        System.out.println(uniqueOccurrenceFinal[maxIndex] + " (" + maxOccurrence + " x)");
        


        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/

    }
}
