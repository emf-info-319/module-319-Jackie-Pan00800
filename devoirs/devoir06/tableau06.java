package devoir06;

public class tableau06 {
    public final static int TAILLE_TABLEAU =20;
    public final static int VALEUR_MAX =50;
    public final static int VALEUR_MIN =0;
    public final static int VALEUR_RECHERCHEE=7;
    public static void main(String[] args) {
        int[] tableau=remplirAvecAleatoire(TAILLE_TABLEAU, VALEUR_MIN, VALEUR_MAX);
        afficherTableau(tableau);
    }
    public static int[] remplirAvecAleatoire(int taille, int min, int max) {
        taille=20;
        min=0;
        max=50;
        int[] tab=new int[taille];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = (int) ( Math.random() * (min|max)); // Valeurs aléatoires entre 0 et 20
        }
        return tab;
    }
    public static void afficherTableau(int[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("tab[" + i + "]=" + tableau[i]);
        }
    }
    
}
