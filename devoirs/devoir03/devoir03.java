package devoirs.devoir03;

public class devoir03 {
    public static void main(String[] args) {
        int jour = 24;
        int mois = 9;
        int annee = 2024;
        //je mets la date

        // J'écrit le nombre de jours par mois
        int[] joursParMois = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        // Je vérifie si l'année est bisextile
        boolean estBissextile = false;
        if (annee >= 0 && annee <= 9999) {
            if ((annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0)) {
                estBissextile = true;
            }
        }

        // Si l'année est bissextile, février a 29 jours
        if (estBissextile) {
            joursParMois[1] = 29;
        }
        int numeroJourAn = jour;
        if (mois >= 1 && mois <= 12) {
            // j'ajoute les jours des mois précédents
            for (int i = 0; i < mois - 1; i++) {
                numeroJourAn += joursParMois[i];
            }
        }

        // on affiche la réponse
        System.out.println("Le " + jour + "/" + mois + "/" + annee + " est le jour " + numeroJourAn + " de l'An.");
    }
}
//ça marche pas et je ne sais pas pourquoi...
//j'ai regarder plein de vidéo pour en arriver à ça...
    

