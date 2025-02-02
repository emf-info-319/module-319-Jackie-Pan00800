public class tblmultiplication {
    public final static int MIN =5;
    public final static int MAX=20;
    public static void main(String[] args) {
        int nombreAleatoire=choisirUnNombre(MIN, MAX);
        System.out.println(nombreAleatoire);
        int nombreAleatoire2=choisirUnNombre(MIN, MAX);
        System.out.println(nombreAleatoire2);
        int[] tableau=construireTableMultiplication(nombreAleatoire, nombreAleatoire2);
    }
    public static int choisirUnNombre(int min, int max){
        int randomAnswer=min +(int) ( Math.random() * (min|max-min));
        return randomAnswer;
    }
    public static String[] construireTableMultiplication(int nb1, int nb2) {

        String[] tab = new String[ nb1 *nb2];
        int nbDepart1 = 1;
        int nbDepart2 = 1;
        for (int i = 0; i < tab.length; i++) {
            tab[i] = nbDepart1 + " x " + nbDepart2 + " = " + nbDepart1 * nbDepart2;
            nbDepart2++;
            if (nbDepart2 == nb2 + 1) {
                nbDepart2 = 1;
                nbDepart1++;

            }
        }
        return 
    }
    
}
