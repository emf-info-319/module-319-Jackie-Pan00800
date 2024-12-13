package revision2;
public class tournois;
public static String[] EQUIPES = { "FC Richemont", "FC Central", "FC Schoenberg", "FC Beauregard", "TEAM AFF",
            "Etoile Sport" };
    public static int[] pointsEquipes;
    public static int NOMBREMAXGOAL = 10;

    public static void main(String[] args) throws Exception {
        pointsEquipes = new int[EQUIPES.length];


        //Match entre les équipes (1 contre 2, 2 contre 3, 3 contre 4, 4 contre 5, ... x contre 1)
        for (int i = 0; i < EQUIPES.length; i++) {
            /* //BONUS pour faire tous les matchs entre 2 équipes
             * for(int j=i+1; j<EQUIPES.length; j++){
             * simuleMatch(i, j);
             * }
             */

            if (i < EQUIPES.length - 1) {
                simuleMatch(i, i + 1);
            } else {
                simuleMatch(i, 0);
            }

        }

        // Afficher l'état des points
        System.out.println("-----------------------------");
        for (int i = 0; i < EQUIPES.length; i++) {
            System.out.println("L'équipe " + EQUIPES[i] + " a " + pointsEquipes[i] + " points");
        }

        System.out.println("-----------------------------");
        int[] gagnants = trouveGagnants();
        for (int i = 0; i < gagnants.length; i++) {
            System.out.println("L'équipe " + EQUIPES[gagnants[i]] + " a gagné");
        }

    }

    public static void simuleMatch(int equipe1, int equipe2) {
        int scoreEquipe1 = (int) (Math.random() * (NOMBREMAXGOAL - 0 + 1)) + 0;
        int scoreEquipe2 = (int) (Math.random() * (NOMBREMAXGOAL - 0 + 1)) + 0;

        if (scoreEquipe1 > scoreEquipe2) {
            pointsEquipes[equipe1] = pointsEquipes[equipe1] + 3;
            System.out.println(EQUIPES[equipe1] + " a gagné contre " + EQUIPES[equipe2]);
        } else if (scoreEquipe1 < scoreEquipe2) {
            pointsEquipes[equipe2] = pointsEquipes[equipe2] + 3;
            System.out.println(EQUIPES[equipe2] + " a gagné contre " + EQUIPES[equipe1]);
        } else {
            pointsEquipes[equipe1] = pointsEquipes[equipe1] + 1;
            pointsEquipes[equipe2] = pointsEquipes[equipe2] + 1;
            System.out.println("Match nul entre " + EQUIPES[equipe1] + " et " + EQUIPES[equipe2]);
        }
    }

    public static int[] trouveGagnants() {
        int[] equipeGagnante;

        //Recherche du maximum de points
        int maxPts = rechercheMaxPts();

        //Compte du nombre d'équipe avec le maximum de points
        int compteurDesGagnants = 0;
        for (int i = 0; i < EQUIPES.length; i++) {
            if (pointsEquipes[i] == maxPts) {
            compteurDesGagnants++;
            }
        }

        //remplissage du tableau des gagnants
        int compteur = 0;
        equipeGagnante = new int[compteurDesGagnants];
         for (int i = 0; i < EQUIPES.length; i++) {
            if (pointsEquipes[i] == maxPts) {
                equipeGagnante[compteur++] = i;
            }
        }

        //Retourne le tableau des gagnants
        return equipeGagnante;
    }

    public static int rechercheMaxPts(){
        int maxPts = 0;
         for (int i = 0; i < EQUIPES.length; i++) {
            if (pointsEquipes[i] > maxPts) {
                maxPts = pointsEquipes[i];
            }
        }

        return maxPts;

    }

