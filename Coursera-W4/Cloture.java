import java.util.ArrayList;

class Cloture {
    public static void main(String[] args) {
        int[][] carte = {
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,0,0},
            {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,0,0},
            {0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,0,0},
            {0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,0,0,0,0},
            {0,0,0,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0},
            {0,0,0,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0},
            {0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0},
            {0,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0},
            {0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0},
            {0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
        };

        /*******************************************
         * Completez le programme Ã  partir d'ici.
         *******************************************/
        for (int i = 0; i < carte.length; i++) {
            for (int j = 0; j < carte[i].length; j ++) {
                if (carte[i][j] != 0 && carte[i][j] != 1) {
                    System.out.print("Votre carte du terrain n'a pas le bon format :\nvaleur '");
                    System.out.print(carte[i][j]);
                    System.out.print("' trouvée en position [");
                    System.out.print(i);
                    System.out.print("][");
                    System.out.print(j);
                    System.out.println("]");
                    return;
                }
            }
        }
        

        ArrayList<Integer> abscisses = new ArrayList<Integer>();
        ArrayList<Integer> ordonnees = new ArrayList<Integer>();

        int composante = 1;

        for (int i = 0; i < carte.length; i++) {
            for (int j = 0; j < carte[i].length; j++) {
                if (carte[i][j] == 0) {
                    composante ++;
                    abscisses.add(j);
                    ordonnees.add(i);
                    while ( abscisses.size() > 0) {
                        int ordonnee = ordonnees.get(0);
                        int abscisse = abscisses.get(0);
                        if (carte[ordonnee][abscisse] == 0) {
                            carte[ordonnee][abscisse] = composante;
                            if (ordonnee == 0 && abscisse == 0) {
                                if (carte[ordonnee + 1][abscisse] == 0) {
                                    abscisses.add(abscisse);
                                    ordonnees.add(ordonnee + 1);
                                }
                                if (carte[ordonnee][abscisse + 1] == 0) {
                                    abscisses.add(abscisse + 1);
                                    ordonnees.add(ordonnee);
                                }
                            } else if (ordonnee == 0 && abscisse == carte[i].length - 1) {
                                if (carte[ordonnee + 1][abscisse] == 0) {
                                    abscisses.add(abscisse);
                                    ordonnees.add(ordonnee+1);
                                }
                                if (carte[ordonnee][abscisse -1] == 0) {
                                    abscisses.add(abscisse - 1);
                                    ordonnees.add(ordonnee);
                                }
                            } else if (ordonnee == carte.length - 1 && abscisse == 0) {
                                if (carte[ordonnee - 1][abscisse] == 0) {
                                    abscisses.add(abscisse);
                                    ordonnees.add(ordonnee - 1);
                                }
                                if (carte[ordonnee][abscisse + 1] == 0) {
                                    abscisses.add(abscisse + 1);
                                    ordonnees.add(ordonnee);
                                }
                            } else if (ordonnee == carte.length - 1 && abscisse == carte[i].length - 1) {
                                if (carte[ordonnee - 1][abscisse] == 0) {
                                    abscisses.add(abscisse);
                                    ordonnees.add(ordonnee - 1);
                                }
                                if (carte[ordonnee][abscisse - 1] == 0) {
                                    abscisses.add(abscisse - 1);
                                    ordonnees.add(ordonnee);
                                }
                            } else if (ordonnee == carte.length - 1) {
                                if (carte[ordonnee][abscisse - 1] == 0) {
                                    abscisses.add(abscisse -1);
                                    ordonnees.add(ordonnee);
                                }
                                if (carte[ordonnee][abscisse + 1] == 0) {
                                    abscisses.add(abscisse + 1);
                                    ordonnees.add(ordonnee);
                                }
                                if (carte[ordonnee - 1][abscisse] == 0) {
                                    abscisses.add(abscisse);
                                    ordonnees.add(ordonnee -1);
                                }
                            } else if (ordonnee == 0) {
                                if (carte[ordonnee][abscisse - 1] == 0) {
                                    abscisses.add(abscisse -1);
                                    ordonnees.add(ordonnee);
                                }
                                if (carte[ordonnee][abscisse + 1] == 0) {
                                    abscisses.add(abscisse + 1);
                                    ordonnees.add(ordonnee);
                                }
                                if (carte[ordonnee + 1][abscisse] == 0) {
                                    abscisses.add(abscisse);
                                    ordonnees.add(ordonnee +1);
                                }
                            } else if (abscisse == carte[i].length - 1) {
                                if (carte[ordonnee - 1][abscisse] == 0) {
                                    abscisses.add(abscisse);
                                    ordonnees.add(ordonnee - 1);
                                }
                                if (carte[ordonnee + 1][abscisse] == 0) {
                                    abscisses.add(abscisse);
                                    ordonnees.add(ordonnee + 1);
                                }
                                if (carte[ordonnee][abscisse - 1] == 0) {
                                    abscisses.add(abscisse - 1);
                                    ordonnees.add(ordonnee);
                                }
                            } else if (abscisse == 0) {
                                if (carte[ordonnee - 1][abscisse] == 0) {
                                    abscisses.add(abscisse);
                                    ordonnees.add(ordonnee - 1);
                                }
                                if (carte[ordonnee + 1][abscisse] == 0) {
                                    abscisses.add(abscisse);
                                    ordonnees.add(ordonnee + 1);
                                }
                                if (carte[ordonnee][abscisse + 1] == 0) {
                                    abscisses.add(abscisse + 1);
                                    ordonnees.add(ordonnee);
                                }
                            } else {
                                if (carte[ordonnee - 1][abscisse] == 0) {
                                    abscisses.add(abscisse);
                                    ordonnees.add(ordonnee - 1);
                                }
                                if (carte[ordonnee + 1][abscisse] == 0) {
                                    abscisses.add(abscisse);
                                    ordonnees.add(ordonnee + 1);
                                }
                                if (carte[ordonnee][abscisse - 1] == 0) {
                                    abscisses.add(abscisse - 1);
                                    ordonnees.add(ordonnee);
                                }
                                if (carte[ordonnee][abscisse + 1] == 0) {
                                    abscisses.add(abscisse + 1);
                                    ordonnees.add(ordonnee);
                                }
                            }
                        }
                        abscisses.remove(0);
                        ordonnees.remove(0);

                    }
                }
            }
        }
/*
        for (int i = 0; i < carte.length; i++) {
            System.out.print("\n");
            for (int j = 0; j < carte[i].length; j++) {
                System.out.print(carte[i][j] + " ");
            }
        }
*/
        ArrayList<Integer> zoneIds = new ArrayList<Integer>();

        for (int i = 0; i < carte.length; i++) {
            zoneIds.add(carte[i][0]);
            zoneIds.add(carte[i][carte[i].length - 1]);
        }
        for (int i = 0; i < carte[0].length; i++) {
            zoneIds.add(carte[0][i]);
            zoneIds.add(carte[carte.length - 1][i]);
        }
        

        for (int i = 0; i < carte.length; i++) {
            for (int j = 0; j < carte[i].length; j++) {
                if (carte[i][j] != 1) {
                    boolean Left1 = false;
                    boolean Right1 = false;
                    for (int k = 0; k < j; k++) {
                        if (carte[i][k] == 1) {
                            Left1 = true;
                            break;
                        }
                    }
                    for (int k = j+1; k < carte[i].length; k++) {
                        if (carte[i][k] == 1) {
                            Right1 = true;
                            break;
                        }
                    }
                    if (Left1 && Right1) {
                        for (int k = 0; k < zoneIds.size(); k ++) {
                            if( zoneIds.get(k) == carte[i][j]) {
                                System.out.println("Votre carte du terrain n'a pas le bon format :");
                                System.out.print("bord extérieur entrant trouvé en position [");
                                System.out.print(i);
                                System.out.print("][");
                                System.out.print(j);
                                System.out.println("]");
                                return;
                            }
                        }
                    }
                }
            }
        }

        for (int i = 0; i < carte.length; i++) {
            for (int j = 0; j < carte[i].length; j++) {
                if (carte[i][j] != 1) {
                    boolean Left1 = false;
                    boolean Right1 = false;
                    for (int k = 0; k < j; k++) {
                        if (carte[i][k] == 1) {
                            Left1 = true;
                            break;
                        }
                    }
                    for (int k = j+1; k < carte[i].length; k++) {
                        if (carte[i][k] == 1) {
                            Right1 = true;
                            break;
                        }
                    }
                    if (Left1 && Right1) {
                        carte[i][j] = 1;
                    }
                }
            }
        }
/*
        for (int i = 0; i < carte.length; i++) {
            System.out.print("\n");
            for (int j = 0; j < carte[i].length; j++) {
                System.out.print(carte[i][j] + " ");
            }
        }
*/
        int nCloture = 0;

        for (int i = 0; i < carte.length; i++) {
            for (int j = 0; j < carte[i].length; j++) {
                if (carte[i][j] == 1) {
                    if (i == 0 && j == 0 && i == carte.length - 1 && j == carte[i].length - 1) {
                        nCloture += 4;
                    } else if ( i == 0 && j == 0) {
                        nCloture += 2;
                        if (carte[i][j+1] != 1) {
                             nCloture ++;
                        }
                        if (carte[i+1][j] != 1) {
                            nCloture ++;
                        }
                    } else if (i == 0 && j == carte[i].length - 1) {
                        nCloture += 2;
                        if (carte[i][j - 1] != 1) {
                            nCloture ++;
                        }
                        if (carte[i+1][j] != 1) {
                            nCloture ++;
                        }
                    } else if (i == carte.length - 1 && j == 0) {
                        nCloture += 2;
                        if (carte[i][j+1] != 1) {
                            nCloture ++;
                        }
                        if (carte[i-1][j] != 1) {
                            nCloture ++;
                        }
                    } else if (i == carte.length - 1 && j == carte[i].length - 1) {
                        nCloture += 2;
                        if (carte[i][j-1] != 1) {
                            nCloture ++;
                        }
                        if (carte[i-1][j] != 1) {
                            nCloture ++;
                        }
                    } else if (i == 0) {
                         nCloture ++;
                        if (carte[i][j+1] != 1) {
                             nCloture ++;
                        }
                        if (carte[i][j-1] != 1) {
                            nCloture ++;
                        }
                        if (carte[i+1][j] != 1) {
                            nCloture ++;
                        }
                    } else if (i == carte.length - 1) {
                         nCloture ++;
                        if (carte[i][j+1] != 1) {
                             nCloture ++;
                        }
                        if (carte[i][j-1] != 1) {
                            nCloture ++;
                        }
                        if (carte[i-1][j] != 1) {
                            nCloture ++;
                        }
                    } else if (j == 0) {
                         nCloture ++;
                        if (carte[i-1][j] != 1) {
                             nCloture ++;
                        }
                        if (carte[i+1][j] != 1) {
                             nCloture ++;
                        }
                        if (carte[i][j+1] != 1) {
                            nCloture ++;
                        }
                    } else if (j == carte[i].length - 1) {
                         nCloture ++;
                        if (carte[i-1][j] != 1) {
                             nCloture ++;
                        }
                        if (carte[i+1][j] != 1) {
                             nCloture ++;
                        }
                        if (carte[i][j-1] != 1) {
                            nCloture ++;
                        }
                    } else {
                        if (carte[i-1][j] != 1) {
                             nCloture ++;
                        }
                        if (carte[i+1][j] != 1) {
                             nCloture ++;
                        }
                        if (carte[i][j+1] != 1) {
                             nCloture ++;
                        }
                        if (carte[i][j-1] != 1) {
                             nCloture ++;
                        }
                    }
                }
            }
        }
        System.out.print("Il vous faut ");
        System.out.print(nCloture * 2.5);
        System.out.println(" mètres de clôture pour votre terrain.");

        /*******************************************
         * Ne rien modifier aprÃ¨s cette ligne.
         *******************************************/
    }
}
